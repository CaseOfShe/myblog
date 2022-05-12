package com.study.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.entity.Article;
import com.study.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    ArticleMapper articleMapper;
    @RequestMapping("/index")
    public String index(Model model){

        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.orderByDesc("atCreatetime");
//        wrapper.last("limit 3");
        List<Article> articles = articleMapper.selectList(wrapper);
        model.addAttribute("articles",articles);
        return "index";
    }

}
