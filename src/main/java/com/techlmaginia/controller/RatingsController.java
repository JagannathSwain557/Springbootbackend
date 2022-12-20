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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.techlmaginia.dto.RatingsDto;
import com.techlmaginia.model.EnquiryEntity;
import com.techlmaginia.model.RatingsEntity;
import com.techlmaginia.service.RatingsService;

@RestController
@RequestMapping(value = "/v1/autohome")
@CrossOrigin("*")
public class RatingsController {
	@Autowired
	RatingsService ratService;
	
	@GetMapping(value = "/text")
	public String test() {
		return "success";
	}

	@PostMapping(value = "/rating/create", consumes = { "application/xml", "application/json" })
	public ResponseEntity<RatingsEntity> saveRating(@Valid @RequestBody RatingsDto ratDto) throws ParseException {
		RatingsEntity savedOwner = ratService.saveRating(ratDto);
		return new ResponseEntity<RatingsEntity>(savedOwner, HttpStatus.OK);
	}

	@GetMapping("/rating/getall")
	public ResponseEntity<List<RatingsEntity>> getAllRatings() {
		return new ResponseEntity<List<RatingsEntity>>(ratService.getAllRatings(), HttpStatus.OK);
	}
	@PutMapping("/rating/update/{r_id}")
	public ResponseEntity<RatingsEntity> updateRating(@PathVariable(value = "r_id") Long r_id,
			@RequestBody RatingsDto ratingDetails) throws ParseException {
		RatingsEntity ratEntity = ratService.updateRatings(ratingDetails, r_id);
		return new ResponseEntity<RatingsEntity>(ratEntity, HttpStatus.OK);
	}
	@GetMapping("/rating/quickRating")
	public ResponseEntity<List<RatingsEntity>> quickRatingOrderBy()
			throws ParseException {
		return new ResponseEntity<List<RatingsEntity>>(
				ratService.getOrderByAsc(), HttpStatus.OK);
	}
}
