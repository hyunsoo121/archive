package com.civilWar.demo.domain.login;

import com.civilWar.demo.domain.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    @Override
    public User login(String email, String password) {
        return null;
    }
}
