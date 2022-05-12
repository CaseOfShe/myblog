package com.study.service.impl;

import com.study.entity.Diary;
import com.study.mapper.DiaryMapper;
import com.study.service.AdminDiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminDiaryServiceImpl implements AdminDiaryService {
    @Autowired
    DiaryMapper diaryMapper;
    @Override
    public int update(Diary diary) {
        return diaryMapper.updateById(diary);
    }

    @Override
    public int insert(Diary diary) {
        return diaryMapper.insert(diary);
    }

    @Override
    public int delete(int id) {
        return diaryMapper.deleteById(id);
    }

    @Override
    public List<Diary> getAll() {
        return diaryMapper.selectList(null);
    }

    @Override
    public Diary getById(int id) {
        return diaryMapper.selectById(id);
    }

}
