package com.xvjie.gmall.user.controller;

import com.xvjie.gmall.user.bean.UmsMember;
import com.xvjie.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("GetAllUser")
    @ResponseBody
    public List<UmsMember> GetAllUser(){
        List<UmsMember> umsMember =  userService.GetAllUser();
        return umsMember;
    }


    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello xvjie";
    }
}
