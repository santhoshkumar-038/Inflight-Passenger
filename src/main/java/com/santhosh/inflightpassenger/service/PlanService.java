package com.santhosh.inflightpassenger.service;

import com.santhosh.inflightpassenger.entity.Plan;
import java.util.List;

public interface PlanService {

    public Plan savePlan(Plan plan);
    public List<Plan> getAllPlans();
    public Plan activatePlan(Long id);
}
