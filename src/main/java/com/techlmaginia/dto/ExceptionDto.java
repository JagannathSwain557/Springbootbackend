package com.techlmaginia.dto;

import java.util.Date;

public class ExceptionDto {
	 Date date;
	 String message;
	 String details;
	String statusCode;
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
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public ExceptionDto(Date date, String message, String details, String statusCode) {
		super();
		this.date = date;
		this.message = message;
		this.details = details;
		this.statusCode = statusCode;
	}
	public ExceptionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
