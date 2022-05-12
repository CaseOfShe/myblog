package com.study.controller;

import com.study.entity.AboutMe;
import com.study.mapper.AboutMeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/admin")
public class AboutMeController {
    @Autowired
    AboutMeMapper aboutMeMapper;
    @RequestMapping("/aboutme")
    public String aboutme(Model model){
        List<AboutMe> aboutMes = aboutMeMapper.selectList(null);
        model.addAttribute("abouts",aboutMes);
        return "aboutme";
    }

}
