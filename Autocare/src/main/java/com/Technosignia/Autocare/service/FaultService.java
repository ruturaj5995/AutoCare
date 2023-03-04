package com.Technosignia.Autocare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.Autocare.dao.FaultRepository;
import com.Technosignia.Autocare.entity.Fault;

@Service
public class FaultService {
	
	@Autowired
	FaultRepository faultRepository;
	
	public Fault createFault(Fault fault) {
		return faultRepository.save(fault);
	}

}
