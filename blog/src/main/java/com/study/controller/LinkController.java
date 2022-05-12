package com.study.controller;

import com.study.entity.FriendLink;
import com.study.mapper.FriendLinkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LinkController {
    @Autowired
    FriendLinkMapper friendLinkMapper;
    @RequestMapping("/link")
    public String link(Model model){
        List<FriendLink> friendLinks = friendLinkMapper.selectList(null);
        model.addAttribute("links",friendLinks);
        return "link";
    }
}
