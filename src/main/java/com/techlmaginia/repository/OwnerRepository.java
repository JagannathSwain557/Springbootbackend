package com.techlmaginia.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;
import com.google.cloud.spring.data.datastore.repository.query.Query;
import com.techlmaginia.model.CustomerEntity;
import com.techlmaginia.model.OwnerEntity;

public interface OwnerRepository extends DatastoreRepository<OwnerEntity, Long>{

@Query(value="SELECT * FROM OwnerEntity  WHERE o_id=@o_id")
List<CustomerEntity> ownerByO_id(@Param("o_id")Long o_id);


}
