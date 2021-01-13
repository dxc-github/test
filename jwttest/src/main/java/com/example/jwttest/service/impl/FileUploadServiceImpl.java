package com.example.jwttest.service.impl;

import com.example.jwttest.config.UploadConfig;
import com.example.jwttest.service.FileUploadService;
import com.example.jwttest.utils.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import static com.example.jwttest.utils.FileUtils.generateFileName;


@Service
public class FileUploadServiceImpl implements FileUploadService {
    @Override
    public String FileUpload(MultipartFile file) throws IOException {
        String fileNameSuffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String fileName = generateFileName()+fileNameSuffix;
        String writeFile = UploadConfig.path+fileName;
        String fileNameUrl = "http://down1.gamebox.shzhanmeng.com/img/"+fileName;
        FileUtils.write(writeFile,file.getInputStream());
        return fileNameUrl;
    }
}
