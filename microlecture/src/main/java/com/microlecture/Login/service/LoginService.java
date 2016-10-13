package com.microlecture.Login.service;


import com.microlecture.Login.request.LoginRequest;
import com.microlecture.Login.response.LoginResponse;
import com.microlecture.common.GlobalConstants;
import com.microlecture.common.utils.AssertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xuwushun on 2016/9/30.
 */
@Service
public class LoginService {
	@Autowired
	LoginServiceDB loginServiceDB;
	@Autowired
	LoginServiceRedis loginServiceRedis;

	public LoginResponse login(LoginRequest loginRequest, HttpServletRequest request) {
		boolean isLogin = loginServiceRedis.isTicketExists(request.getHeader(GlobalConstants.TICKET_HEADER));
		AssertUtils.assertFalse(isLogin, "user.already.login");
		loginServiceDB.validPassword(loginRequest.getUserName(), loginRequest.getPassword());
		String ticket = loginServiceRedis.getTicketByUser(loginRequest.getUserName());
		LoginResponse loginResponse = new LoginResponse();
		loginResponse.setTicket(ticket);
		return loginResponse;
	}

	public void logout(HttpServletRequest request) {
		String ticket = request.getHeader(GlobalConstants.TICKET_HEADER);
		boolean isLogin = loginServiceRedis.isTicketExists(ticket);
		AssertUtils.AssertLogin(isLogin, "user.not.login");
		loginServiceRedis.logout(ticket);
	}
}
