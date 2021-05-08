package com.brave.solid.service.user.impl;

import com.brave.solid.domain.mapper.UserMapper;
import com.brave.solid.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


}
