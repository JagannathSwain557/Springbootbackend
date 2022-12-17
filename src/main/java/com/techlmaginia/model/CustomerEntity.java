package com.techlmaginia.model;

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
	String pin;
	String address;
	Date dob;
	String mobileNo;
	String email;
	String adharNo;
	Date createdDate;
	String imageChangePermission;
	String refPerson;
	String refPhone;
	String token_id;
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
	public CustomerEntity(Long c_id, String fullName, String userName, String country, String state, String city,
			String pin, String address, Date dob, String mobileNo, String email, String adharNo, Date createdDate,
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
	public CustomerEntity(CustomerDto comDto)
	{
		this.c_id=comDto.getC_id();
		this.fullName=comDto.getFullName();
		this.userName=comDto.getUserName();
		this.country=comDto.getCountry();
		this.state=comDto.getState();
		this.city=comDto.getCity();
		this.pin=comDto.getPin();
		this.address=comDto.getAddress();
		this.dob=new Date(System.currentTimeMillis());
		this.mobileNo=comDto.getMobileNo();
		this.email=comDto.getEmail();
		this.adharNo=comDto.getAdharNo();
		this.createdDate=new Date(System.currentTimeMillis());
		this.imageChangePermission=comDto.getImageChangePermission();
		this.refPerson=comDto.getRefPerson();
		this.refPhone=comDto.getRefPhone();
		this.token_id=comDto.getToken_id();
		this.o_id=comDto.getO_id();
	}
	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerEntity [c_id=" + c_id + ", fullName=" + fullName + ", userName=" + userName + ", country="
				+ country + ", state=" + state + ", city=" + city + ", pin=" + pin + ", address=" + address + ", dob="
				+ dob + ", mobileNo=" + mobileNo + ", email=" + email + ", adharNo=" + adharNo + ", createdDate="
				+ createdDate + ", imageChangePermission=" + imageChangePermission + ", refPerson=" + refPerson
				+ ", refPhone=" + refPhone + ", token_id=" + token_id + ", o_id=" + o_id + "]";
	}
	

}
