package com.techlmaginia.service;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techlmaginia.dto.TransactionDetailsDto;
import com.techlmaginia.model.TransactionDetailsEntity;
import com.techlmaginia.repository.TransactionDetailsRepository;
import com.techlmaginia.util.TxnDownLoadWithExcel;


@Service
public class TransactionDetailsService {
	@Autowired
	TransactionDetailsRepository txnRepository;
	/*
	 * @Autowired CustomIdGenerator idGenerator;
	 */

	public TransactionDetailsEntity saveTransaction(TransactionDetailsDto txnDto) throws ParseException {
		TransactionDetailsEntity savedtxn = txnRepository.save(new TransactionDetailsEntity(txnDto));
		return savedtxn;
	}

	public List<TransactionDetailsEntity> getAllTransactionDetails() {
		Iterable<TransactionDetailsEntity> txns = txnRepository.findAll();
		ArrayList txnList = new ArrayList();
		txns.forEach(b -> txnList.add(b));
		return txnList;
	}
	public List<TransactionDetailsEntity> getAllTransactionBeteeenStartDateAndEndDate(Date startDate, Date endDate) {
		Iterable<TransactionDetailsEntity> txns = txnRepository.transactionBetweenCreatedDates(startDate, endDate);
		ArrayList txnList = new ArrayList();
		txns.forEach(b -> txnList.add(b));
		return txnList;
	}

	public ByteArrayInputStream downloadAllTransactionDetailsBeteeenStartDateAndEndDate(Date startDate, Date endDate) {
		Iterable<TransactionDetailsEntity> txns = txnRepository.transactionBetweenCreatedDates(startDate, endDate);
		ArrayList txnList = new ArrayList();
		txns.forEach(b -> txnList.add(b));
		ByteArrayInputStream bityArrayInputStream = TxnDownLoadWithExcel.txnlsToExcel(txnList);
		return bityArrayInputStream;
	}
}
