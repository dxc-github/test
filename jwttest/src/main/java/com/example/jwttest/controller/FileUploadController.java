package com.example.jwttest.controller;

import com.example.jwttest.result.ResultBuilder;
import com.example.jwttest.result.StatusCode;
import com.example.jwttest.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping(value = "/api")
public class FileUploadController {
    @Autowired
    FileUploadService fileUploadService;

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public ResultBuilder<String> fileUpload(MultipartFile file) throws IOException {
        if(file == null){
            return new ResultBuilder<String>(100,"上传文件为空");
        }
        return new ResultBuilder<String>(fileUploadService.FileUpload(file), StatusCode.SUCCESS);
    }
}
