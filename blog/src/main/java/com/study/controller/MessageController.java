package com.study.controller;

import com.study.entity.TbMessage;
import com.study.mapper.TbMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class MessageController {
    @Autowired
    private TbMessageMapper tbMessageMapper;
    @RequestMapping("/message")
    public String photo(Model model)
    {
        List<TbMessage> tbMessages = tbMessageMapper.selectList(null);
        model.addAttribute("Messages",tbMessages);
        return "message";
    }
    @RequestMapping("/message/add")
    public String addMessage(TbMessage message){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        String format = dateFormat.format(date);
        String dateStr = format.toString();
        message.setCreateTime(dateStr);
        tbMessageMapper.insert(message);
        return "redirect:/message";
    }
    @RequestMapping("/message/comment")
    public String comment(TbMessage message){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        String format = dateFormat.format(date);
        String dateStr = format.toString();
        message.setCreateTime(dateStr);
        tbMessageMapper.insert(message);
        return "redirect:/message";
    }

}
