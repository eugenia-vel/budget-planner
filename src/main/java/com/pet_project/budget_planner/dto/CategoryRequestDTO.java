package com.pet_project.budget_planner.dto;

import com.pet_project.budget_planner.constants.BudgetType;

public record CategoryRequestDTO(String name, int budget, BudgetType type, long userId) {
}
