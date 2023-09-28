package com.example.BUYBOOK.DTO;
import java.util.Objects;

public class SignUpDTO {
    private String userName;
    private String passWord;
    private String email;
    private String role;
    private String fullName;
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public SignUpDTO() {
    }

    public SignUpDTO(String userName, String passWord, String email, String role, String fullName) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.role = role;
        this.fullName = fullName;
    }

    public SignUpDTO userName(String userName) {
        setUserName(userName);
        return this;
    }

    public SignUpDTO passWord(String passWord) {
        setPassWord(passWord);
        return this;
    }

    public SignUpDTO email(String email) {
        setEmail(email);
        return this;
    }

    public SignUpDTO role(String role) {
        setRole(role);
        return this;
    }

    public SignUpDTO fullName(String fullName) {
        setFullName(fullName);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SignUpDTO)) {
            return false;
        }
        SignUpDTO signUpDTO = (SignUpDTO) o;
        return Objects.equals(userName, signUpDTO.userName) && Objects.equals(passWord, signUpDTO.passWord) && Objects.equals(email, signUpDTO.email) && Objects.equals(role, signUpDTO.role) && Objects.equals(fullName, signUpDTO.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, passWord, email, role, fullName);
    }

    @Override
    public String toString() {
        return "{" +
            " userName='" + getUserName() + "'" +
            ", passWord='" + getPassWord() + "'" +
            ", email='" + getEmail() + "'" +
            ", role='" + getRole() + "'" +
            ", fullName='" + getFullName() + "'" +
            "}";
    }
    
}
