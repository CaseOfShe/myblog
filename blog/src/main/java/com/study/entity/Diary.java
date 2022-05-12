package com.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@TableName("diary")
@AllArgsConstructor
@NoArgsConstructor
public class Diary {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String text;
    private Integer year;
    private Integer month;
    private Integer day;

    @TableField(exist=false)
    private List<Diary> diaryList;
}
