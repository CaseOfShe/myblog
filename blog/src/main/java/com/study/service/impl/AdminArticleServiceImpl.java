package com.study.service.impl;
import com.study.entity.Comment;
import com.study.service.AdminArticleService;

import java.util.List;

public class AdminArticleServiceImpl implements AdminArticleService {

    @Override
    public List<Comment> getContents(int page, int size) {
        return null;
    }

    @Override
    public int getContentsCount() {
        return 0;
    }

    @Override
    public int insert(String atTitle, String text, String type, int mid) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
