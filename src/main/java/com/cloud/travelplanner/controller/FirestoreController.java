package com.cloud.travelplanner.controller;


import com.cloud.travelplanner.service.FirestoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/firestore")
public class FirestoreController {

    private final FirestoreService firestoreService;

    public FirestoreController(FirestoreService firestoreService) {
        this.firestoreService = firestoreService;
    }

    @GetMapping("/test")
    public String testFirestore() {
        return "Firestore integration works!";
    }
}

