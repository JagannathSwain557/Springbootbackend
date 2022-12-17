package com.techlmaginia.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerDto {
	Long c_id;
	@NotEmpty(message = "please enter fullName")
	@Size(min = 4, message = "minimum 4 charecter only")
	@Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Only Charecters with spaces")
	
	String fullName;
	@NotEmpty(message = "please enter userName")
	@Size(min = 4, message = "minimum 4 charecter only")
	@Pattern(regexp = "^[a-zA-Z0-9\\s]+$", message = "Only Charecters with spaces")
	
	String userName;
	@NotEmpty(message = "please enter country")
	String country;
	@NotEmpty(message = "please enter state")
	String state;
	@NotEmpty(message = "please enter city")
	String city;
	@NotEmpty(message = "please enter pin")
	@Pattern(regexp = "[0-9]+", message = "Only 10 digits nos allowed")
	String pin;
	@NotEmpty(message = "please enter address")
	String address;
	
	Date dob;
	@NotEmpty(message = "please enter phoneNo")
	@Size(min = 10, max = 10, message = "10 digit nos only")
	@Pattern(regexp = "[0-9]+", message = "Only 10 digits nos allowed")
	String mobileNo;
	@NotEmpty(message = "please enter Email")
	@Email(message = "please enter a valid email")
	String email;
	@NotEmpty(message = "please enter adharNo")
	@Size(min = 16, max = 16, message = "10 digit nos only")
	@Pattern(regexp = "[0-9]+", message = "Only 16 digits nos allowed")
	String adharNo;
	
	Date createdDate;
	@NotEmpty(message = "please enter imageChangePermission")
	String imageChangePermission;
	@NotEmpty(message = "please enter refPerson")
	@Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Only Charecters with spaces")
	String refPerson;
	@NotEmpty(message = "please enter refPhone")

	@Pattern(regexp = "[0-9]+", message = "Only 10 digits nos allowed")
	String refPhone;
	@NotEmpty(message = "please enter token_id")
	@Pattern(regexp = "^[a-zA-Z0-9\\s]+$", message = "Only Charecters and number with spaces")
	
	String token_id;
	@Pattern(regexp = "[0-9]+", message = "Only 10 digits nos allowed")
	@NotEmpty(message = "please enter oid")
	String o_id;
	public Long getC_id() {
		return c_id;
	}
	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getImageChangePermission() {
		return imageChangePermission;
	}
	public void setImageChangePermission(String imageChangePermission) {
		this.imageChangePermission = imageChangePermission;
	}
	public String getRefPerson() {
		return refPerson;
	}
	public void setRefPerson(String refPerson) {
		this.refPerson = refPerson;
	}
	public String getRefPhone() {
		return refPhone;
	}
	public void setRefPhone(String refPhone) {
		this.refPhone = refPhone;
	}
	public String getToken_id() {
		return token_id;
	}
	public void setToken_id(String token_id) {
		this.token_id = token_id;
	}
	public String getO_id() {
		return o_id;
	}
	public void setO_id(String o_id) {
		this.o_id = o_id;
	}
	public CustomerDto(Long c_id, String fullName, String userName, String country, String state, String city, String pin,
			String address, Date dob, String mobileNo, String email, String adharNo, Date createdDate,
			String imageChangePermission, String refPerson, String refPhone, String token_id, String o_id) {
		super();
		this.c_id = c_id;
		this.fullName = fullName;
		this.userName = userName;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pin = pin;
		this.address = address;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.email = email;
		this.adharNo = adharNo;
		this.createdDate = createdDate;
		this.imageChangePermission = imageChangePermission;
		this.refPerson = refPerson;
		this.refPhone = refPhone;
		this.token_id = token_id;
		this.o_id = o_id;
	}
	public CustomerDto() {
		super();
	}
}
