package com.techlmaginia.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techlmaginia.dto.CustomerDto;
import com.techlmaginia.model.CustomerEntity;
import com.techlmaginia.model.EnquiryEntity;
import com.techlmaginia.repository.CustomerRepository;
import com.techlmaginia.service.CustomerService;

@RestController
@RequestMapping(value = "/v1/autohome")
@CrossOrigin("*")
public class CustomerController {
	@Autowired
	CustomerService cosService;
	@Autowired
	CustomerRepository cosRep;
	@GetMapping(value = "/test")
	public String test() {
		return "success";
	}

	@PostMapping(value = "/customer/create", consumes = { "application/xml", "application/json" })
	public ResponseEntity<CustomerEntity> saveCustomer(@Valid @RequestBody CustomerDto cosDto) throws ParseException {
		CustomerEntity savedCostomer = cosService.saveCustomer(cosDto);
		return new ResponseEntity<CustomerEntity>(savedCostomer, HttpStatus.OK);
	}
	@GetMapping("/customer/getall")
	public ResponseEntity<List<CustomerEntity>> getAllCustomers() {
		return new ResponseEntity<List<CustomerEntity>>(cosService.getAllCustomer(), HttpStatus.OK);
	}
	@GetMapping("/customer/listByOwner/{o_id}")
	public ResponseEntity<List<CustomerEntity>> getCustomerByOid(
			@PathVariable Long o_id )
			throws ParseException {
		return new ResponseEntity<List<CustomerEntity>>(
				cosService.getCustomerByOid(o_id), HttpStatus.OK);
	}
    @PutMapping("/customer/update/{c_id}")
    public ResponseEntity<CustomerEntity> updateCustomer(@PathVariable(value = "c_id") Long c_id,
         @RequestBody CustomerDto customerDetails) throws ParseException {
    	CustomerEntity savedCostomer = cosService.updateCustomer(customerDetails,c_id);
		return new ResponseEntity<CustomerEntity>(savedCostomer, HttpStatus.OK);
    }

	
}
