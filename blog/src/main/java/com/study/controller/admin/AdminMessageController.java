package com.study.controller.admin;

import com.study.entity.TbMessage;
import com.study.mapper.TbMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminMessageController {
    @Autowired
    TbMessageMapper tbMessageMapper;
    @RequestMapping("/message")
    public String message(Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser")==null){
//            未登录
            return "admin/login";
        }else{
            String AdminName = (String) session.getAttribute("adminUser");
            //获取管理员名
            model.addAttribute("AdminName",AdminName);
            TbMessage message =new TbMessage();
            List<TbMessage> tbMessages = tbMessageMapper.selectList(null);
            model.addAttribute("messages",tbMessages);
            return "admin/message";
        }
    }
    @RequestMapping("/message/delete")
    public String messageDelete(Model model, HttpServletRequest request,int id){
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser")==null){
//            未登录
            return "admin/login";
        }else{
            String AdminName = (String) session.getAttribute("adminUser");
            //获取管理员名
            tbMessageMapper.deleteById(id);
            return "admin/message";
        }
    }
}
