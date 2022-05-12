package com.study.service;

import com.study.entity.Diary;

import java.util.List;

public interface AdminDiaryService {
    public int update(Diary diary);
    public int insert(Diary diary);
    public int delete(int id);
    public List<Diary> getAll();
    public Diary getById(int id);
}
