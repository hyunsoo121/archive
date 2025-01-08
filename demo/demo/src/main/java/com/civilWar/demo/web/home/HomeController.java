package com.civilWar.demo.web.home;

import com.civilWar.demo.domain.entity.User;
import com.civilWar.demo.domain.user.UserRepository;
import com.civilWar.demo.domain.user.UserServiceImpl;
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

    private final UserServiceImpl userService;

    @GetMapping("")
    public String home(Model model){

        String id = SecurityContextHolder.getContext().getAuthentication().getName();

        User user = userService.findByEmail(id);

        if (user != null){
            model.addAttribute("username", user.getName());
        }



        return "html/home/home";
    }
}
