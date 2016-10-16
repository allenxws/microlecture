package com.microlecture.lecture.domain;

import com.microlecture.common.domain.CommonDomain;

import java.util.Date;

/**
 * Created by xuwushun on 2016/10/12.
 */
public class Lecture extends CommonDomain{
    private Long id;
    private String name;
    private String subject;
    private String content;
    private String latitude;
    private String longitude;
    private Date startTime;
    private Date endTime;
    private Double lowerPrice;
    private Double upperPrice;
    private Integer maxJoin;
    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

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

    public Double getLowerPrice() {
        return lowerPrice;
    }

    public void setLowerPrice(Double lowerPrice) {
        this.lowerPrice = lowerPrice;
    }

    public Double getUpperPrice() {
        return upperPrice;
    }

    public void setUpperPrice(Double upperPrice) {
        this.upperPrice = upperPrice;
    }

    public Integer getMaxJoin() {
        return maxJoin;
    }

    public void setMaxJoin(Integer maxJoin) {
        this.maxJoin = maxJoin;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
