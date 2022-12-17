package com.techlmaginia.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;
import com.google.cloud.spring.data.datastore.repository.query.Query;
import com.techlmaginia.model.EnquiryEntity;

@Repository
public interface EnqueryRepository extends DatastoreRepository<EnquiryEntity, Long>{

@Query(value="SELECT * FROM EnquiryEntity  WHERE createdDate<@createdDate")
List<EnquiryEntity> EnquiriesBeforeCreatedDate(@Param("createdDate")Date createdDate);

@Query(value="SELECT * FROM EnquiryEntity where createdDate>=@startDate and createdDate<=@endDate  ")
List<EnquiryEntity> EnquiriesBetweenCreatedDates(@Param("startDate")Date startDate,@Param("endDate") Date endDate);


}
