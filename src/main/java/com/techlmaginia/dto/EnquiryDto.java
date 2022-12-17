package com.techlmaginia.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EnquiryDto {

	Long id;
	@NotEmpty(message = "please enter fullName")
	@Size(min = 4, message = "minimum 4 charecter only")
	@Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Only Charecters with spaces")
	String fullName;
	@NotEmpty(message = "please enter Email")
	@Email(message = "please enter a valid email")
	String email;
	@NotEmpty(message = "please enter phoneNo")
	@Size(min = 10, max = 10, message = "10 digit nos only")
	@Pattern(regexp = "[0-9]+", message = "Only 10 digits nos allowed")
	String phoneNo;
	@NotEmpty(message = "please enter Organization")
	String organization;
	@NotEmpty(message = "please enter Subject")
	String subject;
	@NotEmpty(message = "please enter Content")
	String content;

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

	public EnquiryDto(Long id, String fullName, String email, String phoneNo, String organization, String subject,
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

	public EnquiryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * String fullName= "smith23"; if (Pattern.matches("[a-zA-Z]+",s)) { // Do
	 * something System.out.println("Yes, string contains letters only"); }else{
	 * System.out.println("Nope, Other characters detected"); }
	 */
}
