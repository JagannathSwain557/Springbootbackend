package com.techlmaginia.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;
import com.google.cloud.spring.data.datastore.repository.query.Query;
import com.techlmaginia.model.NotificationEntity;
import com.techlmaginia.model.RatingsEntity;

@Repository
public interface NotificationRepository extends DatastoreRepository<NotificationEntity, Long> {
	
	@Query(value = "SELECT * FROM NotificationEntity where isRead=false and to_id=@to_id  LIMIT 10 ")
	List<NotificationEntity> notificationByTo_id(@Param("to_id") Long to_id);
	
	
}
