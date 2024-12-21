package com.civilWar.demo.web.login;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {

    @GetMapping("")
    public String login(){

        return "html/login/login";
    }

//    @PutMapping("")
//    public String loginPost(){
//
//    }
}
