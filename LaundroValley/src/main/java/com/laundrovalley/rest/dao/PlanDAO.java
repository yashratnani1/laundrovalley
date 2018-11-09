package com.laundrovalley.rest.dao;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laundrovalley.rest.model.Plan;
import com.laundrovalley.rest.repository.PlanRepository;

@Service
public class PlanDAO{
	
	@Autowired
	PlanRepository planRepository;
	public Optional<Plan> getplan(int id) {
		return planRepository.findById(id);
	}
	
	
}