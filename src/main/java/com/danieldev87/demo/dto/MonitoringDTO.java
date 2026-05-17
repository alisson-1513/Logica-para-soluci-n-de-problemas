package com.danieldev87.demo.dto;

import java.util.Map;

import lombok.Builder;
import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

public class MonitoringDTO {
    @Schema(description = "Representa una receta de yogurt")
    @Schema(description = "ID único de la receta", example = "1")
private Long id;

@Schema(description = "Nombre de la receta", example = "Yogurt natural")
private String name;
    @Data
    @Builder
    public static class TemperatureSummary {
        private Double currentTemperature;
        private Double maximumTemperature;
        private Double minimumTemperature;
        private Double averageTemperature;
    }
    
    @Data
    @Builder
    public static class Dashboard {
        private Map<String, Long> batchCounts;
        private Long activeBatchesCount;
        private Integer completedToday;
    }
}
