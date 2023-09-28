package com.example.BUYBOOK.RestController;

import com.example.BUYBOOK.DTO.LoginInfo;
import com.example.BUYBOOK.DTO.SignUpDTO;
import com.example.BUYBOOK.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class IndexRestController {
    @Autowired
    private LoginService ls;

    @PostMapping("/loginEncode")
    @ResponseBody
    public String LoginEncode(@ModelAttribute("loginInfo") LoginInfo loginInfo) {
        String hoang = ls.LoginEncode(loginInfo);
        return hoang;
    }

    @PostMapping("/Signup")
    @ResponseBody
    public ResponseEntity<Object> Signup(@ModelAttribute("signUpDTO") SignUpDTO signupDTO) {
        String rs = ls.Signup(signupDTO);
        if (rs.contains("Error")){
            return new ResponseEntity<>("Sign up fail", HttpStatus.EXPECTATION_FAILED);
        } else{
            return new ResponseEntity<>("Sign up success", HttpStatus.OK);
        }

    }
}
