package com.pet_project.budget_planner.mapper;

import com.pet_project.budget_planner.dto.CategoryRequestDTO;
import com.pet_project.budget_planner.entity.CategoryEntity;
import org.springframework.stereotype.Service;

@Service
public class CategoryMapper {
    public CategoryEntity mapToEntity(CategoryRequestDTO categoryRequestDTO) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setBudget(categoryRequestDTO.budget());
        categoryEntity.setName(categoryRequestDTO.name());
        categoryEntity.setType(categoryRequestDTO.type());
        categoryEntity.setUserId(categoryRequestDTO.userId());
        return categoryEntity;
    }
}
