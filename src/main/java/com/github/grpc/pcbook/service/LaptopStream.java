package com.github.grpc.pcbook.service;

import com.github.grpc.pcbook.pb.Laptop;

public interface LaptopStream {
    void Send(Laptop laptop);
}
