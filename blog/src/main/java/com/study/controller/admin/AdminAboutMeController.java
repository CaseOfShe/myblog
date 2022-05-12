package com.study.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class AdminAboutMeController {
    @RequestMapping("/aboutme")
    public String aboutme(){
        return "aboutme";
    }

}
