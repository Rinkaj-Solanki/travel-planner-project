package com.cloud.travelplanner.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Notification {
    private String id;
    private String userId;
    private String message;
    private String date;
    private boolean read;
}
