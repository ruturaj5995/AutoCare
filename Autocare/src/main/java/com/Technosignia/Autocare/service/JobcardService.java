package com.Technosignia.Autocare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.Autocare.dao.JobcardRepository;
import com.Technosignia.Autocare.entity.Jobcard;

@Service
public class JobcardService {
	
	@Autowired
	JobcardRepository jobcardRepository;
	
	public Jobcard createJobcard(Jobcard jobcard) {
		return jobcardRepository.save(jobcard);
	}

	public List<Jobcard> listAllJobcard() {
		return jobcardRepository.findAll();
	}

	public Optional<Jobcard> searchJobcard(Long id) {
		// TODO Auto-generated method stub
		return jobcardRepository.findById(id);
	}

	public String deleteJobcard(Long id) {
		jobcardRepository.deleteById(id);
		return "Successfully deleted";
	}

}
