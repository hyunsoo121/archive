package com.civilWar.demo.web.signup;

import com.civilWar.demo.domain.dto.SignupDto;
import com.civilWar.demo.domain.signup.SignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/signup")
public class SignupController {

    private final SignupService signupService;

    @GetMapping("")
    public String signupPage(){
        return "html/signup/signup";
    }

    @PostMapping("")
    public String signup(SignupDto signupDto){
        signupService.register(signupDto);
        return "redirect:/login";
    }
}
