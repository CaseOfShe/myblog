package com.study.service;

import com.study.entity.Comment;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface AdminIndexService {

    //获取文章数量，
    public int countWenzhang();
    // 评论数量，
    public int countPinglun();
    // 友链数量，
    public int countYoulian();
    // 总访问数量，
    public int countZongfangwen();
     //管理员数量
    public int countAdmin();
//    //获取管理员登陆日期
//    public String getAdminDengluTime(int id);
//    //替换现在的日期和IP到管理员登陆日期和IP
//    public void setAdminDengluTimeAndIp(int id,String ip);
//
//    //获取服务器等信息
//    //获取服务器软件
//    public String getServer();
//    //获取Java版本
//    public String getJava();
//    //获取系统名称
//    public String getSystemName();
//    //获取系统架构
//    public String getSystemJia();
    //用户的账户名称：12442
    public String getSystemUser();
//    //获取浏览器name
//    public String getBrowserName(HttpServletRequest request);
//    //获取数据库版本
//    public String getSqlBanben() throws Exception;
    //获取前十条评论
    public List<Comment> getTenPinglun();
}
