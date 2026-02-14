package com.pet_project.budget_planner.dto;

public record ExpenseDTO (
    int amountSpent,
    long categoryID,
    String comment
) {}
