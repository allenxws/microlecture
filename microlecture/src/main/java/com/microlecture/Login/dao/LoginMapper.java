package com.microlecture.Login.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by xuwushun on 2016/9/30.
 */
@Mapper
public interface LoginMapper {
	@Select("select password from user where name = #{userName} limit 1")
	String getPassword(@Param("userName") String userName);
}
