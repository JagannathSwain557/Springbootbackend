package com.techlmaginia.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techlmaginia.dto.EnquiryDto;
import com.techlmaginia.model.EnquiryEntity;
import com.techlmaginia.service.EnqueryService;

//@CrossOrigin("*")
@RestController
@RequestMapping(value = "/v1/webportal")
public class EnquiryController {
	@Autowired
	EnqueryService enqService;

	@GetMapping(value = "/test")
	public String test() {
		return "success";
	}
	@PostMapping(value = "/enquiry/create", consumes = { "application/xml", "application/json" })
	public ResponseEntity<EnquiryEntity> saveEnquiry(@Valid @RequestBody EnquiryDto enqEntity) throws ParseException {
		EnquiryEntity savedEnquery = enqService.saveEnquiries(enqEntity);
		return new ResponseEntity<EnquiryEntity>(savedEnquery, HttpStatus.OK);
	}

	@GetMapping("/enquiry/getall")
	public ResponseEntity<List<EnquiryEntity>> getAllEmp() {
		return new ResponseEntity<List<EnquiryEntity>>(enqService.getAllEnquiries(), HttpStatus.OK);
	}
	@GetMapping("/enquiry/download")
	public ResponseEntity<Resource> downloadData() {
		String filename = "Enquiries.xls";
		InputStreamResource file = new InputStreamResource(enqService.download());
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename)
				.contentType(MediaType.parseMediaType("application/vnd.ms-excel")).body(file);
	}
	@GetMapping("/enquiry/betweenDates")
	public ResponseEntity<List<EnquiryEntity>> getAllEnquerirsBeteeenStartDateAndEndDate(
			@RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate)
			throws ParseException {
		Date stDate = new SimpleDateFormat("dd-MM-yyyy").parse(startDate);
		Date enDate = new SimpleDateFormat("dd-MM-yyyy").parse(endDate);

		return new ResponseEntity<List<EnquiryEntity>>(
				enqService.getAllEnquerirsBeteeenStartDateAndEndDate(stDate, enDate), HttpStatus.OK);
	}
	@GetMapping("/enquiry/downloadBetweenDate")
	public ResponseEntity<Resource> downloadAllEnquerirsBeteeenStartDateAndEndDate(
			@RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate)
			throws ParseException {
		Date stDate = new SimpleDateFormat("dd-MM-yyyy").parse(startDate);
		Date enDate = new SimpleDateFormat("dd-MM-yyyy").parse(endDate);

		String filename = "Enquiries1.xls";
		InputStreamResource file = new InputStreamResource(
				enqService.downloadAllEnquerirsBeteeenStartDateAndEndDate(stDate, enDate));
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename)
				.contentType(MediaType.parseMediaType("application/vnd.ms-excel")).body(file);
	}
	@DeleteMapping("/enquiry/deleteBeforeDate")
	public ResponseEntity deleteBeforeDate(@RequestParam("startDate") String startDate) throws ParseException {
		Date stDate = new SimpleDateFormat("dd-MM-yyyy").parse(startDate);
		return new ResponseEntity(enqService.deleteBeforeDate(stDate), HttpStatus.OK);
	}

	
}