package com.techlmaginia.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techlmaginia.dto.NotificationDto;
import com.techlmaginia.model.NotificationEntity;
import com.techlmaginia.model.RatingsEntity;
import com.techlmaginia.repository.NotificationRepository;

@Service
public class NotificationService {
	@Autowired
	NotificationRepository notfRepo;

	public NotificationEntity saveNotification(NotificationDto notfDto) throws ParseException {
		NotificationEntity savedNotf = notfRepo.save(new NotificationEntity(notfDto));
		return savedNotf;
	}

	public List<NotificationEntity> getAllNotifications() {
		Iterable<NotificationEntity> notf = notfRepo.findAll();
		ArrayList notfList = new ArrayList();
		notf.forEach(b -> notfList.add(b));
		return notfList;
	}

	public NotificationEntity updateNotification(NotificationDto notfDetails, Long o_id) throws ParseException {
		

		NotificationEntity notfEntity = notfRepo.findById(o_id).get();
		if (notfDetails.getFrom_id() != null && !notfDetails.getFrom_id().isEmpty()) {
			notfEntity.setFrom_id(Long.parseLong(notfDetails.getFrom_id()));
		}
		if (notfDetails.getSender_type() != null && !notfDetails.getSender_type().isEmpty()) {
			notfEntity.setSender_type(notfDetails.getSender_type());
		}
		if (notfDetails.getTo_id() != null && !notfDetails.getTo_id().isEmpty()) {
			notfEntity.setTo_id(Long.parseLong(notfDetails.getTo_id()));
		}
		if (notfDetails.getReciever_type() != null && !notfDetails.getReciever_type().isEmpty()) {
			notfEntity.setReciever_type(notfDetails.getReciever_type());
		}
		if (notfDetails.getIsRead() != null && !notfDetails.getIsRead().isEmpty()) {
			notfEntity.setIsRead(Boolean.parseBoolean(notfDetails.getIsRead()));
		}
		if (notfDetails.getMessage() != null && !notfDetails.getMessage().isEmpty()) {
			notfEntity.setMessage(notfDetails.getMessage());
		}
/*
		if (notfDetails.getCreatedDate() != null && !notfDetails.getCreatedDate().isEmpty()) {
			notfEntity.setCreatedDate(new Date();
		}
		*/
		if (notfDetails.getMessageType() != null && !notfDetails.getMessageType().isEmpty()) {
			notfEntity.setMessageType(notfDetails.getMessageType());
		}
		if (notfDetails.getIsGrpMsg() != null && !notfDetails.getIsGrpMsg().isEmpty()) {
			notfEntity.setIsGrpMsg(Boolean.parseBoolean(notfDetails.getIsGrpMsg()));
		}
		NotificationEntity updatedNotification = notfRepo.save(notfEntity);
		return updatedNotification;
	}
	public List<NotificationEntity> getNotifByToId( Long to_id){
		Iterable<NotificationEntity> notf = notfRepo.notificationByTo_id(to_id);
		ArrayList notyList = new ArrayList();
		notf.forEach(b -> notyList.add(b));
		return notyList;
	}

}
