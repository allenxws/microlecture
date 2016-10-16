package com.microlecture.common.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microlecture.common.GlobalConstants;

/**
 * Created by xuwushun on 2016/10/16.
 */
public class CommonPhoneRequest {
    @JsonProperty("last_item_id")
    private Long lastItemId;
    @JsonProperty("page_size")
    public Integer pageSize;

    public CommonPhoneRequest(){

    }

    private CommonPhoneRequest(Long lastItemId, Integer pageSize){
        this.lastItemId = lastItemId;
        this.pageSize = pageSize;
        if (null == this.lastItemId || this.lastItemId < 0){
            this.lastItemId = 0L;
        }
        if (null == this.pageSize){
            this.pageSize = GlobalConstants.COMMON_PAGE_SIZE;
        }
    }

    public Long getLastItemId() {
        return lastItemId;
    }

    public void setLastItemId(Long lastItemId) {
        this.lastItemId = lastItemId;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
