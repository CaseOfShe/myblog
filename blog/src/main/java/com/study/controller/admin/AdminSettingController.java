package com.study.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminSettingController {
        //管理登录用户
            //添加用户
            //删除用户
            //用户权限 后面再写
        //管理栏目
    @RequestMapping("/category")
    public String category(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser") == null) {
//            未登录
            return "redirect:/admin/login";
        } else {
            return "admin/category";
        }
    }
            //添加内容
            //删除内容


    //管理设置

    @RequestMapping("/setting")
    public String setting(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser") == null) {
//            未登录
            return "redirect:/admin/login";
        } else {
            model.addAttribute("adminUser",session.getAttribute("adminUser"));
            return "admin/setting";
        }
    }


}
