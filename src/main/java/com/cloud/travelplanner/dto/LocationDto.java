package com.cloud.travelplanner.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LocationDto {
    private String id;
    private String name;
    private String latitude;
    private String longitude;
    private String description;
}

