package com.microlecture.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Created by xuwushun on 2016/9/30.
 */
public class BusinessExceptionHandler extends HandlerInterceptorAdapter {
	@ExceptionHandler(BusinessException.class)
	@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
	public void HandleBusinessException(BusinessException businessException) {

	}
}
