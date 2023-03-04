package com.Technosignia.Autocare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.Autocare.entity.Mechanic;

@Repository
public interface MechanicRepository extends JpaRepository<Mechanic, Long>{

}
