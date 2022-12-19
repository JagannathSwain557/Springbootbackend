package com.techlmaginia.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlmaginia.dto.CustomerDto;
import com.techlmaginia.model.CustomerEntity;
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
		Iterable<CustomerEntity> customers = cosRep.findAll();

		ArrayList customerList = new ArrayList();
		customers.forEach(b -> customerList.add(b));
		return customerList;
	}

	public List<CustomerEntity> getCustomerByOid(Long o_id) {
		Iterable<CustomerEntity> customers = cosRep.costomerByO_id(o_id);
		ArrayList customerList = new ArrayList();
		customers.forEach(b -> customerList.add(b));
		return customerList;
	}

	public CustomerEntity updateCustomer(CustomerDto customerDetails, Long c_id) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		CustomerEntity customer = cosRep.findById(c_id).get();

		if (customerDetails.getFullName() != null && !customerDetails.getFullName().isEmpty()) {
			customer.setFullName(customerDetails.getFullName());
		}
		if (customerDetails.getCountry() != null && !customerDetails.getCountry().isEmpty()) {
			customer.setCountry(customerDetails.getCountry());
		}
		if (customerDetails.getState() != null && !customerDetails.getState().isEmpty()) {
			customer.setState(customerDetails.getState());
		}
		if (customerDetails.getCity() != null && !customerDetails.getCity().isEmpty()) {
			customer.setCity(customerDetails.getCity());
		}
		if (customerDetails.getPin() != null && !customerDetails.getPin().isEmpty()) {
			customer.setPin(Integer.parseInt(customerDetails.getPin()));
		}
		if (customerDetails.getAddress() != null && !customerDetails.getAddress().isEmpty()) {
			customer.setAddress(customerDetails.getAddress());
		}
		if (customerDetails.getDob() != null && !customerDetails.getDob().isEmpty()) {
			customer.setDob(sdf.parse(customerDetails.getDob()));
		}
		if (customerDetails.getMobileNo() != null && !customerDetails.getMobileNo().isEmpty()) {
			customer.setMobileNo(Long.parseLong(customerDetails.getMobileNo()));
		}
		if (customerDetails.getEmail() != null && !customerDetails.getEmail().isEmpty()) {
			customer.setEmail(customerDetails.getEmail());
		}
		if (customerDetails.getAdharNo() != null && !customerDetails.getAdharNo().isEmpty()) {
			customer.setAdharNo(Long.parseLong(customerDetails.getAdharNo()));
		}
		if (customerDetails.getCreatedDate() != null && !customerDetails.getCreatedDate().isEmpty()) {
			customer.setCreatedDate(sdf.parse(customerDetails.getCreatedDate()));
		}
		if (customerDetails.getImageChangePermission() != null
				&& !customerDetails.getImageChangePermission().isEmpty()) {
			customer.setImageChangePermission(Boolean.parseBoolean(customerDetails.getImageChangePermission()));
		}
		if (customerDetails.getRefPerson() != null && !customerDetails.getRefPerson().isEmpty()) {
			customer.setRefPerson(customerDetails.getRefPerson());
		}
		if (customerDetails.getRefPhone() != null && !customerDetails.getRefPhone().isEmpty()) {
			customer.setRefPhone(Long.parseLong(customerDetails.getRefPhone()));
		}
		if (customerDetails.getToken_id() != null && !customerDetails.getToken_id().isEmpty()) {
			customer.setToken_id(customerDetails.getToken_id());
		}
		if (customerDetails.getO_id() != null && !customerDetails.getO_id().isEmpty()) {
			customer.setO_id(Long.parseLong(customerDetails.getO_id()));
		}

		CustomerEntity updatedCustomer = cosRep.save(customer);
		return updatedCustomer;
	}
	

}
