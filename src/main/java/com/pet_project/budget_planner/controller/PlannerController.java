package com.pet_project.budget_planner.controller;


import com.pet_project.budget_planner.dto.CategoryRequestDTO;
import com.pet_project.budget_planner.dto.ExpenseDTO;
import com.pet_project.budget_planner.service.CategoryService;
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
    private final CategoryService categoryService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getCategory(@PathVariable("id") long expenseId) {
        return new ResponseEntity<>("Helllo", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> setBudget(@RequestBody CategoryRequestDTO categoryRequest) {
        long id = categoryService.setBudget(categoryRequest);
        return new ResponseEntity<>(String.format("Budget for category %d is set", id), HttpStatus.OK);
    }

    @GetMapping("/limits/{id}")
    public ResponseEntity<?> getAllLimits(@PathVariable("id") long userId) {
        return new ResponseEntity<>(categoryService.getAllCategoriesForUser(userId), HttpStatus.OK);
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
