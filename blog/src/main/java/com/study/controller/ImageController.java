package com.study.controller;

import com.study.entity.Image;
import com.study.mapper.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ImageController {
    @Autowired
    ImageMapper imageMapper;
    @RequestMapping("/photo")
    public String photo(Model model){
        List<Image> images = imageMapper.selectList(null);
        Map<Integer,String> map =new HashMap<>();
//        for(int i=0;)
        model.addAttribute("images",images);
        return "photo";
    }
}
