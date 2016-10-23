package com.microlecture.lecture.service;

import com.microlecture.common.reponse.CommonListResponse;
import com.microlecture.common.reponse.CommonResponse;
import com.microlecture.lecture.request.AddLectureRequest;
import com.microlecture.lecture.request.ListLectureRequest;
import com.microlecture.lecture.response.GetLectureResponse;
import com.microlecture.lecture.response.ListLectureResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xuwushun on 2016/10/12.
 */
public class LectureService {
	@Autowired
	LectureServiceDB lectureServiceDB;

	public CommonListResponse<ListLectureResponse> list(ListLectureRequest listLectureRequest) {
		return lectureServiceDB.list(listLectureRequest);
	}

	public GetLectureResponse get(Long id) {
		return lectureServiceDB.get(id);
	}

	public CommonResponse add(AddLectureRequest addLectureRequest) {
		return lectureServiceDB.add(addLectureRequest);
	}
}
