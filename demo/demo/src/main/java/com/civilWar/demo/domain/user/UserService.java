package com.civilWar.demo.domain.user;

import com.civilWar.demo.domain.entity.User;

public interface UserService {
    void save(User user);
    User findById(Long id);
    User findByEmail(String email);
    void deleteById(Long id);
    void update(User user);
}
