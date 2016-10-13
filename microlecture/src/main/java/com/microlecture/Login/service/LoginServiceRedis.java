package com.microlecture.Login.service;

import com.microlecture.common.GlobalConstants;
import com.microlecture.common.utils.EncodeUtils;
import com.microlecture.common.utils.RedisKeyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;

/**
 * Created by xuwushun on 2016/9/30.
 */
@Service
public class LoginServiceRedis {
	@Autowired
	Jedis jedis;

	public String getTicketByUser(String userName) {
		String ticket = jedis.get(userName);
		if (StringUtils.isEmpty(ticket)) {
			ticket = addTicket(userName);
		}
		return ticket;
	}

	public void logout(String ticket) {
		String redisTicketValue = RedisKeyUtils.getTicketValue(ticket);
		String userName = jedis.get(redisTicketValue);
		jedis.del(redisTicketValue);
		String redisTicketKey = RedisKeyUtils.getTicketKey(userName);
		jedis.del(redisTicketKey);

	}

	public String addTicket(String userName) {
		String redisTicketKey = RedisKeyUtils.getTicketKey(userName);
		String ticket = EncodeUtils.generateTicket(userName);
		String redisTicketValue = RedisKeyUtils.getTicketValue(ticket);
		jedis.set(redisTicketKey, ticket);
		jedis.set(redisTicketValue, userName);
		return ticket;
	}

	public boolean isTicketExists(String ticket) {
		if (StringUtils.isEmpty(ticket)) {
			return false;
		}
		String redisTicketValue = RedisKeyUtils.getTicketValue(ticket);
		String userName = jedis.get(redisTicketValue);
		return !StringUtils.isEmpty(userName);
	}

	public String getUserNameByTicket(String ticket) {
		String redisTicketValue = RedisKeyUtils.getTicketValue(ticket);
		String userNameKey = jedis.get(redisTicketValue);
		if (StringUtils.isEmpty(userNameKey)) {
			return null;
		}
		return userNameKey.split(GlobalConstants.REDIS_KEY_SEPERATOR)[1];
	}
}
