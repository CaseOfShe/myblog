package com.study.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.entity.Comment;
import com.study.mapper.CommentMapper;
import com.study.service.CommentService;
import org.springframework.stereotype.Service;



@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService {

}




