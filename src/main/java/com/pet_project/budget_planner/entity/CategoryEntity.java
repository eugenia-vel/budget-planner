package com.pet_project.budget_planner.entity;

import com.pet_project.budget_planner.constants.BudgetType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private BudgetType type;

    @Column(name = "budget")
    private int budget;

    @Column(name = "user_id")
    long userId;
}