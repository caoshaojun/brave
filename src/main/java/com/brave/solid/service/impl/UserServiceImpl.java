package com.brave.solid.service.impl;

import com.brave.solid.domain.mapper.UserDao;
import com.brave.solid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public String getNameById(Integer id) {
        return userDao.getNameById(id);
    }
}
