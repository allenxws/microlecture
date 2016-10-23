package com.microlecture.lecture.controller;

import com.microlecture.common.reponse.CommonListResponse;
import com.microlecture.common.reponse.CommonResponse;
import com.microlecture.lecture.request.AddLectureRequest;
import com.microlecture.lecture.request.ListLectureRequest;
import com.microlecture.lecture.response.GetLectureResponse;
import com.microlecture.lecture.response.ListLectureResponse;
import com.microlecture.lecture.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public GetLectureResponse get(@RequestParam("id") Long id) {
		return lectureService.get(id);
	}

	@RequestMapping(value = "/add", method = RequestMethod.PUT)
	public CommonResponse add(@RequestBody AddLectureRequest addLectureRequest){
		return lectureService.add(addLectureRequest);
	}
}
