package com.example.jwttest.service;

import com.example.jwttest.entity.Student;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface StudentService {
    public List<Student> selectAll();

    public Student selectById(Integer id);

    public Boolean add(Student student);

    public Boolean update(Student student);

    public Boolean delete(Integer id);
}
