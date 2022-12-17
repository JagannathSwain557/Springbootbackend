package com.techlmaginia.dto;

import java.util.Date;

public class ExceptionDto {
	 Date date;
	 String message;
	
	String statusCode;
	 public ExceptionDto(Date date, String message, String statusCode) {
			super();
			this.date = date;
			this.message = message;
			this.statusCode = statusCode;
		}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return statusCode;
	}
	public void setDetails(String statusCode) {
		this.statusCode = statusCode;
	}
	
}
