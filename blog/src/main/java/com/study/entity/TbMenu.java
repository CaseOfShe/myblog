package com.study.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;


/**
 * 
 * @TableName tb_menu
 */
@TableName(value ="tb_menu")
public class TbMenu implements Serializable {
    /**
     * 菜单id
     */
    @TableId
    private Integer escId;

    /**
     * 菜单名
     */
    private String escName;

    /**
     * 菜单路径
     */
    private String escPath;

    /**
     * 菜单组件
     */
    private String escComponent;

    /**
     * 菜单icon
     */
    private String escIcon;

    /**
     * 创建时间
     */
    private String escCreateTime;

    /**
     * 更新时间
     */
    private String escUpdateTime;

    /**
     * 排序
     */
    private Byte orderNum;

    /**
     * 上级id
     */
    private Integer parentId;

    /**
     * 是否禁用
     */
    private Boolean isDisabled;

    /**
     * 是否隐藏
     */
    private Boolean isHidden;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 菜单id
     */
    public Integer getEscId() {
        return escId;
    }

    /**
     * 菜单id
     */
    public void setEscId(Integer escId) {
        this.escId = escId;
    }

    /**
     * 菜单名
     */
    public String getEscName() {
        return escName;
    }

    /**
     * 菜单名
     */
    public void setEscName(String escName) {
        this.escName = escName;
    }

    /**
     * 菜单路径
     */
    public String getEscPath() {
        return escPath;
    }

    /**
     * 菜单路径
     */
    public void setEscPath(String escPath) {
        this.escPath = escPath;
    }

    /**
     * 菜单组件
     */
    public String getEscComponent() {
        return escComponent;
    }

    /**
     * 菜单组件
     */
    public void setEscComponent(String escComponent) {
        this.escComponent = escComponent;
    }

    /**
     * 菜单icon
     */
    public String getEscIcon() {
        return escIcon;
    }

    /**
     * 菜单icon
     */
    public void setEscIcon(String escIcon) {
        this.escIcon = escIcon;
    }

    /**
     * 创建时间
     */
    public String getEscCreateTime() {
        return escCreateTime;
    }

    /**
     * 创建时间
     */
    public void setEscCreateTime(String escCreateTime) {
        this.escCreateTime = escCreateTime;
    }

    /**
     * 更新时间
     */
    public String getEscUpdateTime() {
        return escUpdateTime;
    }

    /**
     * 更新时间
     */
    public void setEscUpdateTime(String escUpdateTime) {
        this.escUpdateTime = escUpdateTime;
    }

    /**
     * 排序
     */
    public Byte getOrderNum() {
        return orderNum;
    }

    /**
     * 排序
     */
    public void setOrderNum(Byte orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 上级id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 上级id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 是否禁用
     */
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    /**
     * 是否禁用
     */
    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
     * 是否隐藏
     */
    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * 是否隐藏
     */
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
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
        TbMenu other = (TbMenu) that;
        return (this.getEscId() == null ? other.getEscId() == null : this.getEscId().equals(other.getEscId()))
            && (this.getEscName() == null ? other.getEscName() == null : this.getEscName().equals(other.getEscName()))
            && (this.getEscPath() == null ? other.getEscPath() == null : this.getEscPath().equals(other.getEscPath()))
            && (this.getEscComponent() == null ? other.getEscComponent() == null : this.getEscComponent().equals(other.getEscComponent()))
            && (this.getEscIcon() == null ? other.getEscIcon() == null : this.getEscIcon().equals(other.getEscIcon()))
            && (this.getEscCreateTime() == null ? other.getEscCreateTime() == null : this.getEscCreateTime().equals(other.getEscCreateTime()))
            && (this.getEscUpdateTime() == null ? other.getEscUpdateTime() == null : this.getEscUpdateTime().equals(other.getEscUpdateTime()))
            && (this.getOrderNum() == null ? other.getOrderNum() == null : this.getOrderNum().equals(other.getOrderNum()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getIsDisabled() == null ? other.getIsDisabled() == null : this.getIsDisabled().equals(other.getIsDisabled()))
            && (this.getIsHidden() == null ? other.getIsHidden() == null : this.getIsHidden().equals(other.getIsHidden()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEscId() == null) ? 0 : getEscId().hashCode());
        result = prime * result + ((getEscName() == null) ? 0 : getEscName().hashCode());
        result = prime * result + ((getEscPath() == null) ? 0 : getEscPath().hashCode());
        result = prime * result + ((getEscComponent() == null) ? 0 : getEscComponent().hashCode());
        result = prime * result + ((getEscIcon() == null) ? 0 : getEscIcon().hashCode());
        result = prime * result + ((getEscCreateTime() == null) ? 0 : getEscCreateTime().hashCode());
        result = prime * result + ((getEscUpdateTime() == null) ? 0 : getEscUpdateTime().hashCode());
        result = prime * result + ((getOrderNum() == null) ? 0 : getOrderNum().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getIsDisabled() == null) ? 0 : getIsDisabled().hashCode());
        result = prime * result + ((getIsHidden() == null) ? 0 : getIsHidden().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", escId=").append(escId);
        sb.append(", escName=").append(escName);
        sb.append(", escPath=").append(escPath);
        sb.append(", escComponent=").append(escComponent);
        sb.append(", escIcon=").append(escIcon);
        sb.append(", escCreateTime=").append(escCreateTime);
        sb.append(", escUpdateTime=").append(escUpdateTime);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", parentId=").append(parentId);
        sb.append(", isDisabled=").append(isDisabled);
        sb.append(", isHidden=").append(isHidden);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}