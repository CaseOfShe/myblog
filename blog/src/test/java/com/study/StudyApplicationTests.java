package com.study;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.entity.User;
import com.study.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class StudyApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    public List GetAdmin(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("aName","admin");
        User user = userMapper.selectOne(wrapper);
        String name = user.getaName();
        String pwd = user.getaPassword();
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(pwd);
        System.out.println(name);
        System.out.println(pwd);
        System.out.println(list);
        return list;
    }

}
