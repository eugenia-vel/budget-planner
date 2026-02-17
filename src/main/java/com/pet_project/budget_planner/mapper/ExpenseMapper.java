package com.pet_project.budget_planner.mapper;

import com.pet_project.budget_planner.dto.ExpenseDTO;
import com.pet_project.budget_planner.entity.ExpenseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExpenseMapper {
    public ExpenseEntity mapToEntity (ExpenseDTO expenseDTO) {
        return ExpenseEntity.builder()
                .amountSpent(expenseDTO.amountSpent())
                .categoryId(expenseDTO.categoryId())
                .comment(expenseDTO.comment())
                .build();
    }
}
