package com.github.grpc.pcbook.service;

import com.github.grpc.pcbook.pb.Filter;
import com.github.grpc.pcbook.pb.Laptop;
import io.grpc.Context;

public interface LaptopStore {
    void Save(Laptop laptop) throws Exception;
    Laptop Find(String id);
    void Search(Context ctx, Filter filter, LaptopStream stream);
}