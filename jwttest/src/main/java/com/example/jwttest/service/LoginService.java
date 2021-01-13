package com.example.jwttest.service;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {
    //登录
    public String login(String userName, String password, HttpServletRequest request);
}
