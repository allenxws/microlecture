package com.microlecture.lecture.convertor;

import com.google.common.collect.Lists;
import com.microlecture.lecture.domain.Lecture;
import com.microlecture.lecture.request.ListLectureRequest;
import com.microlecture.lecture.response.GetLectureResponse;
import com.microlecture.lecture.response.ListLectureResponse;
import com.microlecture.signup.dao.SignUpMapper;
import com.microlecture.user.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuwushun on 2016/10/17.
 */
@Service
public class LectureConvertor {
	@Autowired
	UserMapper userMapper;
	@Autowired
	SignUpMapper signUpMapper;

	public static Map convertListLectureRequest(ListLectureRequest listLectureRequest) {
		Map<String, Object> map = new HashMap();
		map.put("latitude", listLectureRequest.getLatitude());
		map.put("longtitude", listLectureRequest.getLongitude());
		map.put("pageSize", listLectureRequest.getPageSize());
		map.put("lastItemId", listLectureRequest.getLastItemId());
		return map;
	}

	public static ListLectureResponse convertToListLectureResponse(Lecture lecture) {
		ListLectureResponse listLectureResponse = new ListLectureResponse();
		if (null == lecture) {
			return listLectureResponse;
		}
		listLectureResponse.setId(lecture.getId());
		listLectureResponse.setSubject(lecture.getSubject());
		listLectureResponse.setStartTime(lecture.getStartTime());
		listLectureResponse.setEndTime(lecture.getEndTime());
		listLectureResponse.setLowerPrice(lecture.getLowerPrice());
		listLectureResponse.setUpperPrice(lecture.getUpperPrice());
		return listLectureResponse;
	}

	public static List<ListLectureResponse> convertToListLectureResponseList(List<Lecture> lectures) {
		List<ListLectureResponse> listLectureResponses = Lists.newArrayList();
		if (CollectionUtils.isEmpty(lectures)) {
			return listLectureResponses;
		}
		for (Lecture lecture : lectures) {
			ListLectureResponse listLectureResponse = convertToListLectureResponse(lecture);
			listLectureResponses.add(listLectureResponse);
		}
		return listLectureResponses;
	}

	public GetLectureResponse convertToGetLectureResponse(Lecture lecture) {
		GetLectureResponse getLectureResponse = new GetLectureResponse();
		getLectureResponse.setName(lecture.getName());
		getLectureResponse.setUserName(userMapper.getNameByPrimaryKey(lecture.getUserId()));
		getLectureResponse.setStartTime(lecture.getStartTime());
		getLectureResponse.setEndTime(lecture.getEndTime());
		getLectureResponse.setSubject(lecture.getSubject());
		getLectureResponse.setContent(lecture.getContent());
		getLectureResponse.setLatitude(lecture.getLatitude());
		getLectureResponse.setLongitude(lecture.getLongitude());
		getLectureResponse.setLowerPrice(lecture.getLowerPrice());
		getLectureResponse.setUpperPrice(lecture.getUpperPrice());
		getLectureResponse.setMaxJoin(lecture.getMaxJoin());
		getLectureResponse.setNowJoin(signUpMapper.countSignUpNum(lecture.getId()));
		getLectureResponse.setStatus(lecture.getStatus());
		return getLectureResponse;
	}
}
