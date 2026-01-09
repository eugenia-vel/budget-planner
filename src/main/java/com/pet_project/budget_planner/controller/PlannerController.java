package com.pet_project.budget_planner.controller;


import com.pet_project.budget_planner.dto.CategoryRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/planner")
public class PlannerController {
    @PostMapping
    public ResponseEntity<?> setBudget(@RequestBody List<CategoryRequestDTO> categoryRequestList) {
        return new ResponseEntity<>("Budget for category is set", HttpStatus.OK);
    }
}
