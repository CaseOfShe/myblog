package com.study.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;



/**
 * 
 * @TableName tb_resouse
 */
@TableName(value ="tb_resouse")
public class TbResouse implements Serializable {
    /**
     * id
     */
    @TableId
    private Integer rId;

    /**
     * 资源名
     */
    private String rTitle;

    /**
     * 资源地址
     */
    private String rAddress;

    /**
     * 资源头像或图片
     */
    private String rAvatar;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public Integer getrId() {
        return rId;
    }

    /**
     * id
     */
    public void setrId(Integer rId) {
        this.rId = rId;
    }

    /**
     * 资源名
     */
    public String getrTitle() {
        return rTitle;
    }

    /**
     * 资源名
     */
    public void setrTitle(String rTitle) {
        this.rTitle = rTitle;
    }

    /**
     * 资源地址
     */
    public String getrAddress() {
        return rAddress;
    }

    /**
     * 资源地址
     */
    public void setrAddress(String rAddress) {
        this.rAddress = rAddress;
    }

    /**
     * 资源头像或图片
     */
    public String getrAvatar() {
        return rAvatar;
    }

    /**
     * 资源头像或图片
     */
    public void setrAvatar(String rAvatar) {
        this.rAvatar = rAvatar;
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
        TbResouse other = (TbResouse) that;
        return (this.getrId() == null ? other.getrId() == null : this.getrId().equals(other.getrId()))
            && (this.getrTitle() == null ? other.getrTitle() == null : this.getrTitle().equals(other.getrTitle()))
            && (this.getrAddress() == null ? other.getrAddress() == null : this.getrAddress().equals(other.getrAddress()))
            && (this.getrAvatar() == null ? other.getrAvatar() == null : this.getrAvatar().equals(other.getrAvatar()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getrId() == null) ? 0 : getrId().hashCode());
        result = prime * result + ((getrTitle() == null) ? 0 : getrTitle().hashCode());
        result = prime * result + ((getrAddress() == null) ? 0 : getrAddress().hashCode());
        result = prime * result + ((getrAvatar() == null) ? 0 : getrAvatar().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rId=").append(rId);
        sb.append(", rTitle=").append(rTitle);
        sb.append(", rAddress=").append(rAddress);
        sb.append(", rAvatar=").append(rAvatar);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}