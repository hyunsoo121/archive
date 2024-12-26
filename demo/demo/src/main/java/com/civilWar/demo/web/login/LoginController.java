package com.civilWar.demo.web.login;

import com.civilWar.demo.domain.dto.LoginDto;
import com.civilWar.demo.domain.login.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    @GetMapping("")
    public String loginPage(){

        return "html/login/login";
    }

//    @PostMapping("/process")
//    public String login(LoginDto loginDto){
//
//        System.out.println("Email: " + loginDto.getEmail());
//        System.out.println("Password: " + loginDto.getPassword());
//
//        loginService.login(loginDto);
//        return "redirect:/";
//    }
}
