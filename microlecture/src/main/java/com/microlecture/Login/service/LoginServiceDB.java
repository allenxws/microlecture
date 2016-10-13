package com.microlecture.Login.service;

import com.microlecture.Login.dao.LoginMapper;
import com.microlecture.common.utils.AssertUtils;
import com.microlecture.common.utils.EncodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuwushun on 2016/9/30.
 */
@Service
public class LoginServiceDB {
	@Autowired
	LoginMapper loginMapper;

	public void validPassword(String userName, String password) {
		String decodedPassword = loginMapper.getPassword(userName);
		boolean valid = EncodeUtils.validPassword(password, decodedPassword);
		AssertUtils.assertTrue(valid, "wrong.username.or.password");
	}
}
