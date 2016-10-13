package com.microlecture.common.exception;

/**
 * Created by xuwushun on 2016/9/30.
 */
public class UnAuthorizedException extends RuntimeException {
	private String errorCode;
	private String errorMessage;

	public UnAuthorizedException() {

	}

	public UnAuthorizedException(String errorCode) {
		this.errorCode = errorCode;
	}

	public UnAuthorizedException(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
