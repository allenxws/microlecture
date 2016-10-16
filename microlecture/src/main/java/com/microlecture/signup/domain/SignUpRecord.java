package com.microlecture.signup.domain;

import com.microlecture.common.domain.CommonDomain;

/**
 * Created by xuwushun on 2016/10/16.
 */
public class SignUpRecord extends CommonDomain{
    private Long id;
    private Long userId;
    private Long lectureId;
    private Double amount;
    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getLectureId() {
        return lectureId;
    }

    public void setLectureId(Long lectureId) {
        this.lectureId = lectureId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
