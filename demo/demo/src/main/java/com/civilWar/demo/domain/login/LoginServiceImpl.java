package com.civilWar.demo.domain.login;

import com.civilWar.demo.domain.dto.LoginDto;
import com.civilWar.demo.domain.entity.User;
import com.civilWar.demo.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final UserRepository userRepository;
    @Override
    public User login(LoginDto loginDto) {
        return userRepository.findByEmail(loginDto.getEmail())
                .filter(m -> m.getPassword().equals(loginDto.getPassword()))
                .orElse(null);
    }
}
