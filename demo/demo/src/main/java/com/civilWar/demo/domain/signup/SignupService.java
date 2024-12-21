package com.civilWar.demo.domain.signup;

import com.civilWar.demo.domain.dto.SignupDto;
import com.civilWar.demo.domain.entity.User;

public interface SignupService {
    void register(SignupDto signupDto);
    User createUser(String email, String name, String password);
}
