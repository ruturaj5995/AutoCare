package com.Technosignia.Autocare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Technosignia.Autocare.entity.Fault;

public interface FaultRepository extends JpaRepository<Fault, Long> {

}
