package com.microlecture.user.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by xuwushun on 2016/10/12.
 */
public class User {
	private Long id;
	@JsonProperty("user_name")
	private String userName;
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
