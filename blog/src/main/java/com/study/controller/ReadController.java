package com.study.controller;

import com.study.entity.Article;
import com.study.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ReadController {
    @Autowired
    ArticleMapper articleMapper;
    @GetMapping("/read")
    public String read(Model model){
        List<Article> articles = articleMapper.selectList(null);
        model.addAttribute("articles",articles);
        return "read";
    }
}
