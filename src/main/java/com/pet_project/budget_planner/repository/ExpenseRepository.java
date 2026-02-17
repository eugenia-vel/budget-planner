package com.pet_project.budget_planner.repository;

import com.pet_project.budget_planner.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {
}
