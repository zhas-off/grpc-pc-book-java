package com.github.grpc.pcbook.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public interface ImageStore {
    String Save(String laptopID, String imageType, ByteArrayOutputStream imageData) throws IOException;
}
