package com.example.BUYBOOK.services;

import com.example.BUYBOOK.DTO.LoginInfo;
import com.example.BUYBOOK.Utils.Constants;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

@Service
public class LoginService {
    public boolean checkLoginInfo(LoginInfo logInf){
        if(logInf.getUserName().contains("123")&& logInf.getPassWord().contains("123")){
            return true;
        }
        return false;
    }

    public String LoginEncode(String userName, String passWord){
        //data da có trong db
        //1 check password
            //get salt tu db
        String saltStr = Constants.salt1;
            //chuyen salt sang byte[]
        byte[] salt =Base64.getDecoder().decode(saltStr);
            //covert password sang hashcode vs salt co san
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        md.update(salt);
        byte[] hashedPassword = md.digest(passWord.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : hashedPassword)
            sb.append(String.format("%02x", b));
        System.out.println(sb);
        String sb1 = sb.toString();
            //check password dc hashed and salted vs passw dc luu o database
        if (sb1.compareTo(Constants.passWord1)==0){
            return "dung r";
        } else{
            return "sai r";
        }
    }

    public String Signup(String userName, String passWord){
        // trong data chua co j

        //logic
        // 1) check u ton tai chua -> neu ton tại throw
        // 2) Xử lý phan passwword
            //I)) Tạo salt
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
            //II) Chuyen salt thanh String
        String saltStr = Base64.getEncoder().encodeToString(salt);
            ///III) hash password
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        md.update(salt);
        byte[] hashedPassword = md.digest(passWord.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : hashedPassword)
            sb.append(String.format("%02x", b));
        System.out.println(sb);
            /// IV) Save password và salt vao database(tinh sau)
        return "pw: "+ sb +" salt: " + saltStr;
    }
}
