package com.study.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.study.entity.User;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 *
 */
public interface UserService extends IService<User> {
    User queryNameById(int id);
    User queryPwdById(int id);

}
