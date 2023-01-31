package com.github.grpc.pcbook.service;

import com.github.grpc.pcbook.pb.Laptop;

public interface LaptopStore {
    void Save(Laptop laptop) throws Exception;
    Laptop Find(String id);
}