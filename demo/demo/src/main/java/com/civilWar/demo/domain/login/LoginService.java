package com.civilWar.demo.domain.login;

import com.civilWar.demo.domain.dto.LoginDto;
import com.civilWar.demo.domain.entity.User;
import org.springframework.stereotype.Service;


public interface LoginService {
    User login(LoginDto loginDto);
}
