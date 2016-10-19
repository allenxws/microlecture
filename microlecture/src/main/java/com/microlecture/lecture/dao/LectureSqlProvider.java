package com.microlecture.lecture.dao;

import java.util.Map;

/**
 * Created by xuwushun on 2016/10/16.
 */
public class LectureSqlProvider {
	public String list(Map paramMap) {
		Double latitude = (Double) paramMap.get("latitude");
		Double longitude = (Double) paramMap.get("longitude");
		StringBuilder sql = new StringBuilder();
		sql.append("select ");
		if (null != latitude && null != longitude) {
			sql.append("(power(t.latitude-#{latitude}, 2)+power(t.longitude-#{longitude}, 2)) d, ");
		}
		sql.append("id, user_id, name, subject, content, latitude, longitude, start_time, end_time, lower_price, upper_price" +
				", max_join, status, is_deleted, create_time, update_time");
		sql.append(" from lecture t where id > #{lastItemId} and t.is_deleted = 0 and t.start_time > now()");
		if (null != latitude && null != longitude) {
			sql.append(" order by d desc limit #{pageSize}");
		}
		return sql.toString();
	}
}
