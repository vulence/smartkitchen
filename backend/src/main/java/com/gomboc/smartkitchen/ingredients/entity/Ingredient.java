package com.gomboc.smartkitchen.ingredients.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Min(0)
    @Column(name = "kcal_per_100g")
    private Double kcalPer100g;

    @Min(0)
    @Column(name = "fats_per_100g")
    private Double fatsPer100g;

    @Min(0)
    @Column(name = "saturated_fats_per_100g")
    private Double saturatedFatsPer100g;

    @Min(0)
    @Column(name = "carbs_per_100g")
    private Double carbsPer100g;

    @Min(0)
    @Column(name = "sugars_per_100g")
    private Double sugarsPer100g;

    @Min(0)
    @Column(name = "fibers_per_100g")
    private Double fibersPer100g;

    @Min(0)
    @Column(name = "proteins_per_100g")
    private Double proteinsPer100g;
}
