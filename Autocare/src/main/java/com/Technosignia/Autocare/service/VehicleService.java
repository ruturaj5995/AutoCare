package com.Technosignia.Autocare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.Autocare.dao.VehicleRepository;
import com.Technosignia.Autocare.entity.Vehicle;

@Service
public class VehicleService {
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	
	public Vehicle createVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

}
