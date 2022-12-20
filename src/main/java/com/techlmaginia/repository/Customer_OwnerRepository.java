package com.techlmaginia.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;
import com.google.cloud.spring.data.datastore.repository.query.Query;
import com.techlmaginia.model.Customer_OwnerEntity;
@Repository
public interface Customer_OwnerRepository extends DatastoreRepository<Customer_OwnerEntity, Long> {

	@Query(value = "SELECT * FROM Customer_OwnerEntity  WHERE c_o_id=@c_o_id")
	List<Customer_OwnerEntity> ownerByC_o_id(@Param("c_o_id") Long c_o_id);
/*	
	@Query(value = "SELECT * FROM CustomerEntity  WHERE c_id=@c_id")
	List<Customer_OwnerEntity> customerByC_id(@Param("c_id") Long c_id);
	*/
}
