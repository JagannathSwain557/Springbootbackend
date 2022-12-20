package com.techlmaginia.dto;

import java.util.Date;
import java.util.HashMap;


public class OwnerDto {

	Long o_id;
	String fullName;
	String organization;
	String country;
	String state;
	String city;
	String pin;
	String startedFrom;
	String location;
	String mobileNo;
	String altMobile;

	String o_type;
	String email;
	String adharNo;
	String endDate;
	String createdDate;
	String tokenSeries;
	String totalSeats;
	String availableSeats;
	HashMap<String,Long> tokenMap;
	String maxRange;
	String minRange;
	String rm_types;
	String rating_avg;
	String disabled;
	String noOfRatings;
	public Long getO_id() {
		return o_id;
	}
	public void setO_id(Long o_id) {
		this.o_id = o_id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
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
	public String getStartedFrom() {
		return startedFrom;
	}
	public void setStartedFrom(String startedFrom) {
		this.startedFrom = startedFrom;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAltMobile() {
		return altMobile;
	}
	public void setAltMobile(String altMobile) {
		this.altMobile = altMobile;
	}
	public String getO_type() {
		return o_type;
	}
	public void setO_type(String o_type) {
		this.o_type = o_type;
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
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getTokenSeries() {
		return tokenSeries;
	}
	public void setTokenSeries(String tokenSeries) {
		this.tokenSeries = tokenSeries;
	}
	public String getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(String totalSeats) {
		this.totalSeats = totalSeats;
	}
	public HashMap<String, Long> getTokenMap() {
		return tokenMap;
	}
	public void setTokenMap(HashMap<String, Long> tokenMap) {
		this.tokenMap = tokenMap;
	}
	public String getMaxRange() {
		return maxRange;
	}
	public void setMaxRange(String maxRange) {
		this.maxRange = maxRange;
	}
	public String getMinRange() {
		return minRange;
	}
	public void setMinRange(String minRange) {
		this.minRange = minRange;
	}
	public String getRm_types() {
		return rm_types;
	}
	public void setRm_types(String rm_types) {
		this.rm_types = rm_types;
	}
	public String getRating_avg() {
		return rating_avg;
	}
	public void setRating_avg(String rating_avg) {
		this.rating_avg = rating_avg;
	}
	public String getDisabled() {
		return disabled;
	}
	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}
	
	public String getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(String availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	public String getNoOfRatings() {
		return noOfRatings;
	}
	public void setNoOfRatings(String noOfRatings) {
		this.noOfRatings = noOfRatings;
	}
	public OwnerDto(Long o_id, String fullName, String organization, String country, String state, String city,
			String pin, String startedFrom, String location, String mobileNo, String altMobile, String o_type,
			String email, String adharNo, String endDate, String createdDate, String tokenSeries, String totalSeats,
			HashMap<String, Long> tokenMap, String maxRange, String minRange, String rm_types, String rating_avg,
			String disabled,String availableSeats,String noOfRatings){
		super();
		this.o_id = o_id;
		this.fullName = fullName;
		this.organization = organization;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pin = pin;
		this.startedFrom = startedFrom;
		this.location = location;
		this.mobileNo = mobileNo;
		this.altMobile = altMobile;
		this.o_type = o_type;
		this.email = email;
		this.adharNo = adharNo;
		this.endDate = endDate;
		this.createdDate = createdDate;
		this.tokenSeries = tokenSeries;
		this.totalSeats = totalSeats;
		this.tokenMap = tokenMap;
		this.maxRange = maxRange;
		this.minRange = minRange;
		this.rm_types = rm_types;
		this.rating_avg = rating_avg;
		this.disabled = disabled;
		this.availableSeats=availableSeats;
		this.noOfRatings=noOfRatings;
	}
	public OwnerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
