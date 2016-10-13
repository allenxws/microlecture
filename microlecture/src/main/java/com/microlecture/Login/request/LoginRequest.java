package com.microlecture.Login.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;

/**
 * Created by xuwushun on 2016/9/30.
 */
public class LoginRequest {
	@JsonProperty(value = "username")
	@NotNull
	private String userName;
	@NotNull
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
