package com.pet_project.budget_planner.repository;

import com.pet_project.budget_planner.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    @Query(nativeQuery = true,
            value = "SELECT * FROM categories " +
                    "WHERE user_id = :userId")
    List<CategoryEntity> getAllCategoriesByUser(long userId);
}
