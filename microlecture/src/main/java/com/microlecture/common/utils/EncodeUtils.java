package com.microlecture.common.utils;

import org.mindrot.jbcrypt.BCrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by xuwushun on 2016/9/30.
 */
public class EncodeUtils {
	private static Logger logger = LoggerFactory.getLogger(EncodeUtils.class);

	public static String encodePassword(String origin) {
		String decoded = BCrypt.hashpw(origin, BCrypt.gensalt());
		return decoded;
	}

	public static boolean validPassword(String origin, String decoded) {
		boolean valid = BCrypt.checkpw(origin, decoded);
		return valid;
	}

	public static String generateTicket(String userName) {
		String afterSalt = userName + Math.random();
		return md5Encode(afterSalt);
	}

	public static String md5Encode(String toEncode) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			byte[] toEncodeBytes = toEncode.getBytes();
			messageDigest.update(toEncodeBytes);
			byte[] encodedBytes = messageDigest.digest();
			return byteArrayToHex(encodedBytes);
		} catch (NoSuchAlgorithmException e) {
			logger.info("md5 encode error, to encode String: " + toEncode);
		}
		return "";
	}

	public static String byteArrayToHex(byte[] byteArray) {
		char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		char[] resultCharArray = new char[byteArray.length * 2];
		int index = 0;
		for (byte b : byteArray) {
			resultCharArray[index++] = hexDigits[b >>> 4 & 0xf];
			resultCharArray[index++] = hexDigits[b & 0xf];
		}
		return new String(resultCharArray);
	}
}
