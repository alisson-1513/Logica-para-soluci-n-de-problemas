package com.danieldev87.demo.dto;

import com.danieldev87.demo.domain.model.TemperatureLog;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Schema(description = "Representa una receta de yogurt")
@Schema(description = "ID único de la receta", example = "1")
private Long id;

@Schema(description = "Nombre de la receta", example = "Yogurt natural")
private String name;
public class TemperatureRecordDTO {
    private Double temperature;
    private TemperatureLog.LogType type;
}

