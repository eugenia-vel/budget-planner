package com.pet_project.budget_planner.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "expenses")
public class ExpenseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "amount_spent")
    int amountSpent;

    @Column(name = "comment")
    String comment;

    @Column(name = "category_id")
    long categoryId;

    @Column(name = "user_id")
    long userId;
}
