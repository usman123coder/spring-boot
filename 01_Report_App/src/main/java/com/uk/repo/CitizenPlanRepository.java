package com.uk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uk.entity.CitizenPlan;

public interface CitizenPlanRepository extends 
			JpaRepository<CitizenPlan, Integer>{
	

}
