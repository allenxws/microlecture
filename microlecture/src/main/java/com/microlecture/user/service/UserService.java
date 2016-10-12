package com.microlecture.user.service;

import com.microlecture.user.dao.UserMapper;
import com.microlecture.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuwushun on 2016/10/12.
 */
@Service
public class UserService {
	@Autowired
	UserMapper userMapper;

	public User get(Long id) {
		return userMapper.getByPrimaryKey(id);
	}
}
