package com.study.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.entity.FriendLink;
import com.study.mapper.FriendLinkMapper;
import com.study.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 *
 */
@Service
public class FriendLinkServiceImpl extends ServiceImpl<FriendLinkMapper, FriendLink>
    implements FriendLinkService {
    @Autowired
    FriendLinkMapper friendLinkMapper;

    @Override
    public int update(FriendLink links) {
        return friendLinkMapper.updateById(links);
    }

    @Override
    public int insert(FriendLink links) {
        return friendLinkMapper.insert(links);
    }

    @Override
    public int delete(int linId) {
        return friendLinkMapper.deleteById(linId);
    }

    @Override
    public List<FriendLink> getAll() {
        return friendLinkMapper.selectList(null);
    }

    @Override
    public FriendLink getById(int linId) {
        return friendLinkMapper.selectById(linId);
    }

    @Override
    public int insertAll(FriendLink friendLink) {
        return friendLinkMapper.insertAll(friendLink);
    }
}




