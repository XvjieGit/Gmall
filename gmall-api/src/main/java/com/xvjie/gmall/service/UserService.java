package com.xvjie.gmall.service;

import com.xvjie.gmall.bean.UmsMember;
import com.xvjie.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveByMemberId(String memberId);
}
