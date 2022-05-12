package com.study.controller.admin;


import com.study.mapper.UserMapper;
import com.study.service.AdminIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/admin")
public class AdminIndexController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    AdminIndexService adminIndexService;
    @RequestMapping("/index")
    public String index(Model model, HttpServletRequest request, HttpSession session){
        if(session.getAttribute("adminUser")==null){
            //未登录
            return "redirect:/admin/login";
        }else {
            //文章数量
            model.addAttribute("articleCount",adminIndexService.countWenzhang());
            //评论数量
            model.addAttribute("commentCount",adminIndexService.countPinglun());
            //友链数量
            model.addAttribute("linkCount",adminIndexService.countYoulian());
            //管理员数量
            model.addAttribute("userCount",adminIndexService.countAdmin());
            //管理员名字
            model.addAttribute("username",adminIndexService.getSystemUser());
            //评论内容
            model.addAttribute("comments",adminIndexService.getTenPinglun());
            return "admin/index";

        }
    }
}
