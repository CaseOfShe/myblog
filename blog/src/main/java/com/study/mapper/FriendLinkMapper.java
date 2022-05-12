package com.study.mapper;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.entity.FriendLink;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity src/main/java..FriendLink
 */
@Mapper
public interface FriendLinkMapper extends BaseMapper<FriendLink> {
    int insertAll(FriendLink friendLink);
}



