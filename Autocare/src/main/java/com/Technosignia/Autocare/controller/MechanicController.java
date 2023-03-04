package com.Technosignia.Autocare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.Autocare.entity.Mechanic;
import com.Technosignia.Autocare.service.MechanicService;

@RestController
public class MechanicController {
	
	@Autowired
	MechanicService mechanicService;
	
	@PostMapping("/mechanic")
	public Mechanic createMechanic(@RequestBody Mechanic mechanic) {
		return mechanicService.saveMechanic(mechanic);
	}

}
