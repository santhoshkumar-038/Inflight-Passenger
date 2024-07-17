package com.santhosh.inflightpassenger.controller;

import com.santhosh.inflightpassenger.entity.Plan;
import com.santhosh.inflightpassenger.service.PlanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plans")
@AllArgsConstructor
public class PlanController {
    private PlanService planService;

    @PostMapping
    public Plan savePlan(@RequestBody Plan plan){
        return planService.savePlan(plan);
    }

    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Plan> getAllPlans() {
        return planService.getAllPlans();
    }

    @PostMapping("/{id}/activate")
    public Plan activatePlan(@PathVariable Long id) {
        return planService.activatePlan(id);
    }
}
