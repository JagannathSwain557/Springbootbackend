package com.techlmaginia.dto;

import java.util.Date;

public class TransactionDetailsDto {
	Long t_id;
	String t_amount ;
	String t_desc;
	String user_id;
	String user_type;
	String payeeName;
	String txnRef;
	String txnResp;

	public Long getT_id() {
		return t_id;
	}
	public void setT_id(Long t_id) {
		this.t_id = t_id;
	}
	public String getT_amount() {
		return t_amount;
	}
	public void setT_amount(String t_amount) {
		this.t_amount = t_amount;
	}
	public String getT_desc() {
		return t_desc;
	}
	public void setT_desc(String t_desc) {
		this.t_desc = t_desc;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
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
	
	public TransactionDetailsDto(Long t_id, String t_amount, String t_desc, String user_id, String user_type,
			String payeeName, String txnRef, String txnResp) {
		super();
		this.t_id = t_id;
		this.t_amount = t_amount;
		this.t_desc = t_desc;
		this.user_id = user_id;
		this.user_type = user_type;
		this.payeeName = payeeName;
		this.txnRef = txnRef;
		this.txnResp = txnResp;
	}
	public TransactionDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
