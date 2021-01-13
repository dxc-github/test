package com.example.jwttest.service.impl;

import com.example.jwttest.entity.User;
import com.example.jwttest.service.LoginService;
import com.example.jwttest.utils.JwtHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class LoginServiceImpl implements LoginService {
    private JwtHelper jwtHelper =new JwtHelper();
    private User user =new User(1,"admin","123456");
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public String login(String userName, String password, HttpServletRequest request) {
        if(userName.equals(user.getUserName())&&password.equals(user.getPassword())){
            String userAgent = request.getHeader("User-Agent");
            logger.info(userAgent);
            return jwtHelper.generateJWT(userName,password,userAgent);
        }
        return "";
    }

}
