package com.xvjie.gmall.user.service.impl;

import com.xvjie.gmall.user.bean.UmsMember;
import com.xvjie.gmall.user.mapper.UserMapper;
import com.xvjie.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> GetAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAllUser();
        return umsMembers;
    }
}
