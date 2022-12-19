package com.techlmaginia.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.annotation.Id;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import com.techlmaginia.dto.Customer_OwnerDto;
@Entity(name="Customer_OwnerEntity")
public class Customer_OwnerEntity {
	@Id
	Long c_o_id;
	Long c_id;
	Long o_id;	
	Date startedFrom;
	Date endedOn;
	Double fixedRent;
	Double securityDeposit;
	Boolean isExisting;
	
	public Long getC_o_id() {
		return c_o_id;
	}
	public void setC_o_id(Long c_o_id) {
		this.c_o_id = c_o_id;
	}
	public Long getC_id() {
		return c_id;
	}
	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}
	public Long getO_id() {
		return o_id;
	}
	public void setO_id(Long o_id) {
		this.o_id = o_id;
	}
	public Date getStartedFrom() {
		return startedFrom;
	}
	public void setStartedFrom(Date startedFrom) {
		this.startedFrom = startedFrom;
	}
	public Date getEndedOn() {
		return endedOn;
	}
	public void setEndedOn(Date endedOn) {
		this.endedOn = endedOn;
	}
	public Double getFixedRent() {
		return fixedRent;
	}
	public void setFixedRent(Double fixedRent) {
		this.fixedRent = fixedRent;
	}
	public Double getSecurityDeposit() {
		return securityDeposit;
	}
	public void setSecurityDeposit(Double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}
	public Boolean getIsExisting() {
		return isExisting;
	}
	public void setIsExisting(Boolean isExisting) {
		this.isExisting = isExisting;
	}
	
	public Customer_OwnerEntity(Long c_o_id, Long c_id, Long o_id, Date startedFrom, Date endedOn, Double fixedRent,
			Double securityDeposit, Boolean isExisting) {
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
	
	public Customer_OwnerEntity(Customer_OwnerDto cosOwn) throws ParseException
	{
		 SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		this.c_id =  Long.parseLong(cosOwn.getC_id());
		this.o_id = Long.parseLong(cosOwn.getO_id());
		this.startedFrom = sdf.parse(cosOwn.getStartedFrom());	
		this.endedOn = sdf.parse(cosOwn.getEndedOn());
		this.fixedRent = Double.parseDouble(cosOwn.getFixedRent());
		this.securityDeposit = Double.parseDouble(cosOwn.getSecurityDeposit());
		this.isExisting = Boolean.parseBoolean(cosOwn.getIsExisting());
	}
	public Customer_OwnerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
