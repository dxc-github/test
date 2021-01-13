package com.example.jwttest.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileUploadService {
    public String FileUpload(MultipartFile file) throws IOException;
}
