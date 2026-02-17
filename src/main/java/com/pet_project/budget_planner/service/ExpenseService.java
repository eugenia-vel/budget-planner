package com.pet_project.budget_planner.service;

import com.pet_project.budget_planner.dto.ExpenseDTO;
import com.pet_project.budget_planner.entity.ExpenseEntity;
import com.pet_project.budget_planner.mapper.ExpenseMapper;
import com.pet_project.budget_planner.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ExpenseService {
    private final ExpenseMapper expenseMapper;
    private final ExpenseRepository expenseRepository;
    public long addExpense(ExpenseDTO expenseDTO) {
        ExpenseEntity expense = expenseMapper.mapToEntity(expenseDTO);
        expenseRepository.save(expense);
        return expense.getId();
    }
    public long removeExpense(long expenseId) {
        return 0L;
    }
}
