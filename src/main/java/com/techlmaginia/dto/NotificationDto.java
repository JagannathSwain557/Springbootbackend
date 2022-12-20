package com.techlmaginia.dto;

public class NotificationDto {
	Long n_id;
	String from_id;
	String sender_type;
	String to_id;
	String reciever_type;
	String isRead;
	String message;
	String createdDate;
	String messageType;
	String isGrpMsg;
	public Long getN_id() {
		return n_id;
	}
	public void setN_id(Long n_id) {
		this.n_id = n_id;
	}
	public String getFrom_id() {
		return from_id;
	}
	public void setFrom_id(String from_id) {
		this.from_id = from_id;
	}
	public String getSender_type() {
		return sender_type;
	}
	public void setSender_type(String sender_type) {
		this.sender_type = sender_type;
	}
	public String getTo_id() {
		return to_id;
	}
	public void setTo_id(String to_id) {
		this.to_id = to_id;
	}
	public String getReciever_type() {
		return reciever_type;
	}
	public void setReciever_type(String reciever_type) {
		this.reciever_type = reciever_type;
	}
	public String getIsRead() {
		return isRead;
	}
	public void setIsRead(String isRead) {
		this.isRead = isRead;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedAt(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getIsGrpMsg() {
		return isGrpMsg;
	}
	public void setIsGrpMsg(String isGrpMsg) {
		this.isGrpMsg = isGrpMsg;
	}
	public NotificationDto(Long n_id, String from_id, String sender_type, String to_id, String reciever_type,
			String isRead, String message, String createdDate, String messageType, String isGrpMsg) {
		super();
		this.n_id = n_id;
		this.from_id = from_id;
		this.sender_type = sender_type;
		this.to_id = to_id;
		this.reciever_type = reciever_type;
		this.isRead = isRead;
		this.message = message;
		this.createdDate = createdDate;
		this.messageType = messageType;
		this.isGrpMsg = isGrpMsg;
	}
	public NotificationDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
