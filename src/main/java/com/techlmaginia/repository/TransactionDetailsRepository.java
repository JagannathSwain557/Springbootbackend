package com.techlmaginia.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;
import com.google.cloud.spring.data.datastore.repository.query.Query;
import com.techlmaginia.model.TransactionDetailsEntity;

@Repository
public interface TransactionDetailsRepository extends DatastoreRepository<TransactionDetailsEntity, Long>{

@Query(value="SELECT * FROM TransactionDetailsEntity  WHERE createdDate<@createdDate")
List<TransactionDetailsEntity> transactionBeforeCreatedDate(@Param("createdDate")Date createdDate);

@Query(value="SELECT * FROM TransactionDetailsEntity where createdDate>=@startDate and createdDate<=@endDate  ")
List<TransactionDetailsEntity> transactionBetweenCreatedDates(@Param("startDate")Date startDate,@Param("endDate") Date endDate);

}
