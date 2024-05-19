package com.cloud.travelplanner.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NotificationDto {
    private String id;
    private String userId;
    private String message;
    private String date;
    private boolean read;
}

