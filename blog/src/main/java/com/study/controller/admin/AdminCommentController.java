package com.study.controller.admin;

import com.study.entity.Comment;
import com.study.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminCommentController {
    @Autowired
    private
    CommentMapper commentMapper;
    //管理评论
    @RequestMapping("/comment")
    public String comment(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser") == null) {
//            未登录
            return "redirect:/admin/login";
        } else {
            model.addAttribute("adminUser",session.getAttribute("adminUser"));
            List<Comment> commentList = commentMapper.selectList(null);
            model.addAttribute("commentList",commentList);
            return "admin/comment";
        }
    }
    @RequestMapping("/comment/delete")
    public String commentDelete(HttpServletRequest request,int id) {
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser") == null) {
//            未登录
            return "redirect:/admin/login";
        } else {
            commentMapper.deleteById(id);
            return "redirect:/admin/comment";
        }
    }


}
