package com.cloud.travelplanner.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WeatherDto {
    private String id;
    private String locationId;
    private String date;
    private String temperature;
    private String description;
}
