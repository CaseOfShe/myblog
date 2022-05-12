package com.study.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.study.entity.FriendLink;

import java.util.List;

/**
 *
 */
public interface FriendLinkService extends IService<FriendLink> {
    public int update(FriendLink links);
    public int insert(FriendLink links);
    public int delete(int linId);
    public List<FriendLink> getAll();
    public FriendLink getById(int linId);

    int insertAll(FriendLink friendLink);


}
