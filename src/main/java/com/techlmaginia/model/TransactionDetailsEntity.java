package com.techlmaginia.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import com.techlmaginia.dto.TransactionDetailsDto;
@Entity(name="TransactionDetailsEntity")
public class TransactionDetailsEntity {
	@Id
	Long t_id;
	Double t_amount ;
	String t_desc;
	Long user_id;
	String user_type;
	String payeeName;
	String txnRef;
	String txnResp;
	Date createdDate;
	public Long getT_id() {
		return t_id;
	}
	public void setT_id(Long t_id) {
		this.t_id = t_id;
	}
	public Double getT_amount() {
		return t_amount;
	}
	public void setT_amount(Double t_amount) {
		this.t_amount = t_amount;
	}
	public String getT_desc() {
		return t_desc;
	}
	public void setT_desc(String t_desc) {
		this.t_desc = t_desc;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public String getTxnRef() {
		return txnRef;
	}
	public void setTxnRef(String txnRef) {
		this.txnRef = txnRef;
	}
	public String getTxnResp() {
		return txnResp;
	}
	public void setTxnResp(String txnResp) {
		this.txnResp = txnResp;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public TransactionDetailsEntity(Long t_id, Double t_amount, String t_desc, Long user_id, String user_type,
			String payeeName, String txnRef, String txnResp, Date createdDate) {
		super();
		this.t_id = t_id;
		this.t_amount = t_amount;
		this.t_desc = t_desc;
		this.user_id = user_id;
		this.user_type = user_type;
		this.payeeName = payeeName;
		this.txnRef = txnRef;
		this.txnResp = txnResp;
		this.createdDate = createdDate;
	}
	public TransactionDetailsEntity(TransactionDetailsDto txnDto) {
		this.t_amount = Double.parseDouble(txnDto.getT_amount());
		this.t_desc = txnDto.getT_desc();
		this.user_id = Long.parseLong(txnDto.getUser_id());
		this.user_type = txnDto.getUser_type();
		this.payeeName = txnDto.getPayeeName();
		this.txnRef = txnDto.getTxnRef();
		this.txnResp = txnDto.getTxnResp();
		this.createdDate =  new Date(System.currentTimeMillis());
	}
	public TransactionDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
