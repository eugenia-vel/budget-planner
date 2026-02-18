package com.pet_project.budget_planner.service;

import com.pet_project.budget_planner.dto.CategoryRequestDTO;
import com.pet_project.budget_planner.entity.CategoryEntity;
import com.pet_project.budget_planner.mapper.CategoryMapper;
import com.pet_project.budget_planner.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryService {
    private final CategoryMapper categoryMapper;
    private final CategoryRepository categoryRepository;


    public long setBudget(CategoryRequestDTO categoryRequestDTO) {
        CategoryEntity categoryEntity = categoryMapper.mapToEntity(categoryRequestDTO);
        categoryRepository.save(categoryEntity);
        return categoryEntity.getId();
    }

    public List<CategoryEntity> getAllCategoriesForUser(long userId) {
        return categoryRepository.getAllCategoriesByUser(userId);
    }
}
