package com.microlecture.lecture.service;

import com.microlecture.common.reponse.CommonListResponse;
import com.microlecture.lecture.dao.LectureMapper;
import com.microlecture.lecture.request.ListLectureRequest;
import com.microlecture.lecture.request.ListLectureResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuwushun on 2016/10/15.
 */
@Service
public class LectureServiceDB {
    @Autowired
    LectureMapper lectureMapper;
    public CommonListResponse<ListLectureResponse> list(ListLectureRequest listLectureRequest){
        Map paramMap = getParamMap(listLectureRequest);
        List<ListLectureResponse> listLectureResponses = lectureMapper.list(paramMap);
        return new CommonListResponse<>();
    }

    public Map getParamMap(ListLectureRequest listLectureRequest){
        Map<String, Object> map = new HashMap();
        map.put("latitude", listLectureRequest.getLatitude());
        map.put("longtitude", listLectureRequest.getLongitude());
        map.put("pageSize", listLectureRequest.getPageSize());
        return map;
    }
}
