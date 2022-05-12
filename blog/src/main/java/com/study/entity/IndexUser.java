package com.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;



/**
 * 
 * @TableName i_user
 */
@TableName(value ="i_user")
public class IndexUser implements Serializable {
    /**
     * 用户id
     */
    @TableId(type = IdType.AUTO)
    private Integer iId;

    /**
     * 用户名
     */
    private String iName;

    /**
     * 用户密码
     */
    private String iPassword;

    /**
     * 用户权限
     */
    private Integer iRooter;

    /**
     * 
     */
    private String iCreatetime;

    /**
     * 
     */
    private String iUpdatetime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    public Integer getiId() {
        return iId;
    }

    /**
     * 用户id
     */
    public void setiId(Integer iId) {
        this.iId = iId;
    }

    /**
     * 用户名
     */
    public String getiName() {
        return iName;
    }

    /**
     * 用户名
     */
    public void setiName(String iName) {
        this.iName = iName;
    }

    /**
     * 用户密码
     */
    public String getiPassword() {
        return iPassword;
    }

    /**
     * 用户密码
     */
    public void setiPassword(String iPassword) {
        this.iPassword = iPassword;
    }

    /**
     * 用户权限
     */
    public Integer getiRooter() {
        return iRooter;
    }

    /**
     * 用户权限
     */
    public void setiRooter(Integer iRooter) {
        this.iRooter = iRooter;
    }

    /**
     * 
     */
    public String getiCreatetime() {
        return iCreatetime;
    }

    /**
     * 
     */
    public void setiCreatetime(String iCreatetime) {
        this.iCreatetime = iCreatetime;
    }

    /**
     * 
     */
    public String getiUpdatetime() {
        return iUpdatetime;
    }

    /**
     * 
     */
    public void setiUpdatetime(String iUpdatetime) {
        this.iUpdatetime = iUpdatetime;
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
        IndexUser other = (IndexUser) that;
        return (this.getiId() == null ? other.getiId() == null : this.getiId().equals(other.getiId()))
            && (this.getiName() == null ? other.getiName() == null : this.getiName().equals(other.getiName()))
            && (this.getiPassword() == null ? other.getiPassword() == null : this.getiPassword().equals(other.getiPassword()))
            && (this.getiRooter() == null ? other.getiRooter() == null : this.getiRooter().equals(other.getiRooter()))
            && (this.getiCreatetime() == null ? other.getiCreatetime() == null : this.getiCreatetime().equals(other.getiCreatetime()))
            && (this.getiUpdatetime() == null ? other.getiUpdatetime() == null : this.getiUpdatetime().equals(other.getiUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getiId() == null) ? 0 : getiId().hashCode());
        result = prime * result + ((getiName() == null) ? 0 : getiName().hashCode());
        result = prime * result + ((getiPassword() == null) ? 0 : getiPassword().hashCode());
        result = prime * result + ((getiRooter() == null) ? 0 : getiRooter().hashCode());
        result = prime * result + ((getiCreatetime() == null) ? 0 : getiCreatetime().hashCode());
        result = prime * result + ((getiUpdatetime() == null) ? 0 : getiUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", iId=").append(iId);
        sb.append(", iName=").append(iName);
        sb.append(", iPassword=").append(iPassword);
        sb.append(", iRooter=").append(iRooter);
        sb.append(", iCreatetime=").append(iCreatetime);
        sb.append(", iUpdatetime=").append(iUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}