package com.xiaobai.mapper;

import com.xiaobai.pojo.User;

import java.util.List;

/**
 * @author 终于白发始于青丝
 * @create 2021-12-30 下午 22:38
 * @program ssm
 * @Version 1.0
 * @ClassName UserMapper
 */
public interface UserMapper {
    List<User> findUserAll();
}
