package com.study.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.entity.User;
import com.study.mapper.UserMapper;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminLoginController {
    @Autowired
    private UserService userService;
    @Autowired
    UserMapper userMapper;

    //进入登录管理页面
    @RequestMapping("/login")
    public String admin(Model model){
        return "admin/login";
    }

    @RequestMapping("/check")
    public String adminLogin(String username, String password, Model model, HttpSession session) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("a_name", "admin");
        User user = userMapper.selectOne(wrapper);
        Integer userCount = userMapper.selectCount(null);
        model.addAttribute("userCount",userCount);
        model.addAttribute("logUser",user);
        String name = user.getaName();
        model.addAttribute("username",name);
        String pwd = user.getaPassword();
        if (name.equals(username) && pwd.equals(password)) {
            session.setAttribute("adminUser",username);
            return "redirect:/admin/index";
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "admin/login";
        }
    }


    //退出
    @RequestMapping("/logout")
    public String mannage(HttpSession session, Model model) {
        session.invalidate();
        return "index";
    }




}