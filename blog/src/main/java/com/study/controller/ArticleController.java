package com.study.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.entity.Article;
import com.study.entity.Comment;
import com.study.mapper.ArticleMapper;
import com.study.mapper.CommentMapper;
import net.sf.jsqlparser.statement.select.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ArticleController {
    @Autowired
    ArticleMapper articleMapper;

    @RequestMapping("/blog")
    public String blog(Model model){
        return "article";
    }
    @RequestMapping("/article")
    public String article(Model model){
        List<Article> articles = articleMapper.selectList(null);
        model.addAttribute("articles",articles);
        return "article";
    }

}
