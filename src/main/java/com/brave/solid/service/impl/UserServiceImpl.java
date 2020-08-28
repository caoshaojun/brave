package com.brave.solid.service.impl;

import com.brave.solid.domain.entity.User;
import com.brave.solid.domain.mapper.UserMapper;
import com.brave.solid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserAll() {
        return userMapper.selectAll();
    }
}
