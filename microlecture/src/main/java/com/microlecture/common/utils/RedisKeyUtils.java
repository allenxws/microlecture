package com.microlecture.common.utils;

import com.microlecture.common.GlobalConstants;

/**
 * Created by xuwushun on 2016/10/8.
 */
public class RedisKeyUtils {

	/**
	 * 由于ticket在redis中分别以userName和ticket作为key保存2次，所以需要分别取得以ticket和userName作为key的字符串
	 * 本方法以“ticketKey:”为前缀，拼上userName作为key
	 *
	 * @param userName
	 * @return
	 */
	public static String getTicketKey(String userName) {
		StringBuilder ticketKey = new StringBuilder();
		return ticketKey.append(GlobalConstants.REDIS_TICKET_KEY).append(GlobalConstants.REDIS_KEY_SEPERATOR).append(userName).toString();
	}

	/**
	 * 由于ticket在redis中分别以userName和ticket作为key保存2次，所以需要分别取得以ticket和userName作为key的字符串
	 * 本方法以“ticketValue:”为前缀，拼上ticket作为key
	 *
	 * @param ticket
	 * @return
	 */
	public static String getTicketValue(String ticket) {
		StringBuilder ticketValue = new StringBuilder();
		return ticketValue.append(GlobalConstants.REDIS_TICKET_VALUE).append(GlobalConstants.REDIS_KEY_SEPERATOR).append(ticket).toString();
	}
}
