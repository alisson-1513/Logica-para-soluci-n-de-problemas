package com.danieldev87.demo.dto;

import java.util.List;

import com.danieldev87.demo.domain.model.Recipe;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.v3.oas.annotations.media.Schema;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Representa una receta de yogurt")

@Schema(description = "ID único de la receta", example = "1")
private Long id;

@Schema(description = "Nombre de la receta", example = "Yogurt natural")
private String name;
public class RecipeDTO {
    
    private String name;
    private String description;
    private Double defaultMilkVolume;
    private Double defaultStarterAmount;
    private Double heatingTemperature;
    private Integer heatingDuration;
    private Double inoculationTemperature;
    private Double incubationTemperature;
    private Integer minIncubationTime;
    private Integer maxIncubationTime;
    private Integer refrigerationTime;
    private Recipe.DifficultyLevel difficulty;
    private String tips;
    private List<IngredientDTO> ingredients;
}