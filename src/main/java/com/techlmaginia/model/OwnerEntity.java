package com.techlmaginia.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.springframework.data.annotation.Id;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import com.techlmaginia.dto.OwnerDto;
@Entity(name = "OwnerEntity")
public class OwnerEntity {
	@Id
	Long o_id;
	String fullName;
	String organization;
	String country;
	String state;
	String city;
	int pin;
	Date startedFrom;
	String location;
	Long mobileNo;
	Long altMobile;

	String o_type;
	String email;
	Long adharNo;
	Date endDate;
	Date createdDate;
	String tokenSeries;
	int totalSeats;
	int availableSeats;
	HashMap<String,Long> tokenMap;
	String maxRange;
	String minRange;
	String rm_types;
	String rating_avg;
	String disabled;
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
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Date getStartedFrom() {
		return startedFrom;
	}
	public void setStartedFrom(Date startedFrom) {
		this.startedFrom = startedFrom;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Long getAltMobile() {
		return altMobile;
	}
	public void setAltMobile(Long altMobile) {
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
	public Long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(Long adharNo) {
		this.adharNo = adharNo;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getTokenSeries() {
		return tokenSeries;
	}
	public void setTokenSeries(String tokenSeries) {
		this.tokenSeries = tokenSeries;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
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
	public OwnerEntity(Long o_id, String fullName, String organization, String country, String state, String city,
			int pin, Date startedFrom, String location, Long mobileNo, Long altMobile, String o_type, String email,
			Long adharNo, Date endDate, Date createdDate, String tokenSeries, int totalSeats, int availableSeats,
			HashMap<String, Long> tokenMap, String maxRange, String minRange, String rm_types, String rating_avg,
			String disabled) {
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
		this.availableSeats = availableSeats;
		this.tokenMap = tokenMap;
		this.maxRange = maxRange;
		this.minRange = minRange;
		this.rm_types = rm_types;
		this.rating_avg = rating_avg;
		this.disabled = disabled;
	}
	public OwnerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OwnerEntity(OwnerDto ownDto) throws ParseException {
		// TODO Auto-generated constructor stub
		 SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		 
		this.fullName = ownDto.getFullName();
		this.organization = ownDto.getOrganization();
		this.country = ownDto.getCountry();
		this.state = ownDto.getState();
		this.city = ownDto.getCity();
		this.pin = Integer.parseInt(ownDto.getPin());
		this.startedFrom = sdf.parse(ownDto.getStartedFrom());		
		this.location = ownDto.getLocation();
		this.mobileNo =Long.parseLong(ownDto.getMobileNo());
		this.altMobile = Long.parseLong(ownDto.getAltMobile());
		this.o_type = ownDto.getO_type();
		this.email = ownDto.getEmail();
		this.adharNo = Long.parseLong(ownDto.getAdharNo());
		this.endDate = sdf.parse(ownDto.getEndDate());	
		this.createdDate = sdf.parse(ownDto.getCreatedDate());	
		this.tokenSeries = ownDto.getTokenSeries();
		this.totalSeats = Integer.parseInt(ownDto.getTotalSeats());
		this.availableSeats =Integer.parseInt(ownDto.getAvailableSeats());
		this.tokenMap = ownDto.getTokenMap();
		this.maxRange = ownDto.getMaxRange();
		this.minRange = ownDto.getMinRange();
		this.rm_types = ownDto.getRm_types();
		this.rating_avg = ownDto.getRating_avg();
		this.disabled = ownDto.getDisabled();
	}
	
	
}
