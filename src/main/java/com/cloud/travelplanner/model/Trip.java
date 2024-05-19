package com.cloud.travelplanner.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
public class Trip {
    private String id;
    private String name;
    private String destination;
    private String startDate;
    private String endDate;
    private List<ItineraryItem> itinerary;
}

