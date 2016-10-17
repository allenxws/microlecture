package com.microlecture.lecture.controller;

import com.microlecture.common.reponse.CommonListResponse;
import com.microlecture.lecture.request.ListLectureRequest;
import com.microlecture.lecture.request.ListLectureResponse;
import com.microlecture.lecture.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xuwushun on 2016/10/12.
 */
@Controller
@RequestMapping("/lecture")
public class LectureController {
	@Autowired
	LectureService lectureService;

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public CommonListResponse<ListLectureResponse> list(@RequestBody ListLectureRequest listLectureRequest) {
		return lectureService.list(listLectureRequest);
	}
}
