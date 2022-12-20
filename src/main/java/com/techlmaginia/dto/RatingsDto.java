package com.techlmaginia.dto;

public class RatingsDto {
	Long r_id;
	String o_id;
	String c_id;
	String customerName;
	String customerRating;
	String customerReview;
	String createdDate;
	String updatedDate;

	public Long getR_id() {
		return r_id;
	}

	public void setR_id(Long r_id) {
		this.r_id = r_id;
	}

	public String getO_id() {
		return o_id;
	}

	public void setO_id(String o_id) {
		this.o_id = o_id;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerRating() {
		return customerRating;
	}

	public void setCustomerRating(String customerRating) {
		this.customerRating = customerRating;
	}

	public String getCustomerReview() {
		return customerReview;
	}

	public void setCustomerReview(String customerReview) {
		this.customerReview = customerReview;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public RatingsDto(Long r_id, String o_id, String c_id, String customerName, String customerRating,
			String customerReview, String createdDate, String updatedDate) {
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

	public RatingsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
