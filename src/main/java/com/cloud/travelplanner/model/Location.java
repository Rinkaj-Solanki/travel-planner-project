package com.cloud.travelplanner.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Location {
    private String id;
    private String name;
    private String latitude;
    private String longitude;
    private String description;
}

