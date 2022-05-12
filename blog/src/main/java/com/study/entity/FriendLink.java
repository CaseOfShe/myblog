package com.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;


/**
 * 
 * @TableName friend_link
 */
@TableName(value ="friend_link")
public class FriendLink implements Serializable {
    /**
     * 友链id
     */
    @TableId(type = IdType.AUTO)
    private Integer linId;

    /**
     * 链接名字
     */
    private String linName;

    /**
     * 链接头像
     */
    private String linkAvatar;

    /**
     * 链接地址
     */
    private String linkAddress;

    /**
     * 链接介绍
     */
    private String linkIntro;

    /**
     * 链接时间
     */
    private String linkTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 友链id
     */
    public Integer getLinId() {
        return linId;
    }

    /**
     * 友链id
     */
    public void setLinId(Integer linId) {
        this.linId = linId;
    }

    /**
     * 链接名字
     */
    public String getLinName() {
        return linName;
    }

    /**
     * 链接名字
     */
    public void setLinName(String linName) {
        this.linName = linName;
    }

    /**
     * 链接头像
     */
    public String getLinkAvatar() {
        return linkAvatar;
    }

    /**
     * 链接头像
     */
    public void setLinkAvatar(String linkAvatar) {
        this.linkAvatar = linkAvatar;
    }

    /**
     * 链接地址
     */
    public String getLinkAddress() {
        return linkAddress;
    }

    /**
     * 链接地址
     */
    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress;
    }

    /**
     * 链接介绍
     */
    public String getLinkIntro() {
        return linkIntro;
    }

    /**
     * 链接介绍
     */
    public void setLinkIntro(String linkIntro) {
        this.linkIntro = linkIntro;
    }

    /**
     * 链接时间
     */
    public String getLinkTime() {
        return linkTime;
    }

    /**
     * 链接时间
     */
    public void setLinkTime(String linkTime) {
        this.linkTime = linkTime;
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
        FriendLink other = (FriendLink) that;
        return (this.getLinId() == null ? other.getLinId() == null : this.getLinId().equals(other.getLinId()))
            && (this.getLinName() == null ? other.getLinName() == null : this.getLinName().equals(other.getLinName()))
            && (this.getLinkAvatar() == null ? other.getLinkAvatar() == null : this.getLinkAvatar().equals(other.getLinkAvatar()))
            && (this.getLinkAddress() == null ? other.getLinkAddress() == null : this.getLinkAddress().equals(other.getLinkAddress()))
            && (this.getLinkIntro() == null ? other.getLinkIntro() == null : this.getLinkIntro().equals(other.getLinkIntro()))
            && (this.getLinkTime() == null ? other.getLinkTime() == null : this.getLinkTime().equals(other.getLinkTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLinId() == null) ? 0 : getLinId().hashCode());
        result = prime * result + ((getLinName() == null) ? 0 : getLinName().hashCode());
        result = prime * result + ((getLinkAvatar() == null) ? 0 : getLinkAvatar().hashCode());
        result = prime * result + ((getLinkAddress() == null) ? 0 : getLinkAddress().hashCode());
        result = prime * result + ((getLinkIntro() == null) ? 0 : getLinkIntro().hashCode());
        result = prime * result + ((getLinkTime() == null) ? 0 : getLinkTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", linId=").append(linId);
        sb.append(", linName=").append(linName);
        sb.append(", linkAvatar=").append(linkAvatar);
        sb.append(", linkAddress=").append(linkAddress);
        sb.append(", linkIntro=").append(linkIntro);
        sb.append(", linkTime=").append(linkTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}