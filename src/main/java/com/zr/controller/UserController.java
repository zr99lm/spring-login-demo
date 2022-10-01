package com.zr.controller;

import com.zr.dao.vo.MessageModule;
import com.zr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    public MessageModule userLogin(String name,String pwd){
        MessageModule messageModule = userService.checkLogin(name, pwd);
        return messageModule;
    }
}
