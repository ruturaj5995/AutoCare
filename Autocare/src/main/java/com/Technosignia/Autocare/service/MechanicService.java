package com.Technosignia.Autocare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.Autocare.dao.MechanicRepository;
import com.Technosignia.Autocare.entity.Mechanic;

@Service
public class MechanicService {
	
	@Autowired
	MechanicRepository mechanicRepository;
	
	public Mechanic saveMechanic(Mechanic mechanic) {
		return mechanicRepository.save(mechanic);
	}

}
