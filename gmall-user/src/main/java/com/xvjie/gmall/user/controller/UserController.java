package com.xvjie.gmall.user.controller;

import com.xvjie.gmall.bean.UmsMember;
import com.xvjie.gmall.bean.UmsMemberReceiveAddress;
import com.xvjie.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMember =  userService.getAllUser();
        return umsMember;
    }

    @RequestMapping("getReceiveByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress =  userService.getReceiveByMemberId(memberId);
        return umsMemberReceiveAddress;
    }


    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello xvjie";
    }
}
