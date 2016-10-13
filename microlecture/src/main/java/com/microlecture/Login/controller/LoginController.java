package com.microlecture.Login.controller;

import com.microlecture.Login.request.LoginRequest;
import com.microlecture.Login.response.LoginResponse;
import com.microlecture.Login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xuwushun on 2016/10/12.
 */
@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public LoginResponse login(@RequestBody LoginRequest loginRequest, HttpServletRequest request) {
		return loginService.login(loginRequest, request);
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public void logout(HttpServletRequest request) {
		loginService.logout(request);
	}
}
