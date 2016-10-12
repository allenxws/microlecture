package com.microlecture.user.dao;

import com.microlecture.user.domain.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by xuwushun on 2016/10/12.
 */
@Mapper
public interface UserMapper {
	@Select({"select id, user_name, password from user where id = #{id} limit 1"})
	@Results({
			@Result(property = "id", column = "id", id = true),
			@Result(property = "userName", column = "user_name"),
			@Result(property = "password", column = "password")
	})
	User getByPrimaryKey(@Param("id") Long id);
}
