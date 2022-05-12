package com.study.controller.admin;

import com.study.entity.FriendLink;
import com.study.mapper.FriendLinkMapper;
import com.study.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminFriendLinkController {
    @Autowired
    FriendLinkMapper friendLinkMapper;
    @Autowired
    FriendLinkService friendLinkService;
    //管理友链
    @RequestMapping("/link")
    public String friednLink(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser") == null) {
//            未登录
            return "admin/login";
        } else {
            List<FriendLink> friendLinks = friendLinkMapper.selectList(null);
            model.addAttribute("links",friendLinks);
            model.addAttribute("adminUser",session.getAttribute("adminUser"));
            return "admin/link";
        }
    }

    @RequestMapping("/link/delete")
    public String linkDelete(int linId,HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser") == null) {
//            未登录
            return "admin/login";
        } else {
            friendLinkMapper.deleteById(linId);
            return "redirect:/admin/link";
        }
    }

    @GetMapping("/link/add")
    public String linkAdd(HttpServletRequest request,Model model) {
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser") == null) {
//            未登录
            return "admin/login";
        } else {
            model.addAttribute("adminUser",session);
            return "admin/add-link";
        }
    }
    @PostMapping("/link/add")
    public String linkAsdd(HttpServletRequest request,Model model,FriendLink link) {
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser") == null) {
//            未登录
            return "admin/login";
        } else {
//            friendLinkService.insertAll(link);
            friendLinkMapper.insert(link);
            return "redirect:/admin/link";
        }
    }



    @RequestMapping("/link/update/{linId}")
    public String linkUpdate(@PathVariable("linId") int linId, HttpServletRequest request,Model model) {
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser") == null) {
//            未登录
            return "admin/login";
        } else {
            model.addAttribute("link",friendLinkService.getById(linId));
            model.addAttribute("adminUser",session);
            return "admin/update-link";
        }
    }

    @RequestMapping("/link/update")
    public String linkUpdates(HttpServletRequest request,Model model,FriendLink link) {
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser") == null) {
//            未登录
            return "admin/login";
        } else {
            model.addAttribute("adminUser",session);
            friendLinkService.updateById(link);
            return "redirect:/admin/link";
        }
    }
}
