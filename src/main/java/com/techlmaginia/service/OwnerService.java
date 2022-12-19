package com.techlmaginia.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlmaginia.dto.OwnerDto;
import com.techlmaginia.model.OwnerEntity;
import com.techlmaginia.repository.OwnerRepository;

@Service
public class OwnerService {
	@Autowired
	OwnerRepository ownRep;

	public OwnerEntity saveOwner(OwnerDto ownDto) throws ParseException {
		OwnerEntity savedOwn = ownRep.save(new OwnerEntity(ownDto));
		return savedOwn;
	}

	public List<OwnerEntity> getAllOwners() {
		Iterable<OwnerEntity> owners = ownRep.findAll();
		ArrayList ownerList = new ArrayList();
		owners.forEach(b -> ownerList.add(b));
		return ownerList;
	}
	/*
	 * public List<OwnerEntity> getCustomerByOid(Long o_id) { Iterable<OwnerEntity>
	 * customers = ownRep.ownerByO_id(o_id); ArrayList customerList = new
	 * ArrayList(); customers.forEach(b -> customerList.add(b)); return
	 * customerList; }
	 */

	public OwnerEntity updateOwner(OwnerDto ownerDetails, Long o_id) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		OwnerEntity owner = ownRep.findById(o_id).orElseThrow();
		if (ownerDetails.getFullName() != null && !ownerDetails.getFullName().isEmpty()) {
			owner.setFullName(ownerDetails.getFullName());
		}
		if (ownerDetails.getOrganization() != null && !ownerDetails.getOrganization().isEmpty()) {
			owner.setOrganization(ownerDetails.getOrganization());
		}
		if (ownerDetails.getCountry() != null && !ownerDetails.getCountry().isEmpty()) {
			owner.setCountry(ownerDetails.getCountry());
		}
		if (ownerDetails.getState() != null && !ownerDetails.getState().isEmpty()) {
			owner.setState(ownerDetails.getState());
		}
		if (ownerDetails.getCity() != null && !ownerDetails.getCity().isEmpty()) {
			owner.setCity(ownerDetails.getCity());
		}
		if (ownerDetails.getPin() != null && !ownerDetails.getPin().isEmpty()) {
			owner.setPin(Integer.parseInt(ownerDetails.getPin()));
		}

		if (ownerDetails.getStartedFrom() != null && !ownerDetails.getStartedFrom().isEmpty()) {
			owner.setStartedFrom(sdf.parse(ownerDetails.getStartedFrom()));
		}
		if (ownerDetails.getLocation() != null && !ownerDetails.getLocation().isEmpty()) {
			owner.setLocation(ownerDetails.getLocation());
		}

		if (ownerDetails.getMobileNo() != null && !ownerDetails.getMobileNo().isEmpty()) {
			owner.setMobileNo(Long.parseLong(ownerDetails.getMobileNo()));
		}
		if (ownerDetails.getAltMobile() != null && !ownerDetails.getAltMobile().isEmpty()) {
			owner.setAltMobile(Long.parseLong(ownerDetails.getAltMobile()));
		}
		if (ownerDetails.getO_type() != null && !ownerDetails.getO_type().isEmpty()) {
			owner.setO_type(ownerDetails.getO_type());
		}

		if (ownerDetails.getEmail() != null && !ownerDetails.getEmail().isEmpty()) {
			owner.setEmail(ownerDetails.getEmail());
		}
		if (ownerDetails.getAdharNo() != null && !ownerDetails.getAdharNo().isEmpty()) {
			owner.setAdharNo(Long.parseLong(ownerDetails.getAdharNo()));
		}
		if (ownerDetails.getEndDate() != null && !ownerDetails.getEndDate().isEmpty()) {
			owner.setEndDate(sdf.parse(ownerDetails.getEndDate()));
		}
		if (ownerDetails.getCreatedDate() != null && !ownerDetails.getCreatedDate().isEmpty()) {
			owner.setCreatedDate(sdf.parse(ownerDetails.getCreatedDate()));
		}

		if (ownerDetails.getTokenSeries() != null && !ownerDetails.getTokenSeries().isEmpty()) {
			owner.setTokenSeries(ownerDetails.getTokenSeries());
		}
		if (ownerDetails.getTotalSeats() != null && !ownerDetails.getTotalSeats().isEmpty()) {
			owner.setTotalSeats(Integer.parseInt(ownerDetails.getTotalSeats()));
		}
		if (ownerDetails.getAvailableSeats() != null && !ownerDetails.getAvailableSeats().isEmpty()) {
			owner.setAvailableSeats(Integer.parseInt(ownerDetails.getAvailableSeats()));
		}

		if (ownerDetails.getMaxRange() != null && !ownerDetails.getMaxRange().isEmpty()) {
			owner.setMaxRange(ownerDetails.getMaxRange());
		}
		if (ownerDetails.getMinRange() != null && !ownerDetails.getMinRange().isEmpty()) {
			owner.setMinRange(ownerDetails.getMinRange());
		}
		if (ownerDetails.getRm_types() != null && !ownerDetails.getRm_types().isEmpty()) {
			owner.setRm_types(ownerDetails.getRm_types());
		}
		if (ownerDetails.getRating_avg() != null && !ownerDetails.getRating_avg().isEmpty()) {
			owner.setRating_avg(ownerDetails.getRating_avg());
		}
		if (ownerDetails.getDisabled() != null && !ownerDetails.getDisabled().isEmpty()) {
			owner.setDisabled(ownerDetails.getDisabled());
		}
		OwnerEntity updatedOwner = ownRep.save(owner);
		return updatedOwner;

	}
}
