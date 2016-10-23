package com.microlecture.common.reponse;

/**
 * Created by xuwushun on 2016/10/23.
 */
public class CommonResponse<T> {
	private String code = "success";
	private String message = "成功";
	private T data;

	public CommonResponse() {

	}

	public CommonResponse(T t) {
		this.data = t;
	}

	public CommonResponse(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
