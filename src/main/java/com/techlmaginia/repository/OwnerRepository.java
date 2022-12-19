package com.techlmaginia.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;
import com.google.cloud.spring.data.datastore.repository.query.Query;
import com.techlmaginia.model.OwnerEntity;

public interface OwnerRepository extends DatastoreRepository<OwnerEntity, Long>{

@Query(value="@query")
List<OwnerEntity> searchOwnersByParams(@Param("query")String query);


}
