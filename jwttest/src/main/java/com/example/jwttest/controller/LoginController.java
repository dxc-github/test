package com.example.jwttest.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.jwttest.result.ResultBuilder;
import com.example.jwttest.result.StatusCode;
import com.example.jwttest.service.LoginService;
import com.example.jwttest.utils.JwtHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    JwtHelper jwtHelper =new JwtHelper();
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/1",method = RequestMethod.POST)
    @ResponseBody
    public ResultBuilder<String> login(@RequestBody String requestJson, HttpServletRequest request){
        logger.info(requestJson);
        JSONObject jsonObject = JSON.parseObject(requestJson);
        String userName = jsonObject.getString("userName");
        String password = jsonObject.getString("password");
        String loginServiceResult = loginService.login(userName,password,request);
        if(StringUtils.isNotEmpty(loginServiceResult)){
            return new ResultBuilder<>(loginServiceResult, StatusCode.SUCCESS);
        }
        return new ResultBuilder<>(200,"账号或密码不正确",loginServiceResult);
    }
}
