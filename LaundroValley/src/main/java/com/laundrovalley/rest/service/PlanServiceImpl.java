package com.laundrovalley.rest.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laundrovalley.rest.dao.PlanDAO;
import com.laundrovalley.rest.model.Plan;

@Service
public class PlanServiceImpl implements PlanService {
	@Autowired
	PlanDAO planDao;

	@Override
	public Plan addPlan(Plan plan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Plan> getPlans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Plan> getPlan(int id) {
		
		return planDao.getplan(id);
	}
	
	
	

}
