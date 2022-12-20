package com.techlmaginia.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.annotation.Id;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import com.techlmaginia.dto.RatingsDto;
@Entity(name="RatingsEntity")
public class RatingsEntity {
	@Id
	Long r_id;
	Long o_id;
	Long c_id;
	String customerName;
	Double customerRating;
	String customerReview;
	Date createdDate;
	Date updatedDate;

	public Long getR_id() {
		return r_id;
	}
	public void setR_id(Long r_id) {
		this.r_id = r_id;
	}
	public Long getO_id() {
		return o_id;
	}
	public void setO_id(Long o_id) {
		this.o_id = o_id;
	}
	public Long getC_id() {
		return c_id;
	}
	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Double getCustomerRating() {
		return customerRating;
	}
	public void setCustomerRating(Double customerRating) {
		this.customerRating = customerRating;
	}
	public String getCustomerReview() {
		return customerReview;
	}
	public void setCustomerReview(String customerReview) {
		this.customerReview = customerReview;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public RatingsEntity(Long r_id, Long o_id, Long c_id, String customerName, Double customerRating,
			String customerReview, Date createdDate, Date updatedDate) {
		super();
		this.r_id = r_id;
		this.o_id = o_id;
		this.c_id = c_id;
		this.customerName = customerName;
		this.customerRating = customerRating;
		this.customerReview = customerReview;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	public RatingsEntity(RatingsDto ratDto) throws ParseException {
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		this.o_id =  Long.parseLong(ratDto.getO_id());
		this.c_id = Long.parseLong(ratDto.getC_id());
		this.customerName = ratDto.getCustomerName();
		this.customerRating = Double.parseDouble(ratDto.getCustomerRating());
		this.customerReview = ratDto.getCustomerReview();
		this.createdDate = sdf.parse(ratDto.getCreatedDate());		
		this.updatedDate = sdf.parse(ratDto.getUpdatedDate());	
	}
	public RatingsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
