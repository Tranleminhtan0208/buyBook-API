package com.example.BUYBOOK.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.math.BigInteger;
import java.sql.Date;

@Entity
@Data
@Table(name="Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userID;
    @Column(name = "username")
    private String userName;
    @Column(name= "password")
    private String pasdsWord;
    @Column (name = "fullname")
    private String fullName;
    private Integer status;
    @Column (name = "roleid")
    private BigInteger roleID;
    @Column (name = "createddate")
    private Date createdDate;
    @Column (name = "modifieddate")
    private Date modifiedDate;
    @Column (name = "createdBy")
    private String createdby;
    @Column (name = "modifiedby")
    private String modifiedBy;
    @Column (name= "salt")
    private String salt;
    @Column (name = "email")
    private String email;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasdsWord() {
        return pasdsWord;
    }

    public void setPasdsWord(String pasdsWord) {
        this.pasdsWord = pasdsWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigInteger getRoleID() {
        return roleID;
    }

    public void setRoleID(BigInteger roleID) {
        this.roleID = roleID;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

