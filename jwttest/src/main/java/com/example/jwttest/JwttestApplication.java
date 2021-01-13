package com.example.jwttest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.example.jwttest.dao"})
public class JwttestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwttestApplication.class, args);
    }

}
