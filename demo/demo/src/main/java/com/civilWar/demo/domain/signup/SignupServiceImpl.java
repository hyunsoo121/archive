package com.civilWar.demo.domain.signup;

import com.civilWar.demo.domain.dto.SignupDto;
import com.civilWar.demo.domain.entity.User;
import com.civilWar.demo.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignupServiceImpl implements SignupService{
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void register(SignupDto signupDto) {
        User user = createUser(signupDto.getEmail(), signupDto.getName(), bCryptPasswordEncoder.encode(signupDto.getPassword()));
        userRepository.save(user);
    }

    @Override
    public User createUser(String email, String name, String password) {
        User user = User.builder()
                .name(name)
                .email(email)
                .password(password)
                .role("ROLE_USER")
                .build();

        userRepository.save(user);

        return user;
    }
}
