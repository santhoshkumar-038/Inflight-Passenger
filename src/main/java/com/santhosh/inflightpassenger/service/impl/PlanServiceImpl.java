package com.santhosh.inflightpassenger.service.impl;

import com.santhosh.inflightpassenger.entity.Plan;
import com.santhosh.inflightpassenger.repository.PlanRepository;
import com.santhosh.inflightpassenger.service.PlanService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlanServiceImpl implements PlanService {

    private PlanRepository planRepository;

    @Override
    public Plan savePlan(Plan plan) {
        return planRepository.save(plan);
    }

    @Override
    public List<Plan> getAllPlans() {
        return planRepository.findAll();
    }

    @Override
    public Plan activatePlan(Long id) {
        Plan plan = planRepository.findById(id).orElseThrow(() -> new RuntimeException("Plan not found"));
        planRepository.save(plan);
        return plan;
    }
}
