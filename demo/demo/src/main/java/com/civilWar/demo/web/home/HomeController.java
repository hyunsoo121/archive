package com.civilWar.demo.web.home;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class HomeController {

    @GetMapping("")
    public String home(Model model, HttpSession httpSession){

        Object username = httpSession.getAttribute("username");

        model.addAttribute("username", username);

        return "html/home/home";
    }
}
