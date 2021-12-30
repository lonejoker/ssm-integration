package com.xiaobai.service.impl;

import com.xiaobai.mapper.UserMapper;
import com.xiaobai.pojo.User;
import com.xiaobai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 终于白发始于青丝
 * @create 2021-12-30 下午 22:42
 * @program ssm
 * @Version 1.0
 * @ClassName UserService
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findUserAll() {
        return userMapper.findUserAll();
    }
}
