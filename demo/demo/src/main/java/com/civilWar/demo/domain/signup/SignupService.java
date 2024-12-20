package com.civilWar.demo.domain.signup;

import com.civilWar.demo.domain.entity.User;

public interface SignupService {
    void register(User user);
    User createUser(String email, String name, String password);
}
