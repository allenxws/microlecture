package com.microlecture.user.controller;

import com.microlecture.user.domain.User;
import com.microlecture.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xuwushun on 2016/10/12.
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public User get(@RequestParam("id") Long id){
		return userService.get(id);
	}
}
