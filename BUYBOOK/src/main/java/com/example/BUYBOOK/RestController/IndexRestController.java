package com.example.BUYBOOK.RestController;

import com.example.BUYBOOK.DTO.LoginInfo;
import com.example.BUYBOOK.DTO.SignUpDTO;
import com.example.BUYBOOK.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexRestController {
    @Autowired
    private LoginService ls;

    @PostMapping("/loginEncode")
    @ResponseBody
    public String LoginEncode(@RequestBody LoginInfo loginInf) {
        String hoang = ls.LoginEncode(loginInf);
        return hoang;
    }

    @PostMapping("/Signup")
    @ResponseBody
    public ResponseEntity<Object> Signup(@RequestBody SignUpDTO signupDTO) {
        String rs = ls.Signup(signupDTO);
        if (rs.contains("Error")){
            return new ResponseEntity<>("Sign up fail", HttpStatus.EXPECTATION_FAILED);
        } else{
            return new ResponseEntity<>("Sign up success", HttpStatus.OK);
        }

    }
}
