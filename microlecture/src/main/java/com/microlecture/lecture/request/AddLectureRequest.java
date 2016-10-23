package com.microlecture.lecture.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by xuwushun on 2016/10/23.
 */
public class AddLectureRequest {
	private String subject;
	private String content;
	private String latitude;
	private String longitude;
	@JsonProperty("start_time")
	private Date startTime;
	@JsonProperty("end_time")
	private Date endTime;
	@JsonProperty("lower_price")
	private Double lowerPrice;
	@JsonProperty("upper_price")
	private Double upperPrice;
	@JsonProperty("max_join")
	private Integer maxJoin;

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
}
