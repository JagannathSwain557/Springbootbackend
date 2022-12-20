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

import com.techlmaginia.dto.NotificationDto;
import com.techlmaginia.dto.OwnerDto;
import com.techlmaginia.dto.RatingsDto;
import com.techlmaginia.model.NotificationEntity;
import com.techlmaginia.model.OwnerEntity;
import com.techlmaginia.model.RatingsEntity;
import com.techlmaginia.service.NotificationService;
import com.techlmaginia.service.OwnerService;

@RestController
@RequestMapping(value = "/v1/autohome")
@CrossOrigin("*")
public class NotificationController {
	@Autowired
	NotificationService notfService;
	
	@GetMapping(value = "/success")
	public String test() {
		return "success";
	}

	@PostMapping(value = "/notification/create", consumes = { "application/xml", "application/json" })
	public ResponseEntity<NotificationEntity> saveNotification(@Valid @RequestBody NotificationDto notfDto) throws ParseException {
		NotificationEntity savedNotf = notfService.saveNotification(notfDto);
		return new ResponseEntity<NotificationEntity>(savedNotf, HttpStatus.OK);
	}

	@GetMapping("/notification/getall")
	public ResponseEntity<List<NotificationEntity>> getAllNotifications() {
		return new ResponseEntity<List<NotificationEntity>>(notfService.getAllNotifications(), HttpStatus.OK);
	}
	@PutMapping("/notification/update/{n_id}")
	public ResponseEntity<NotificationEntity> updateNotification(@PathVariable(value = "n_id") Long n_id,
			@RequestBody NotificationDto notificationDetails) throws ParseException {
		NotificationEntity notfEntity = notfService.updateNotification(notificationDetails, n_id);
		return new ResponseEntity<NotificationEntity>(notfEntity, HttpStatus.OK);
	}
	@GetMapping("/notification/get_n_to/{to_id}")
	public ResponseEntity<List<NotificationEntity>> notfByTo_id(@PathVariable(value = "to_id")Long to_id)
			throws ParseException {
		return new ResponseEntity<List<NotificationEntity>>(
				notfService.getNotifByToId(to_id), HttpStatus.OK);
	}

}