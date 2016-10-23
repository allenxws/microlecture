package com.microlecture.lecture.dao;

import com.microlecture.lecture.domain.Lecture;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by xuwushun on 2016/10/12.
 */
public interface LectureMapper {
	@SelectProvider(type = LectureSqlProvider.class, method = "list")
	@Results({
			@Result(property = "distance", column = "d"),
			@Result(property = "id", column = "id", id = true),
			@Result(property = "userId", column = "user_id"),
			@Result(property = "name", column = "name"),
			@Result(property = "subject", column = "subject"),
			@Result(property = "content", column = "content"),
			@Result(property = "latitude", column = "latitude"),
			@Result(property = "longitude", column = "longitude"),
			@Result(property = "startTime", column = "start_time"),
			@Result(property = "endTime", column = "end_time"),
			@Result(property = "lowerPrice", column = "lower_price"),
			@Result(property = "upperPrice", column = "upper_price"),
			@Result(property = "maxJoin", column = "max_join"),
			@Result(property = "status", column = "status"),
			@Result(property = "isDeleted", column = "is_deleted"),
			@Result(property = "createTime", column = "create_time"),
			@Result(property = "updateTime", column = "update_time")
	})
	List<Lecture> list(Map paramMap);

	@Select({
			"select id, user_id, name, subject, content, latitude, longitude, start_time, end_time, lower_price, upper_price" +
					", max_join, status, is_deleted, create_time, update_time where is_deleted = 0 and id = #{id}"
	})
	@Results({
			@Result(property = "distance", column = "d"),
			@Result(property = "id", column = "id", id = true),
			@Result(property = "userId", column = "user_id"),
			@Result(property = "name", column = "name"),
			@Result(property = "subject", column = "subject"),
			@Result(property = "content", column = "content"),
			@Result(property = "latitude", column = "latitude"),
			@Result(property = "longitude", column = "longitude"),
			@Result(property = "startTime", column = "start_time"),
			@Result(property = "endTime", column = "end_time"),
			@Result(property = "lowerPrice", column = "lower_price"),
			@Result(property = "upperPrice", column = "upper_price"),
			@Result(property = "maxJoin", column = "max_join"),
			@Result(property = "status", column = "status"),
			@Result(property = "isDeleted", column = "is_deleted"),
			@Result(property = "createTime", column = "create_time"),
			@Result(property = "updateTime", column = "update_time")
	})
	Lecture selectByPrimaryKey(@Param("id") Long id);

	@Insert({
			"insert into lecture (subject, content, latitude, longitude, start_time, end_time, lower_price, upper_price" +
					", max_join, status, is_deleted, create_time, update_time) values" +
					" (#{subject}, #{content}, #{latitude}, #{longitude}, #{startTime}, #{endTime}, #{lowerPrice}, #{upperPrice}" +
					", #{maxJoin}, 0, 0, now(), now())"
	})
	void insert(Lecture lecture);
}
