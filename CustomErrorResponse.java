package com.spring.rest.exception;

import java.sql.Timestamp;

public class CustomErrorResponse {
	
	private String status;
	private Timestamp timeStamp;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

}
