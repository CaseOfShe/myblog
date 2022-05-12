package com.study.service;

import com.study.entity.Comment;

import java.util.List;

public interface AdminArticleService {
    public List<Comment> getContents(int page, int size);
    public int getContentsCount();
    public int insert(String atTitle,String text,String type,int mid);
    public int delete(int id);

}
