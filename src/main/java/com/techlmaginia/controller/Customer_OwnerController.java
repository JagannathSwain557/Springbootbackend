package com.techlmaginia.controller;

import java.text.ParseException;
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
import org.springframework.web.bind.annotation.RestController;

import com.techlmaginia.dto.Customer_OwnerDto;
import com.techlmaginia.dto.OwnerDto;
import com.techlmaginia.model.Customer_OwnerEntity;
import com.techlmaginia.model.OwnerEntity;
import com.techlmaginia.service.Customer_OwnerService;
import com.techlmaginia.service.OwnerService;

@RestController
@RequestMapping(value = "/v1/autohome")
@CrossOrigin("*")
public class Customer_OwnerController {
	@Autowired
	Customer_OwnerService cosOwnerService;
	
	
	@GetMapping(value = "/testSuccess")
	public String test() {
		return "success";
	}

	@PostMapping(value = "/owner-customer/create", consumes = { "application/xml", "application/json" })
	public ResponseEntity<Customer_OwnerEntity> saveCustomerOwner(@Valid @RequestBody Customer_OwnerDto cosOwnDto) throws ParseException {
		Customer_OwnerEntity savedCusOwner = cosOwnerService.saveCustomerOwner(cosOwnDto);
		return new ResponseEntity<Customer_OwnerEntity>(savedCusOwner, HttpStatus.OK);
	}

	@GetMapping("/owner-customer/getall")
	public ResponseEntity<List<Customer_OwnerEntity>> getAllCustomerOwners() {
		return new ResponseEntity<List<Customer_OwnerEntity>>(cosOwnerService.getAllCustomersOwners(), HttpStatus.OK);
	}
	@PutMapping("/owner-customer/update/{c_o_id}")
	public ResponseEntity<Customer_OwnerEntity> updateCustomerOwner(@PathVariable(value = "c_o_id") Long c_o_id,
			@RequestBody Customer_OwnerDto cusOwnerDetails) throws ParseException {
		Customer_OwnerEntity cusOwnEntity = cosOwnerService.updateCustomerOwner(cusOwnerDetails, c_o_id);
		return new ResponseEntity<Customer_OwnerEntity>(cusOwnEntity, HttpStatus.OK);
	}
	@PutMapping("/owner-customer/updateByOid/{o_c_id}")
	public ResponseEntity<Customer_OwnerEntity> updateCustomerOid(@PathVariable(value = "o_c_id") Long o_c_id,
			@RequestBody Customer_OwnerDto cusOwnerDetails) throws ParseException {
		Customer_OwnerEntity cusOwnEntity = cosOwnerService.updateCusOid(cusOwnerDetails, o_c_id);
		return new ResponseEntity<Customer_OwnerEntity>(cusOwnEntity, HttpStatus.OK);
	}
	
}