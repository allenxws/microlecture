package com.microlecture.common.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microlecture.common.GlobalConstants;

/**
 * Created by xuwushun on 2016/10/16.
 */
public class CommonWebRequest {
    @JsonProperty("page_index")
    private Integer index;
    @JsonProperty("page_size")
    private Integer size;
    private Integer lowerBound;
    private Integer higherBound;

    private CommonWebRequest(){

    }

    private CommonWebRequest(Integer index, Integer size){
        this.index = index;
        this.size = size;
        if (null == this.index || this.index < 1){
            this.index = 1;
        }
        if (null == this.size){
            this.size = GlobalConstants.COMMON_PAGE_SIZE;
        }
        this.lowerBound = (this.index - 1) * this.size;
        this.higherBound = (this.index) * this.size;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(Integer lowerBound) {
        this.lowerBound = lowerBound;
    }

    public Integer getHigherBound() {
        return higherBound;
    }

    public void setHigherBound(Integer higherBound) {
        this.higherBound = higherBound;
    }
}
