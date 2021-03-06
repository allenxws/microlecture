package com.microlecture.user.service;

import com.microlecture.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuwushun on 2016/10/12.
 */
@Service
public class UserService {
	@Autowired
	UserServiceDB userServiceDB;

	public User get(Long id) {
		return userServiceDB.get(id);
	}

	public void add(User user) {
		userServiceDB.add(user);
	}
}
