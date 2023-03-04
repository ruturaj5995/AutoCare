package com.Technosignia.Autocare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Technosignia.Autocare.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
	

}
