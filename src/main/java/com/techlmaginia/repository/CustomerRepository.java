package com.techlmaginia.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;
import com.google.cloud.spring.data.datastore.repository.query.Query;
import com.techlmaginia.model.CustomerEntity;
import com.techlmaginia.model.EnquiryEntity;

public interface CustomerRepository extends DatastoreRepository<CustomerEntity, Long>{

@Query(value="SELECT * FROM CustomerEntity  WHERE o_id=@o_id")
List<CustomerEntity> costomerByO_id(@Param("o_id")Long o_id);

//List<CustomerEntity> findByC_id(Long c_id);
@Query(value="SELECT * FROM CustomerEntity  WHERE c_id=@c_id")
CustomerEntity costomerByC_id(@Param("c_id")Long c_id);
}
