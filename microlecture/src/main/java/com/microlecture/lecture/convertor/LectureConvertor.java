package com.microlecture.lecture.convertor;

import com.google.common.collect.Lists;
import com.microlecture.lecture.domain.Lecture;
import com.microlecture.lecture.request.ListLectureRequest;
import com.microlecture.lecture.request.ListLectureResponse;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuwushun on 2016/10/17.
 */
public class LectureConvertor {
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
}
