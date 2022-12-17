package com.techlmaginia.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.techlmaginia.dto.CustomerDto;
import com.techlmaginia.model.CustomerEntity;
import com.techlmaginia.model.EnquiryEntity;
import com.techlmaginia.repository.CustomerRepository;
@Service
public class CustomerService {
	@Autowired
	CustomerRepository cosRep;
	List<CustomerEntity> list;
	public CustomerEntity saveCustomer(CustomerDto cosDto) throws ParseException {
		CustomerEntity savedCos = cosRep.save(new CustomerEntity(cosDto));
		return savedCos;
	}

	public List<CustomerEntity> getAllCustomer() {
		Iterable<CustomerEntity> enquiries = cosRep.findAll();
		ArrayList customerList = new ArrayList();
		enquiries.forEach(b -> customerList.add(b));
		return customerList;
	}

	public List<CustomerEntity> getCustomerByOid(Long o_id) {
		Iterable<CustomerEntity> customers = cosRep.costomerByO_id(o_id);
		ArrayList customerList = new ArrayList();
		customers.forEach(b -> customerList.add(b));
		return customerList;
	}
	public CustomerEntity updateCustomer(CustomerDto customerDetails,Long c_id) throws ParseException {
		CustomerEntity customer = cosRep.findById(c_id)
		        .orElseThrow();
		    	if( customerDetails.getEmail()!=null &&  !customerDetails.getEmail().isEmpty())
		    	customer.setEmail(customerDetails.getEmail());
		    	customer.setFullName(customerDetails.getFullName());
		    	if( customerDetails.getCountry()!=null &&  !customerDetails.getCountry().isEmpty())	
		    	customer.setCountry(customerDetails.getCountry());
		    	customer.setState(customerDetails.getState());
		    	customer.setCity(customerDetails.getCity());
		    	customer.setPin(customerDetails.getPin());
		    	customer.setMobileNo(customerDetails.getMobileNo());
		    	customer.setEmail(customerDetails.getEmail());
		    	customer.setAdharNo(customerDetails.getAdharNo());
		    	customer.setImageChangePermission(customerDetails.getImageChangePermission());
		        customer.setRefPerson(customerDetails.getRefPerson());
		        customer.setRefPhone(customerDetails.getRefPhone());
		        customer.setToken_id(customerDetails.getToken_id());
		        customer.setO_id(customerDetails.getO_id());
		        CustomerEntity updatedCustomer = cosRep.save(customer);
		        return updatedCustomer;
	}
	
	}  
	

