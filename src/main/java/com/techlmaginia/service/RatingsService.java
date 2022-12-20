package com.techlmaginia.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techlmaginia.dto.RatingsDto;
import com.techlmaginia.model.CustomerEntity;
import com.techlmaginia.model.EnquiryEntity;
import com.techlmaginia.model.OwnerEntity;
import com.techlmaginia.model.RatingsEntity;
import com.techlmaginia.repository.OwnerRepository;
import com.techlmaginia.repository.RatingsRepository;

@Service
public class RatingsService {
	@Autowired
	RatingsRepository ratRep;
	@Autowired
	OwnerRepository ownRepo;
	@Transactional
	public RatingsEntity saveRating(RatingsDto ratDto) throws ParseException {
		RatingsEntity savedRating = ratRep.save(new RatingsEntity(ratDto));
		OwnerEntity owner=ownRepo.findById(Long.parseLong(ratDto.getO_id())).get();
		
	if(owner.getNoOfRatings()==null || owner.getRating_avg()==null)
	{
		double avg=(owner.getNoOfRatings()*owner.getRating_avg()+Long.parseLong(ratDto.getCustomerRating()))/(owner.getNoOfRatings()+1);
		owner.setRating_avg(avg);
		owner.setNoOfRatings((long) 1);
	}
	else{
		owner.setNoOfRatings(owner.getNoOfRatings()+1);
		owner.setRating_avg(Double.parseDouble(ratDto.getCustomerRating()));
	}
	
		ownRepo.save(owner);
		return savedRating;
	}

	public List<RatingsEntity> getAllRatings() {
		Iterable<RatingsEntity> ratings = ratRep.findAll();
		ArrayList ratingList = new ArrayList();
		ratings.forEach(b -> ratingList.add(b));
		return ratingList;
	}
	public RatingsEntity updateRatings(RatingsDto ratDetails, Long r_id) throws ParseException {
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		RatingsEntity ratEntity = ratRep.findById(r_id).orElseThrow();
		if (ratDetails.getO_id() != null && !ratDetails.getO_id().isEmpty()) {
			ratEntity.setO_id(Long.parseLong(ratDetails.getO_id()));
		}
		if (ratDetails.getC_id() != null && !ratDetails.getC_id().isEmpty()) {
			ratEntity.setC_id(Long.parseLong(ratDetails.getC_id()));
		}
		if (ratDetails.getCustomerName() != null && !ratDetails.getCustomerName().isEmpty()) {
			ratEntity.setCustomerName(ratDetails.getCustomerName());
		}
		if (ratDetails.getCustomerRating() != null && !ratDetails.getCustomerRating().isEmpty()) {
			ratEntity.setCustomerRating(Double.parseDouble(ratDetails.getCustomerRating()));
		}
		if (ratDetails.getCustomerReview() != null && !ratDetails.getCustomerReview().isEmpty()) {
			ratEntity.setCustomerReview(ratDetails.getCustomerReview());
		}
		if (ratDetails.getCreatedDate() != null && !ratDetails.getCreatedDate().isEmpty()) {
			ratEntity.setCreatedDate(sdf.parse(ratDetails.getCreatedDate()));
		}
		if (ratDetails.getUpdatedDate() != null && !ratDetails.getUpdatedDate().isEmpty()) {
			ratEntity.setUpdatedDate(sdf.parse(ratDetails.getUpdatedDate()));
		}
		
		RatingsEntity updatedRatings = ratRep.save(ratEntity);
		return updatedRatings;
	}
	
	public List<RatingsEntity> getOrderByAsc(){
		Iterable<RatingsEntity> ratings = ratRep.quickRatingOrderByAsc();
		ArrayList ratingList = new ArrayList();
		ratings.forEach(b -> ratingList.add(b));
		return ratingList;
	}
}
