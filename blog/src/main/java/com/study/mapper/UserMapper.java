package com.study.mapper;

import com.study.entity.User;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Entity src/main/java..User
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select aName from User where id = #{id}")
    User queryNameById(int id);
    @Select("select aPassword from User where id =#{id}")
    User queryPwdById(int id);
}




