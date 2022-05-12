package com.study.controller.admin;

import com.study.entity.Diary;
import com.study.entity.User;
import com.study.mapper.UserMapper;
import com.study.service.AdminDiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Calendar;

@Controller
@RequestMapping("/admin")
public class AdminDiaryController {
    @Autowired
    AdminDiaryService adminDiaryService;
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/diary")
    public String diary(Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser")==null){
//            未登录
            return "admin/login";
        }else{
            model.addAttribute("diaryList",adminDiaryService.getAll());
           String AdminName = (String) session.getAttribute("adminUser");
            //获取管理员名
            model.addAttribute("AdminName",AdminName);
            return "admin/diary";
        }
    }
    @PostMapping("/diary/add")
    public String add(Model model, HttpServletRequest request, String text){
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser")==null){
//            未登录
            return "admin/login";
        }else{
            Calendar c = Calendar.getInstance();
            Diary diary = new Diary(null,text, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE),null);
            adminDiaryService.insert(diary);
            String AdminName = (String) session.getAttribute("adminUser");
            //获取管理员名
            model.addAttribute("AdminName",AdminName);
            return "admin/diary";
        }
    }

    @PostMapping("/diary/delete")
    public String delete(Model model, HttpServletRequest request, int id){
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser")==null){
//            未登录
            return "admin/login";
        }else{
            adminDiaryService.delete(id);
            return "redirect:/admin/diary";
        }
    }

    @RequestMapping("/diary/update/{id}")
    public String updateDiary(Model model, HttpServletRequest request, @PathVariable("id") int id){
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser")==null){
//            未登录
            return "redirect:/admin/login";
        }else{
            model.addAttribute("diary",adminDiaryService.getById(id));
            String AdminName = (String) session.getAttribute("adminUser");
            //获取管理员名
            model.addAttribute("AdminName",AdminName);
            return "admin/add-diary";
        }
    }
    @PostMapping("/diary/updates")
    public String update(Model model, HttpServletRequest request,Diary diary){
        HttpSession session = request.getSession();
        if (session.getAttribute("adminUser")==null){
//            未登录
            return "redirect:/admin/login";
        }else{
            System.out.println("*************************");
            adminDiaryService.update(diary);
            return "redirect:/admin/diary";
        }
    }
}
