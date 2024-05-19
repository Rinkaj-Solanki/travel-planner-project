package com.cloud.travelplanner.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Weather {
    private String id;
    private String locationId;
    private String date;
    private String temperature;
    private String description;
}

