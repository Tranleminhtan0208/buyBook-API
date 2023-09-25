package com.example.BUYBOOK.RestController;

import com.example.BUYBOOK.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexRestController {
    @Autowired
    private LoginService ls;

    @PostMapping("/loginEncode")
    @ResponseBody
    public String LoginEncode(@RequestParam String u,@RequestParam String p) {
        String hoang = ls.LoginEncode(u,p);
        return hoang;
    }

    @PostMapping("/Signup")
    @ResponseBody
    public String Signup(@RequestParam String u,@RequestParam String p) {
        String hoang = ls.Signup(u,p);
        return hoang;
    }
}
