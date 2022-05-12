package com.study.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.entity.Article;
import com.study.entity.Comment;
import com.study.entity.User;
import com.study.mapper.ArticleMapper;
import com.study.mapper.CommentMapper;
import com.study.mapper.FriendLinkMapper;
import com.study.mapper.UserMapper;
import com.study.service.AdminIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminIndexServiceImpl implements AdminIndexService {
    //文章
    @Autowired
    ArticleMapper articleMapper;
    //评论
    @Autowired
    CommentMapper commentMapper;
    //友链
    @Autowired
    FriendLinkMapper friendLinkMapper;
    //管理员
    @Autowired
    UserMapper userMapper;

    @Override
    public int countWenzhang() {
        QueryWrapper<Article> articleQueryWrapper = new QueryWrapper<>();
        articleQueryWrapper.eq("at_category","1");
        return articleMapper.selectCount(articleQueryWrapper);
    }

    @Override
    public int countPinglun() {
        return commentMapper.selectCount(null);
    }

    @Override
    public int countYoulian() {
        return friendLinkMapper.selectCount(null);
    }

    @Override
    public int countZongfangwen() {
        QueryWrapper<Comment> articleQueryWrapper = new QueryWrapper<>();
        articleQueryWrapper.eq("at_category","post");
        return commentMapper.selectCount(articleQueryWrapper);
    }

    @Override
    public int countAdmin() {
        return userMapper.selectCount(null);
    }
//
//    @Override
//    public String getAdminCreateTime(int id) {
//        return userMapper.selectOne(new QueryWrapper<>().);
//    }

//    @Override
//    public void setAdminDengluTimeAndIp(int id, String ip) {
//
//    }
//
//    @Override
//    public String getServer() {
//        return null;
//    }
//
//    @Override
//    public String getJava() {
//        return null;
//    }
//
//    @Override
//    public String getSystemName() {
//        return null;
//    }
//
//    @Override
//    public String getSystemJia() {
//        return null;
//    }
//
    @Override
    public String getSystemUser() {
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        User user = userMapper.selectOne(wrapper);
        Integer userCount = userMapper.selectCount(null);
        String name = user.getaName();
        return name;
    }
//
//    @Override
//    public String getBrowserName(HttpServletRequest request) {
//        return null;
//    }
//
//    @Override
//    public String getSqlBanben() throws Exception {
//        return null;
//    }

    @Override
    public List<Comment> getTenPinglun() {
//        Comment comment= (Comment) commentMapper.selectList(null);
//        comment.getTime()
        return commentMapper.selectList(null);
    }
    //
}
