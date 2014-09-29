package model;

import javax.persistence.*;

/**
 * 文件名:BaseModel.java
 * <p/>
 * 创建人:邓风森
 * <p/>
 * 创建时间:2014/9/29 20:52
 * <p/>
 * 文件描述:${TODO}
 */


@Entity
@Table(name = "base", schema = "", catalog = "stgsdb")
public class BaseModel {
    private int id;
    private String loginName;
    private String loginPassword;
    private String realName;

    /**
     * 构造函数
     * <p/>
     * 创建者:邓风森
     * <p/>
     * 修改时间:2014/9/29 20:52
     */
    public BaseModel() {

    }

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LOGIN_NAME", nullable = true, insertable = true, updatable = true, length = 100)
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "LOGIN_PASSWORD", nullable = false, insertable = true, updatable = true, length = 200)
    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    @Basic
    @Column(name = "REAL_NAME", nullable = true, insertable = true, updatable = true, length = 20)
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseModel baseModel = (BaseModel) o;

        if (id != baseModel.id) return false;
        if (loginName != null ? !loginName.equals(baseModel.loginName) : baseModel.loginName != null) return false;
        if (loginPassword != null ? !loginPassword.equals(baseModel.loginPassword) : baseModel.loginPassword != null)
            return false;
        if (realName != null ? !realName.equals(baseModel.realName) : baseModel.realName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (loginName != null ? loginName.hashCode() : 0);
        result = 31 * result + (loginPassword != null ? loginPassword.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        return result;
    }
}
