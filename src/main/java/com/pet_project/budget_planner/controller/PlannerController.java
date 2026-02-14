package com.pet_project.budget_planner.controller;


import com.pet_project.budget_planner.dto.CategoryRequestDTO;
import com.pet_project.budget_planner.dto.ExpenseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/planner")
public class PlannerController {
    @PostMapping
    public ResponseEntity<?> setBudget(@RequestBody List<CategoryRequestDTO> categoryRequestList) {
        return new ResponseEntity<>("Budget for category is set", HttpStatus.OK);
    }
    @PostMapping("/addexpense")
    public ResponseEntity<?> addExpense(@RequestBody ExpenseDTO expenseDTO) {
        return new ResponseEntity<>("Expense added", HttpStatus.OK);
    }
    @DeleteMapping("/removeexpense/{id}")
    public ResponseEntity<?> removeExpense(@PathVariable("id") long expenseId) {
        return new ResponseEntity<>("Expense removed", HttpStatus.OK);
    }
}
