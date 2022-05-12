package com.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;


/**
 * 
 * @TableName article
 */
@TableName(value ="article")
public class Article implements Serializable {
    /**
     * 文章id
     */
    @TableId(type = IdType.AUTO)
    private Integer atId;

    /**
     * 作者名字
     */
    private String atAuthor;

    /**
     * 文章分类
     */
    private Integer atCategory;

    /**
     * 文章缩略图
     */
    private String atImg;

    /**
     * 文章标题
     */
    private String atTitle;

    /**
     * 文章内容
     */
    private String atContent;

    /**
     * 创建时间
     */
    private String atCreatetime;

    /**
     * 更新时间
     */
    private String atUpdatetime;

    /**
     * 置顶 1置顶 0否
     */
    private Boolean atTop;

    /**
     * 草稿 1是 0否
     */
    private Boolean atDraft;

    /**
     * 删除 1是 0否
     */
    private Boolean atDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 文章id
     */
    public Integer getAtId() {
        return atId;
    }

    /**
     * 文章id
     */
    public void setAtId(Integer atId) {
        this.atId = atId;
    }

    /**
     * 作者名字
     */
    public String getAtAuthor() {
        return atAuthor;
    }

    /**
     * 作者名字
     */
    public void setAtAuthor(String atAuthor) {
        this.atAuthor = atAuthor;
    }

    /**
     * 文章分类
     */
    public Integer getAtCategory() {
        return atCategory;
    }

    /**
     * 文章分类
     */
    public void setAtCategory(Integer atCategory) {
        this.atCategory = atCategory;
    }

    /**
     * 文章缩略图
     */
    public String getAtImg() {
        return atImg;
    }

    /**
     * 文章缩略图
     */
    public void setAtImg(String atImg) {
        this.atImg = atImg;
    }

    /**
     * 文章标题
     */
    public String getAtTitle() {
        return atTitle;
    }

    /**
     * 文章标题
     */
    public void setAtTitle(String atTitle) {
        this.atTitle = atTitle;
    }

    /**
     * 文章内容
     */
    public String getAtContent() {
        return atContent;
    }

    /**
     * 文章内容
     */
    public void setAtContent(String atContent) {
        this.atContent = atContent;
    }

    /**
     * 创建时间
     */
    public String getAtCreatetime() {
        return atCreatetime;
    }

    /**
     * 创建时间
     */
    public void setAtCreatetime(String atCreatetime) {
        this.atCreatetime = atCreatetime;
    }

    /**
     * 更新时间
     */
    public String getAtUpdatetime() {
        return atUpdatetime;
    }

    /**
     * 更新时间
     */
    public void setAtUpdatetime(String atUpdatetime) {
        this.atUpdatetime = atUpdatetime;
    }

    /**
     * 置顶 1置顶 0否
     */
    public Boolean getAtTop() {
        return atTop;
    }

    /**
     * 置顶 1置顶 0否
     */
    public void setAtTop(Boolean atTop) {
        this.atTop = atTop;
    }

    /**
     * 草稿 1是 0否
     */
    public Boolean getAtDraft() {
        return atDraft;
    }

    /**
     * 草稿 1是 0否
     */
    public void setAtDraft(Boolean atDraft) {
        this.atDraft = atDraft;
    }

    /**
     * 删除 1是 0否
     */
    public Boolean getAtDelete() {
        return atDelete;
    }

    /**
     * 删除 1是 0否
     */
    public void setAtDelete(Boolean atDelete) {
        this.atDelete = atDelete;
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
        Article other = (Article) that;
        return (this.getAtId() == null ? other.getAtId() == null : this.getAtId().equals(other.getAtId()))
            && (this.getAtAuthor() == null ? other.getAtAuthor() == null : this.getAtAuthor().equals(other.getAtAuthor()))
            && (this.getAtCategory() == null ? other.getAtCategory() == null : this.getAtCategory().equals(other.getAtCategory()))
            && (this.getAtImg() == null ? other.getAtImg() == null : this.getAtImg().equals(other.getAtImg()))
            && (this.getAtTitle() == null ? other.getAtTitle() == null : this.getAtTitle().equals(other.getAtTitle()))
            && (this.getAtContent() == null ? other.getAtContent() == null : this.getAtContent().equals(other.getAtContent()))
            && (this.getAtCreatetime() == null ? other.getAtCreatetime() == null : this.getAtCreatetime().equals(other.getAtCreatetime()))
            && (this.getAtUpdatetime() == null ? other.getAtUpdatetime() == null : this.getAtUpdatetime().equals(other.getAtUpdatetime()))
            && (this.getAtTop() == null ? other.getAtTop() == null : this.getAtTop().equals(other.getAtTop()))
            && (this.getAtDraft() == null ? other.getAtDraft() == null : this.getAtDraft().equals(other.getAtDraft()))
            && (this.getAtDelete() == null ? other.getAtDelete() == null : this.getAtDelete().equals(other.getAtDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAtId() == null) ? 0 : getAtId().hashCode());
        result = prime * result + ((getAtAuthor() == null) ? 0 : getAtAuthor().hashCode());
        result = prime * result + ((getAtCategory() == null) ? 0 : getAtCategory().hashCode());
        result = prime * result + ((getAtImg() == null) ? 0 : getAtImg().hashCode());
        result = prime * result + ((getAtTitle() == null) ? 0 : getAtTitle().hashCode());
        result = prime * result + ((getAtContent() == null) ? 0 : getAtContent().hashCode());
        result = prime * result + ((getAtCreatetime() == null) ? 0 : getAtCreatetime().hashCode());
        result = prime * result + ((getAtUpdatetime() == null) ? 0 : getAtUpdatetime().hashCode());
        result = prime * result + ((getAtTop() == null) ? 0 : getAtTop().hashCode());
        result = prime * result + ((getAtDraft() == null) ? 0 : getAtDraft().hashCode());
        result = prime * result + ((getAtDelete() == null) ? 0 : getAtDelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", atId=").append(atId);
        sb.append(", atAuthor=").append(atAuthor);
        sb.append(", atCategory=").append(atCategory);
        sb.append(", atImg=").append(atImg);
        sb.append(", atTitle=").append(atTitle);
        sb.append(", atContent=").append(atContent);
        sb.append(", atCreatetime=").append(atCreatetime);
        sb.append(", atUpdatetime=").append(atUpdatetime);
        sb.append(", atTop=").append(atTop);
        sb.append(", atDraft=").append(atDraft);
        sb.append(", atDelete=").append(atDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}