package com.cloud.travelplanner.service;

import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

@Service
public class FirestoreService {

    public Firestore getFirestore() {
        return FirestoreClient.getFirestore();
    }


}

