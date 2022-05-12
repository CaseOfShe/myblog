package com.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;



/**
 * 
 * @TableName a_user
 */
@TableName(value ="a_user")
public class User implements Serializable {
    /**
     * 用户id标识符
     */
    @TableId(type = IdType.AUTO)
    private Integer aId;

    /**
     * 登录用户名
     */
    private String aName;

    /**
     * 登录密码
     */
    private String aPassword;

    /**
     * 权限
     */
    private Integer aRooter;

    /**
     * 创建时间
     */
    private String aCreatetime;

    /**
     * 更新时间
     */
    private String aUpdatetime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 用户id标识符
     */
    public Integer getaId() {
        return aId;
    }

    /**
     * 用户id标识符
     */
    public void setaId(Integer aId) {
        this.aId = aId;
    }

    /**
     * 登录用户名
     */
    public String getaName() {
        return aName;
    }

    /**
     * 登录用户名
     */
    public void setaName(String aName) {
        this.aName = aName;
    }

    /**
     * 登录密码
     */
    public String getaPassword() {
        return aPassword;
    }

    /**
     * 登录密码
     */
    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }

    /**
     * 权限
     */
    public Integer getaRooter() {
        return aRooter;
    }

    /**
     * 权限
     */
    public void setaRooter(Integer aRooter) {
        this.aRooter = aRooter;
    }

    /**
     * 创建时间
     */
    public String getaCreatetime() {
        return aCreatetime;
    }

    /**
     * 创建时间
     */
    public void setaCreatetime(String aCreatetime) {
        this.aCreatetime = aCreatetime;
    }

    /**
     * 更新时间
     */
    public String getaUpdatetime() {
        return aUpdatetime;
    }

    /**
     * 更新时间
     */
    public void setaUpdatetime(String aUpdatetime) {
        this.aUpdatetime = aUpdatetime;
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
        User other = (User) that;
        return (this.getaId() == null ? other.getaId() == null : this.getaId().equals(other.getaId()))
            && (this.getaName() == null ? other.getaName() == null : this.getaName().equals(other.getaName()))
            && (this.getaPassword() == null ? other.getaPassword() == null : this.getaPassword().equals(other.getaPassword()))
            && (this.getaRooter() == null ? other.getaRooter() == null : this.getaRooter().equals(other.getaRooter()))
            && (this.getaCreatetime() == null ? other.getaCreatetime() == null : this.getaCreatetime().equals(other.getaCreatetime()))
            && (this.getaUpdatetime() == null ? other.getaUpdatetime() == null : this.getaUpdatetime().equals(other.getaUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getaId() == null) ? 0 : getaId().hashCode());
        result = prime * result + ((getaName() == null) ? 0 : getaName().hashCode());
        result = prime * result + ((getaPassword() == null) ? 0 : getaPassword().hashCode());
        result = prime * result + ((getaRooter() == null) ? 0 : getaRooter().hashCode());
        result = prime * result + ((getaCreatetime() == null) ? 0 : getaCreatetime().hashCode());
        result = prime * result + ((getaUpdatetime() == null) ? 0 : getaUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aId=").append(aId);
        sb.append(", aName=").append(aName);
        sb.append(", aPassword=").append(aPassword);
        sb.append(", aRooter=").append(aRooter);
        sb.append(", aCreatetime=").append(aCreatetime);
        sb.append(", aUpdatetime=").append(aUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}