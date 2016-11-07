package com.example.service;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by DELL on 2016/11/7.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserInfo() {
        return userMapper.findUserInfo();
    }
}
