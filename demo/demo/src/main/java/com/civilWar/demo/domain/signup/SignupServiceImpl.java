package com.civilWar.demo.domain.signup;

import com.civilWar.demo.domain.entity.User;
import com.civilWar.demo.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignupServiceImpl implements SignupService{
    private final UserRepository userRepository;
    @Override
    public void register(User user) {
        userRepository.save(user);
    }

    @Override
    public User createUser(String email, String name, String password) {
        User user = User.builder()
                .name(name)
                .email(email)
                .password(password).build();

        userRepository.save(user);

        return user;
    }
}
