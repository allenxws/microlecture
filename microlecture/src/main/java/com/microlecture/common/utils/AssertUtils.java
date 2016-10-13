package com.microlecture.common.utils;


import com.microlecture.common.exception.BusinessException;
import com.microlecture.common.exception.UnAuthorizedException;
import org.springframework.util.Assert;

/**
 * Created by xuwushun on 2016/9/30.
 */
public class AssertUtils {
	public static void assertTrue(boolean toAssert, String errorCode) {
		try {
			Assert.isTrue(toAssert);
		} catch (IllegalArgumentException e) {
			throw new BusinessException(errorCode);
		}
	}

	public static void assertFalse(boolean toAssert, String errorCode) {
		try {
			Assert.isTrue(!toAssert);
		} catch (IllegalArgumentException e) {
			throw new BusinessException(errorCode);
		}
	}

	public static void AssertLogin(boolean isLogin, String errorCode) {
		try {
			Assert.isTrue(isLogin);
		} catch (IllegalArgumentException e) {
			throw new UnAuthorizedException(errorCode);
		}
	}

	public static void assertNotNull(Object object, String errorCode) {
		try {
			Assert.notNull(object);
		} catch (IllegalArgumentException e) {
			throw new BusinessException(errorCode);
		}
	}
}
