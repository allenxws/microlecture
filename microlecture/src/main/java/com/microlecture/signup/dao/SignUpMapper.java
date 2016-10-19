package com.microlecture.signup.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by xuwushun on 2016/10/16.
 */
@Mapper
public interface SignUpMapper {
	@Select({
			"select count(0) from sign_up_record where is_deleted = 0 and lecture_id = #{lectureId}"
	})
	int countSignUpNum(@Param("lectureId") Long lectureId);
}
