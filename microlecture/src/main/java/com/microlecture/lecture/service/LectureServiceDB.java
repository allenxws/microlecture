package com.microlecture.lecture.service;

import com.microlecture.common.reponse.CommonListResponse;
import com.microlecture.lecture.convertor.LectureConvertor;
import com.microlecture.lecture.dao.LectureMapper;
import com.microlecture.lecture.domain.Lecture;
import com.microlecture.lecture.request.ListLectureRequest;
import com.microlecture.lecture.request.ListLectureResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by xuwushun on 2016/10/15.
 */
@Service
public class LectureServiceDB {
	@Autowired
	LectureMapper lectureMapper;

	public CommonListResponse<ListLectureResponse> list(ListLectureRequest listLectureRequest) {
		Map paramMap = LectureConvertor.convertListLectureRequest(listLectureRequest);
		List<Lecture> lectureList = lectureMapper.list(paramMap);
		List<ListLectureResponse> listLectureResponses = LectureConvertor.convertToListLectureResponseList(lectureList);
		return new CommonListResponse(listLectureResponses);
	}
}
