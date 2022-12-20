package com.techlmaginia.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;
import com.google.cloud.spring.data.datastore.repository.query.Query;
import com.techlmaginia.model.EnquiryEntity;
import com.techlmaginia.model.RatingsEntity;
@Repository
public interface RatingsRepository extends DatastoreRepository<RatingsEntity, Long> {

	@Query(value = "SELECT * FROM RatingsEntity  WHERE r_id=@r_id")
	List<RatingsEntity> ratingByR_id(@Param("r_id") Long r_id);
	
	@Query(value="SELECT * FROM RatingsEntity ORDER BY createdDate asc LIMIT 4")
	List<RatingsEntity> quickRatingOrderByAsc();
}
