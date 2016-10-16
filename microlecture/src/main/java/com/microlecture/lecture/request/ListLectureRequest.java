package com.microlecture.lecture.request;

import com.microlecture.common.request.CommonPhoneRequest;

/**
 * Created by xuwushun on 2016/10/16.
 */
public class ListLectureRequest extends CommonPhoneRequest {
    private String latitude;
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
