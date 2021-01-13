package com.example.jwttest.service.impl;

import com.example.jwttest.dao.StudentDao;
import com.example.jwttest.entity.Student;
import com.example.jwttest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> selectAll() {
        return studentDao.selectAll();
    }

    @Override
    public Student selectById(Integer id) {
        return studentDao.selectById(id);
    }

    @Override
    public Boolean add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public Boolean update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public Boolean delete(Integer id) {
        return studentDao.delete(id);
    }
}
