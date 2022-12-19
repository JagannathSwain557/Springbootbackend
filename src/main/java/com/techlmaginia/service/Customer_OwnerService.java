package com.techlmaginia.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlmaginia.dto.CustomerDto;
import com.techlmaginia.dto.Customer_OwnerDto;
import com.techlmaginia.model.CustomerEntity;
import com.techlmaginia.model.Customer_OwnerEntity;
import com.techlmaginia.repository.Customer_OwnerRepository;

@Service
public class Customer_OwnerService {
	@Autowired
	Customer_OwnerRepository cusOwnRep;
	

	public Customer_OwnerEntity saveCustomerOwner(Customer_OwnerDto cusOwnDto) throws ParseException {
		Customer_OwnerEntity savedCustomerOwn = cusOwnRep.save(new Customer_OwnerEntity(cusOwnDto));
		return savedCustomerOwn;
	}

	public List<Customer_OwnerEntity> getAllCustomersOwners() {
		Iterable<Customer_OwnerEntity> customerOwners = cusOwnRep.findAll();
		ArrayList cusOwnerList = new ArrayList();
		customerOwners.forEach(b -> cusOwnerList.add(b));
		return cusOwnerList;
	}

	public Customer_OwnerEntity updateCustomerOwner(Customer_OwnerDto ownerCusDetails, Long c_o_id) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Customer_OwnerEntity ownerCus = cusOwnRep.findById(c_o_id).orElseThrow();
		if (ownerCusDetails.getO_id() != null && !ownerCusDetails.getO_id().isEmpty()) {
			ownerCus.setO_id(Long.parseLong(ownerCusDetails.getO_id()));
		}
		if (ownerCusDetails.getC_id() != null && !ownerCusDetails.getC_id().isEmpty()) {
			ownerCus.setC_id(Long.parseLong(ownerCusDetails.getC_id()));
		}
		if (ownerCusDetails.getStartedFrom() != null && !ownerCusDetails.getStartedFrom().isEmpty()) {
			ownerCus.setStartedFrom(sdf.parse(ownerCusDetails.getStartedFrom()));
		}
		if (ownerCusDetails.getEndedOn() != null && !ownerCusDetails.getEndedOn().isEmpty()) {
			ownerCus.setEndedOn(sdf.parse(ownerCusDetails.getEndedOn()));
		}
		if (ownerCusDetails.getFixedRent() != null && !ownerCusDetails.getFixedRent().isEmpty()) {
			ownerCus.setFixedRent(Double.parseDouble(ownerCusDetails.getFixedRent()));
		}
		if (ownerCusDetails.getSecurityDeposit() != null && !ownerCusDetails.getSecurityDeposit().isEmpty()) {
			ownerCus.setSecurityDeposit(Double.parseDouble(ownerCusDetails.getSecurityDeposit()));
		}
		if (ownerCusDetails.getIsExisting() != null && !ownerCusDetails.getIsExisting().isEmpty()) {
			ownerCus.setIsExisting(Boolean.parseBoolean(ownerCusDetails.getIsExisting()));
		}
		Customer_OwnerEntity updatedCusOwner = cusOwnRep.save(ownerCus);
		return updatedCusOwner;
	}
	
	public Customer_OwnerEntity updateCusOid(Customer_OwnerDto cosDto,Long o_c_id)
	{
		//CustomerEntity cos=cos.findById(c_id);
		
		Customer_OwnerEntity ownerCus = cusOwnRep.findById(o_c_id).orElseThrow();
		
		if (cosDto.getO_id() != null && !cosDto.getO_id().isEmpty()) {
			ownerCus.setO_id(Long.parseLong(cosDto.getO_id()));
		}
		Customer_OwnerEntity updatedCusOwner = cusOwnRep.save(ownerCus);
		return updatedCusOwner;
	}

	
}
