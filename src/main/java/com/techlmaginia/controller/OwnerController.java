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

import com.techlmaginia.dto.OwnerDto;
import com.techlmaginia.model.OwnerEntity;
import com.techlmaginia.service.OwnerService;

@RestController
@RequestMapping(value = "/v1/autohome")
@CrossOrigin("*")
public class OwnerController {
	@Autowired
	OwnerService ownService;
	
	@GetMapping(value = "/testt")
	public String test() {
		return "success";
	}

	@PostMapping(value = "/owner/create", consumes = { "application/xml", "application/json" })
	public ResponseEntity<OwnerEntity> saveOwner(@Valid @RequestBody OwnerDto cosDto) throws ParseException {
		OwnerEntity savedOwner = ownService.saveOwner(cosDto);
		return new ResponseEntity<OwnerEntity>(savedOwner, HttpStatus.OK);
	}

	@GetMapping("/owner/getall")
	public ResponseEntity<List<OwnerEntity>> getAllOwners() {
		return new ResponseEntity<List<OwnerEntity>>(ownService.getAllOwners(), HttpStatus.OK);
	}

	@PostMapping("/owner/search")
	public ResponseEntity<List<OwnerEntity>> searchOwnersByParams(@RequestBody OwnerDto cosDto) throws ParseException {
		return new ResponseEntity<List<OwnerEntity>>(ownService.searchOwnersByParams(cosDto), HttpStatus.OK);
	}

	@PutMapping("/owner/update/{o_id}")
	public ResponseEntity<OwnerEntity> updateOwner(@PathVariable(value = "o_id") Long o_id,
			@RequestBody OwnerDto ownerDetails) throws ParseException {
		OwnerEntity ownEntity = ownService.updateOwner(ownerDetails, o_id);
		return new ResponseEntity<OwnerEntity>(ownEntity, HttpStatus.OK);
	}

}
