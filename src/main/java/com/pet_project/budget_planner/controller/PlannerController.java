package com.pet_project.budget_planner.controller;


import com.pet_project.budget_planner.dto.CategoryRequestDTO;
import com.pet_project.budget_planner.dto.ExpenseDTO;
import com.pet_project.budget_planner.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/planner")
public class PlannerController {

    private final ExpenseService expenseService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getCategory(@PathVariable("id") long expenseId) {
        return new ResponseEntity<>("Helllo", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> setBudget(@RequestBody List<CategoryRequestDTO> categoryRequestList) {
        return new ResponseEntity<>("Budget for category is set", HttpStatus.OK);
    }
    @PostMapping("/addexpense")
    public ResponseEntity<?> addExpense(@RequestBody ExpenseDTO expenseDTO) {
        Long expenseId = expenseService.addExpense(expenseDTO);
        return new ResponseEntity<>(String.format("Expense %d added", expenseId),
                HttpStatus.OK);
    }
    @DeleteMapping("/removeexpense/{id}")
    public ResponseEntity<?> removeExpense(@PathVariable("id") long expenseId) {
        return new ResponseEntity<>("Expense removed", HttpStatus.OK);
    }
}
