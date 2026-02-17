package com.pet_project.budget_planner.dto;

public record ExpenseDTO (
    int amountSpent,
    long categoryId,
    String comment
) {}
