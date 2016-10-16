package com.microlecture.common.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by xuwushun on 2016/10/15.
 */
public class CommonListResponse<T> {
    private Integer index;
    private Integer size;
    @JsonProperty("total_page")
    private Integer totalPage;
    @JsonProperty("total_num")
    private Integer totalNum;
    @JsonProperty("last_item_id")
    private List<T> data;

    public CommonListResponse(){

    }

    public CommonListResponse(List<T> data){
        this.data = data;
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

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
