package com.study.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.entity.Article;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Entity src/main/java..Article
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

    void insert(String atTitle, String atContent, String atCategory, String atImg);

    void update(int atId, String atTitle, String atContent, String atCategory, String atImg);
}




