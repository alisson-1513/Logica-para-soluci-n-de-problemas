package com.danieldev87.demo.dto;

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
public class IngredientDTO {
    private String name;
    private Double quantity;
    private String unit;
    private String notes;
        private Boolean optional;
}
