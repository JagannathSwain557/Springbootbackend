package com.techlmaginia.service;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlmaginia.dto.EnquiryDto;
import com.techlmaginia.model.EnquiryEntity;
import com.techlmaginia.repository.EnqueryRepository;
import com.techlmaginia.util.ExcelReadAndWrite;

@Service
public class EnqueryService {
	@Autowired
	EnqueryRepository enqRepository;
	/*
	 * @Autowired CustomIdGenerator idGenerator;
	 */

	public EnquiryEntity saveEnquiries(EnquiryDto enqEntity) throws ParseException {
		EnquiryEntity savedEnquery = enqRepository.save(new EnquiryEntity(enqEntity));
		return savedEnquery;
	}

	public List<EnquiryEntity> getAllEnquiries() {
		Iterable<EnquiryEntity> enquiries = enqRepository.findAll();
		ArrayList enquriList = new ArrayList();
		enquiries.forEach(b -> enquriList.add(b));
		return enquriList;
	}

	public ByteArrayInputStream download() {
		Iterable<EnquiryEntity> enquiries = enqRepository.findAll();
		ArrayList enquriList = new ArrayList();
		enquiries.forEach(b -> enquriList.add(b));
		ByteArrayInputStream bityArrayInputStream = ExcelReadAndWrite.tutorialsToExcel(enquriList);
		return bityArrayInputStream;
	}

	public List<EnquiryEntity> getAllEnquerirsBeteeenStartDateAndEndDate(Date startDate, Date endDate) {
		Iterable<EnquiryEntity> enquiries = enqRepository.EnquiriesBetweenCreatedDates(startDate, endDate);
		ArrayList enquriList = new ArrayList();
		enquiries.forEach(b -> enquriList.add(b));
		return enquriList;
	}

	public ByteArrayInputStream downloadAllEnquerirsBeteeenStartDateAndEndDate(Date startDate, Date endDate) {
		Iterable<EnquiryEntity> enquiries = enqRepository.EnquiriesBetweenCreatedDates(startDate, endDate);
		ArrayList enquriList = new ArrayList();
		enquiries.forEach(b -> enquriList.add(b));
		ByteArrayInputStream bityArrayInputStream = ExcelReadAndWrite.tutorialsToExcel(enquriList);
		return bityArrayInputStream;
	}

	public boolean deleteBeforeDate(Date startDate) {
		Iterable<EnquiryEntity> enquiries = enqRepository.EnquiriesBeforeCreatedDate(startDate);
		enquiries.forEach(entity -> enqRepository.delete(entity));
		return true;
	}
	/*
	 * public void deleteBeforeDate(String stringDate) throws ParseException {
	 * Date stDate = new SimpleDateFormat("dd-MM-yyyy").parse(stringDate);
	 * enqRepository.deleteByCreatedDate(stDate); }
	 */
}
