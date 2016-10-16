package com.microlecture.lecture.service;

import com.microlecture.common.reponse.CommonListResponse;
import com.microlecture.lecture.request.ListLectureRequest;
import com.microlecture.lecture.request.ListLectureResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xuwushun on 2016/10/12.
 */
public class LectureService {
    @Autowired
    LectureServiceDB lectureServiceDB;
    public CommonListResponse<ListLectureResponse> list(ListLectureRequest listLectureRequest){
        return lectureServiceDB.list(listLectureRequest);
    }
}
