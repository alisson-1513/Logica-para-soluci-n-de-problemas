package com.danieldev87.demo.dto;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

public class BatchDTO {
    @Schema(description = "Representa una receta de yogurt")
    @Schema(description = "ID único de la receta", example = "1")
    private Long id;

    @Schema(description = "Nombre de la receta", example = "Yogurt natural")
    private String name;
    @Data
    public static class StartBatchRequest {
        private Long recipeId;
        private Double customMilkVolume;
        private Double customStarterAmount;
    }
    
    @Data
    public static class FailRequest {
        private String reason;
    }
}
