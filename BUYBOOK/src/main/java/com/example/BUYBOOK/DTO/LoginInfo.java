package com.example.BUYBOOK.DTO;
import java.util.Objects;

// import lombok.AllArgsConstructor;
// import lombok.Data;

// @Data
// @AllArgsConstructor
public class LoginInfo {
    public String userName;
    public String passWord;


    public LoginInfo() {
    }

    public LoginInfo(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public LoginInfo userName(String userName) {
        setUserName(userName);
        return this;
    }

    public LoginInfo passWord(String passWord) {
        setPassWord(passWord);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LoginInfo)) {
            return false;
        }
        LoginInfo loginInfo = (LoginInfo) o;
        return Objects.equals(userName, loginInfo.userName) && Objects.equals(passWord, loginInfo.passWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, passWord);
    }

    @Override
    public String toString() {
        return "{" +
            " userName='" + getUserName() + "'" +
            ", passWord='" + getPassWord() + "'" +
            "}";
    }
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
