package com.techlmaginia.model;

import java.text.ParseException;
import java.util.Date;

import org.springframework.data.annotation.Id;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import com.techlmaginia.dto.EnquiryDto;

@Entity(name = "EnquiryEntity")
public class EnquiryEntity {

	@Id

	Long id;

	String fullName;

	String email;

	String phoneNo;

	String organization;

	String subject;

	String content;

	Date createdDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

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

	public EnquiryEntity(Long id, String fullName, String email, String phoneNo, String organization, String subject,
			String content) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.organization = organization;
		this.subject = subject;
		this.content = content;
	}

	public EnquiryEntity(EnquiryDto enqDto) throws ParseException {
		super();
		//this.id = id;
		this.fullName = enqDto.getFullName();
		this.email = enqDto.getEmail();
		this.phoneNo = enqDto.getPhoneNo();
		this.organization = enqDto.getOrganization();
		this.subject = enqDto.getSubject();
		this.content = enqDto.getContent();
		this.createdDate = new Date(System.currentTimeMillis());
		/*
		 * String startDate=enqDto.getDate(); // Input String SimpleDateFormat sdf1 =
		 * new SimpleDateFormat("dd-MM-yyyy"); // New Pattern java.util.Date date =
		 * sdf1.parse(startDate); // Returns a Date format object with the pattern
		 * java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
		 * this.createdDate=sqlStartDate;
		 */

	}

	public EnquiryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "EnquiryEntity [id=" + id + ", fullName=" + fullName + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", organization=" + organization + ", subject=" + subject + ", content=" + content + ", createdDate="
				+ createdDate + "]";
	}
}
