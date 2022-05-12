package com.study.controller;

import com.study.entity.Diary;
import com.study.mapper.DiaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Access;
import java.util.List;

@Controller
public class DiaryController {
    @Autowired
    DiaryMapper diaryMapper;
    @RequestMapping("/diary")
    public String diary(Model model)
    {
        List<Diary> diaries = diaryMapper.selectList(null);
        model.addAttribute("diaries",diaries);
        return "diary";
    }

}
