package com.microlecture.user.dao;

import com.microlecture.user.domain.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by xuwushun on 2016/10/12.
 */
@Mapper
public interface UserMapper {
	@Select({"select id, phone_number, password, nick_name from user where id = #{id} limit 1"})
	@Results({
			@Result(property = "id", column = "id", id = true),
			@Result(property = "phoneNumber", column = "phone_number"),
			@Result(property = "password", column = "password"),
			@Result(property = "nickName", column = "nick_name")
	})
	User getByPrimaryKey(@Param("id") Long id);

	@Insert({"insert into user (phone_number, password, nick_name) values (#{phoneNumber}, #{password}, #{nickName})"})
	void insert(User user);

	@Select({
			"select user_name from user where is_deleted = 0 and id = #{id} limit 1"
	})
	String getNameByPrimaryKey(@Param("id") Long id);
}
