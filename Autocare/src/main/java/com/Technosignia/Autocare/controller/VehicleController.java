package com.Technosignia.Autocare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.Autocare.entity.Vehicle;
import com.Technosignia.Autocare.service.VehicleService;

@RestController
public class VehicleController {
	
	@Autowired
	VehicleService vehicleService;
	
	@PostMapping("/vehicle")
	public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.createVehicle(vehicle);
	}

}
