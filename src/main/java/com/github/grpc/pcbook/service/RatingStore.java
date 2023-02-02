package com.github.grpc.pcbook.service;

public interface RatingStore {
    Rating Add(String laptopID, double score);
}
