package com.cloud.travelplanner.repository.impl;


import com.cloud.travelplanner.model.Trip;
import com.cloud.travelplanner.repository.TripRepository;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

@Repository
public class TripRepositoryImpl implements TripRepository {

    private static final String COLLECTION_NAME = "trips";

    private Firestore getFirestore() {
        return FirestoreClient.getFirestore();
    }

    @Override
    public void saveTrip(Trip trip) throws ExecutionException, InterruptedException {
        Firestore firestore = getFirestore();
        firestore.collection(COLLECTION_NAME).document(trip.getId()).set(trip).get();
    }

    @Override
    public Trip getTripById(String id) throws ExecutionException, InterruptedException {
        Firestore firestore = getFirestore();
        DocumentReference documentReference = firestore.collection(COLLECTION_NAME).document(id);
        return documentReference.get().get().toObject(Trip.class);
    }

    @Override
    public List<Trip> getAllTrips() throws ExecutionException, InterruptedException {
        Firestore firestore = getFirestore();
        ApiFuture<QuerySnapshot> query = firestore.collection(COLLECTION_NAME).get();
        return query.get().getDocuments().stream()
                .map(document -> document.toObject(Trip.class))
                .collect(Collectors.toList());
    }

}

