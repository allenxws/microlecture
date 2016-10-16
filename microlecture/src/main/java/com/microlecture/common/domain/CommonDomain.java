package com.microlecture.common.domain;

import java.util.Date;

/**
 * Created by xuwushun on 2016/10/16.
 */
public class CommonDomain {
    private Byte isDeleted;
    private Date createTime;
    private Date updateTime;

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
