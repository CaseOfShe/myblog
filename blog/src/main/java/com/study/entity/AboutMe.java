package com.study.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;



/**
 * 
 * @TableName about_me
 */
@TableName(value ="about_me")
public class AboutMe implements Serializable {
    /**
     * id
     */
    @TableId
    private Integer abId;

    /**
     * 标题
     */
    private String abTitle;

    /**
     * 内容
     */
    private String abContent;

    /**
     * 图片
     */
    private String abImage;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public Integer getAbId() {
        return abId;
    }

    /**
     * id
     */
    public void setAbId(Integer abId) {
        this.abId = abId;
    }

    /**
     * 标题
     */
    public String getAbTitle() {
        return abTitle;
    }

    /**
     * 标题
     */
    public void setAbTitle(String abTitle) {
        this.abTitle = abTitle;
    }

    /**
     * 内容
     */
    public String getAbContent() {
        return abContent;
    }

    /**
     * 内容
     */
    public void setAbContent(String abContent) {
        this.abContent = abContent;
    }

    /**
     * 图片
     */
    public String getAbImage() {
        return abImage;
    }

    /**
     * 图片
     */
    public void setAbImage(String abImage) {
        this.abImage = abImage;
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
        AboutMe other = (AboutMe) that;
        return (this.getAbId() == null ? other.getAbId() == null : this.getAbId().equals(other.getAbId()))
            && (this.getAbTitle() == null ? other.getAbTitle() == null : this.getAbTitle().equals(other.getAbTitle()))
            && (this.getAbContent() == null ? other.getAbContent() == null : this.getAbContent().equals(other.getAbContent()))
            && (this.getAbImage() == null ? other.getAbImage() == null : this.getAbImage().equals(other.getAbImage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAbId() == null) ? 0 : getAbId().hashCode());
        result = prime * result + ((getAbTitle() == null) ? 0 : getAbTitle().hashCode());
        result = prime * result + ((getAbContent() == null) ? 0 : getAbContent().hashCode());
        result = prime * result + ((getAbImage() == null) ? 0 : getAbImage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", abId=").append(abId);
        sb.append(", abTitle=").append(abTitle);
        sb.append(", abContent=").append(abContent);
        sb.append(", abImage=").append(abImage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}