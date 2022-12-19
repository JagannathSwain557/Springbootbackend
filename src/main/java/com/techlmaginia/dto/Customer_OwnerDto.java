package com.techlmaginia.dto;

import java.util.Date;

public class Customer_OwnerDto {
	Long c_o_id;
	String c_id;
	String o_id;
	String startedFrom;
	String endedOn;
	String fixedRent;
	String securityDeposit;
	String isExisting;
	
	public Long getC_o_id() {
		return c_o_id;
	}

	public void setC_o_id(Long c_o_id) {
		this.c_o_id = c_o_id;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getO_id() {
		return o_id;
	}

	public void setO_id(String o_id) {
		this.o_id = o_id;
	}

	public String getStartedFrom() {
		return startedFrom;
	}

	public void setStartedFrom(String startedFrom) {
		this.startedFrom = startedFrom;
	}

	public String getEndedOn() {
		return endedOn;
	}

	public void setEndedOn(String endedOn) {
		this.endedOn = endedOn;
	}

	public String getFixedRent() {
		return fixedRent;
	}

	public void setFixedRent(String fixedRent) {
		this.fixedRent = fixedRent;
	}

	public String getSecurityDeposit() {
		return securityDeposit;
	}

	public void setSecurityDeposit(String securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	public String getIsExisting() {
		return isExisting;
	}

	public void setIsExisting(String isExisting) {
		this.isExisting = isExisting;
	}

	public Customer_OwnerDto(Long c_o_id, String c_id, String o_id, String startedFrom, String endedOn,
			String fixedRent, String securityDeposit, String isExisting) {
		super();
		this.c_o_id = c_o_id;
		this.c_id = c_id;
		this.o_id = o_id;
		this.startedFrom = startedFrom;
		this.endedOn = endedOn;
		this.fixedRent = fixedRent;
		this.securityDeposit = securityDeposit;
		this.isExisting = isExisting;
	}

	public Customer_OwnerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
