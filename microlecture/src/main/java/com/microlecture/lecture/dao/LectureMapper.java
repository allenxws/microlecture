package com.microlecture.lecture.dao;

import com.microlecture.lecture.domain.Lecture;
import com.microlecture.lecture.request.ListLectureResponse;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

/**
 * Created by xuwushun on 2016/10/12.
 */
public interface LectureMapper {
    @SelectProvider(type = LectureSqlProvider.class, method = "list")
    List<ListLectureResponse> list(Map paramMap);
}
