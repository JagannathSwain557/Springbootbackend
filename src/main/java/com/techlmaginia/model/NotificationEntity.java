package com.techlmaginia.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.data.annotation.Id;
import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import com.techlmaginia.dto.NotificationDto;
@Entity(name="NotificationEntity")
public class NotificationEntity {
	@Id
	Long n_id;
	Long from_id;
	String sender_type;
	Long to_id;
	String reciever_type;
	Boolean isRead;
	String message;
	Date createdDate;
	String messageType;
	Boolean isGrpMsg;
	public Long getN_id() {
		return n_id;
	}
	public void setN_id(Long n_id) {
		this.n_id = n_id;
	}
	public Long getFrom_id() {
		return from_id;
	}
	public void setFrom_id(Long from_id) {
		this.from_id = from_id;
	}
	public String getSender_type() {
		return sender_type;
	}
	public void setSender_type(String sender_type) {
		this.sender_type = sender_type;
	}
	public Long getTo_id() {
		return to_id;
	}
	public void setTo_id(Long to_id) {
		this.to_id = to_id;
	}
	public String getReciever_type() {
		return reciever_type;
	}
	public void setReciever_type(String reciever_type) {
		this.reciever_type = reciever_type;
	}
	public Boolean getIsRead() {
		return isRead;
	}
	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreatedAt() {
		return createdDate;
	}
	public void setCreatedAt(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public Boolean getIsGrpMsg() {
		return isGrpMsg;
	}
	public void setIsGrpMsg(Boolean isGrpMsg) {
		this.isGrpMsg = isGrpMsg;
	}
	public NotificationEntity(Long n_id, Long from_id, String sender_type, Long to_id, String reciever_type,
			Boolean isRead, String message, Date createdDate, String messageType, Boolean isGrpMsg) {
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
	public NotificationEntity(NotificationDto notDto) throws ParseException {
		 SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		this.from_id = Long.parseLong(notDto.getFrom_id());
		this.sender_type = notDto.getSender_type();
		this.to_id = Long.parseLong(notDto.getTo_id());
		this.reciever_type = notDto.getReciever_type();
		this.isRead = Boolean.parseBoolean(notDto.getIsRead());
		this.message = notDto.getMessage();
		this.createdDate = new Date();	
		this.messageType =notDto.getMessageType();
		this.isGrpMsg = Boolean.parseBoolean(notDto.getIsGrpMsg());
	}
	public NotificationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
