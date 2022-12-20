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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techlmaginia.dto.TransactionDetailsDto;
import com.techlmaginia.model.TransactionDetailsEntity;
import com.techlmaginia.service.TransactionDetailsService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/v1/autohome")
public class TransactionDetailsController {
	@Autowired
	TransactionDetailsService txnService;

	@GetMapping(value = "/txn")
	public String test() {
		return "success";
	}
	@PostMapping(value = "/txn/create", consumes = { "application/xml", "application/json" })
	public ResponseEntity<TransactionDetailsEntity> savetxn(@Valid @RequestBody TransactionDetailsDto txnDto) throws ParseException {
		TransactionDetailsEntity savedtxn = txnService.saveTransaction(txnDto);
		return new ResponseEntity<TransactionDetailsEntity>(savedtxn, HttpStatus.OK);
	}

	@GetMapping("/txn/getall")
	public ResponseEntity<List<TransactionDetailsEntity>> getAllTxns() {
		return new ResponseEntity<List<TransactionDetailsEntity>>(txnService.getAllTransactionDetails(), HttpStatus.OK);
	}
	@GetMapping("/txn/betweenDates")
	public ResponseEntity<List<TransactionDetailsEntity>> getAllEnquerirsBeteeenStartDateAndEndDate(
			@RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate)
			throws ParseException {
		Date stDate = new SimpleDateFormat("dd-MM-yyyy").parse(startDate);
		Date enDate = new SimpleDateFormat("dd-MM-yyyy").parse(endDate);

		return new ResponseEntity<List<TransactionDetailsEntity>>(
				txnService.getAllTransactionBeteeenStartDateAndEndDate(stDate, enDate), HttpStatus.OK);
	}
	@GetMapping("/txn/downloadBetweenDate")
	public ResponseEntity<Resource> downloadAllEnquerirsBeteeenStartDateAndEndDate(
			@RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate)
			throws ParseException {
		Date stDate = new SimpleDateFormat("dd-MM-yyyy").parse(startDate);
		Date enDate = new SimpleDateFormat("dd-MM-yyyy").parse(endDate);

		String filename = "TransactionDetails.xls";
		InputStreamResource file = new InputStreamResource(
				txnService.downloadAllTransactionDetailsBeteeenStartDateAndEndDate(stDate, enDate));
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename)
				.contentType(MediaType.parseMediaType("application/vnd.ms-excel")).body(file);
	}
}
