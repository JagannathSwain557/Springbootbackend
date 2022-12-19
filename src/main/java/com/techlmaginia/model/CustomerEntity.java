package com.techlmaginia.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.annotation.Id;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import com.techlmaginia.dto.CustomerDto;
@Entity(name="CustomerEntity")
public class CustomerEntity {
	@Id
	Long c_id;
	String fullName;
	String userName;
	String country;
	String state;
	String city;
	int pin;
	String address;
	Date dob;
	Long mobileNo;
	String email;
	Long adharNo;
	Date createdDate;
	boolean imageChangePermission;
	String refPerson;
	Long refPhone;
	String token_id;
	Long o_id;
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
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
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
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(Long adharNo) {
		this.adharNo = adharNo;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public boolean isImageChangePermission() {
		return imageChangePermission;
	}
	public void setImageChangePermission(boolean imageChangePermission) {
		this.imageChangePermission = imageChangePermission;
	}
	public String getRefPerson() {
		return refPerson;
	}
	public void setRefPerson(String refPerson) {
		this.refPerson = refPerson;
	}
	public Long getRefPhone() {
		return refPhone;
	}
	public void setRefPhone(Long refPhone) {
		this.refPhone = refPhone;
	}
	public String getToken_id() {
		return token_id;
	}
	public void setToken_id(String token_id) {
		this.token_id = token_id;
	}
	public Long getO_id() {
		return o_id;
	}
	public void setO_id(Long o_id) {
		this.o_id = o_id;
	}
	public CustomerEntity(Long c_id, String fullName, String userName, String country, String state, String city,
			int pin, String address, Date dob, Long mobileNo, String email, Long adharNo, Date createdDate,
			boolean imageChangePermission, String refPerson, Long refPhone, String token_id, Long o_id) {
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
	
	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerEntity(CustomerDto cosDto) throws ParseException {
		// TODO Auto-generated constructor stub
		 SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		this.fullName = cosDto.getFullName();
		this.userName = cosDto.getUserName();
		this.country = cosDto.getCountry();
		this.state = cosDto.getState();
		this.city = cosDto.getCity();
		this.pin = Integer.parseInt(cosDto.getPin());
		this.address = cosDto.getAddress();
		this.dob = sdf.parse(cosDto.getDob());	
		this.mobileNo =  Long.parseLong(cosDto.getMobileNo());
		this.email = cosDto.getEmail();
		this.adharNo = Long.parseLong(cosDto.getAdharNo());
		this.createdDate = new Date();	
		this.imageChangePermission = Boolean.parseBoolean(cosDto.getImageChangePermission());
		this.refPerson = cosDto.getRefPerson();
		this.refPhone =Long.parseLong(cosDto.getRefPhone());
		this.token_id = cosDto.getToken_id();
		this.o_id = Long.parseLong(cosDto.getO_id());
	}
	
}
