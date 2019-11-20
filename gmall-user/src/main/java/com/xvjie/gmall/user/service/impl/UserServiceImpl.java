package com.xvjie.gmall.user.service.impl;

import com.xvjie.gmall.bean.UmsMember;
import com.xvjie.gmall.bean.UmsMemberReceiveAddress;
import com.xvjie.gmall.service.UserService;
import com.xvjie.gmall.user.mapper.MemberReceiveAddressMapper;
import com.xvjie.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    MemberReceiveAddressMapper memberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);

        List<UmsMemberReceiveAddress> memberReceiveAddress = memberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return memberReceiveAddress;
    }
}
