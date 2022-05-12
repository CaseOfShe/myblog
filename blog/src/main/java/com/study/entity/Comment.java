package com.study.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;


/**
 * 
 * @TableName comment
 */
@TableName(value ="comment")
public class Comment implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 评论作者名
     */
    private String commentName;

    /**
     * 评论头像
     */
    private String commentAvatar;

    /**
     * 评论内容
     */
    private String comment;

    /**
     * 评论时间
     */
    private String time;

    /**
     * 评论的文章id
     */
    private Integer topArticle;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 评论作者名
     */
    public String getCommentName() {
        return commentName;
    }

    /**
     * 评论作者名
     */
    public void setCommentName(String commentName) {
        this.commentName = commentName;
    }

    /**
     * 评论头像
     */
    public String getCommentAvatar() {
        return commentAvatar;
    }

    /**
     * 评论头像
     */
    public void setCommentAvatar(String commentAvatar) {
        this.commentAvatar = commentAvatar;
    }

    /**
     * 评论内容
     */
    public String getComment() {
        return comment;
    }

    /**
     * 评论内容
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 评论时间
     */
    public String getTime() {
        return time;
    }

    /**
     * 评论时间
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 评论的文章id
     */
    public Integer getTopArticle() {
        return topArticle;
    }

    /**
     * 评论的文章id
     */
    public void setTopArticle(Integer topArticle) {
        this.topArticle = topArticle;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Comment other = (Comment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCommentName() == null ? other.getCommentName() == null : this.getCommentName().equals(other.getCommentName()))
            && (this.getCommentAvatar() == null ? other.getCommentAvatar() == null : this.getCommentAvatar().equals(other.getCommentAvatar()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getTopArticle() == null ? other.getTopArticle() == null : this.getTopArticle().equals(other.getTopArticle()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCommentName() == null) ? 0 : getCommentName().hashCode());
        result = prime * result + ((getCommentAvatar() == null) ? 0 : getCommentAvatar().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getTopArticle() == null) ? 0 : getTopArticle().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", commentName=").append(commentName);
        sb.append(", commentAvatar=").append(commentAvatar);
        sb.append(", comment=").append(comment);
        sb.append(", time=").append(time);
        sb.append(", topArticle=").append(topArticle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}