package com.study.controller.admin;

import com.study.entity.Article;
import com.study.entity.ArticleTag;
import com.study.mapper.ArticleMapper;
import com.study.mapper.ArticleTagMapper;
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

@RequestMapping("/admin")
@Controller
public class AdminArticleController {
    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    ArticleTagMapper articleTagMapper;
    //管理文章
    @RequestMapping("/article")
    public String article(Model model, HttpSession session){
        if(session.getAttribute("adminUser")==null){
            return "admin/login";

        }else {
            List<Article> list = articleMapper.selectList(null);
            model.addAttribute("articles",list);
            model.addAttribute("adminUser",session.getAttribute("adminUser"));
            return "admin/article";
        }

    }
    //增加文章
    @RequestMapping("/article/add")
    public String addArticle(Model model, HttpSession session){
        if(session.getAttribute("adminUser")==null){
            return "admin/login";

        }else {
            model.addAttribute("adminUser",session.getAttribute("adminUser"));
            return "admin/add-article";
        }

    }
    @RequestMapping("/article/addNew")
    public String newArticle(Model model, HttpServletRequest request,Article article){
        HttpSession session = request.getSession();
        if(session.getAttribute("adminUser")==null){
            return "admin/login";

        }else {

//            ArticleTag tag =new ArticleTag();
//            int tags = articleTagMapper.insert(tag);
//            model.addAttribute("tags",tags);
            articleMapper.insert(article);
            model.addAttribute(article);
            return "redirect:/admin/article";
        }

    }

    //查询文章
    @RequestMapping("/article/show-article")
    public String showArticle(Model model, int atId,HttpSession session) {
        if (session.getAttribute("adminUser") == null) {
            return "admin/login";

        } else {
            articleMapper.selectById(atId);
            return "redirect:/admin/article";
        }
    }


    //删除文章
    @RequestMapping("/article/delete")
    public String deleteArticle(int atId,HttpSession session) {
        if (session.getAttribute("adminUser") == null) {
            return "admin/login";

        } else {
            articleMapper.deleteById(atId);
            return "redirect:/admin/article";
        }
    }

    //修改文章
    @RequestMapping("/article/update/{atId}")
    public String updateArticle(Model model,@PathVariable("atId") int atId,HttpSession session) {
        if (session.getAttribute("adminUser") == null) {
            return "admin/login";

        } else {
            model.addAttribute("article",articleMapper.selectById(atId));
            ArticleTag tag =new ArticleTag();
//            int tags = articleTagMapper.insert(tag);
//            model.addAttribute("tags",tags);
            return "admin/add-article";
        }
    }
    @GetMapping("/article/update")
    public String updateArticles(Model model,HttpSession session,Article article) {
        if (session.getAttribute("adminUser") == null) {
            return "admin/login";

        } else {
            articleMapper.updateById(article);
            return "redirect:/admin/article";
        }
    }

}
