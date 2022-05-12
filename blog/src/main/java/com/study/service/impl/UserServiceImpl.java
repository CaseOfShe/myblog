package com.study.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.entity.User;

import com.study.mapper.UserMapper;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User queryNameById(int id) {
        return userMapper.queryNameById(id);
    }

    @Override
    public User queryPwdById(int id) {
        return userMapper.queryPwdById(id);
    }
    @Override
    public User getOne(Wrapper<User> queryWrapper) {
        User user=new User();
        return user;
    }
}




