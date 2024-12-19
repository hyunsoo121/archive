package com.civilWar.demo.domain.user;


import com.civilWar.demo.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    default Optional<User> findByEmail(String email) {
        if (email == null) {
            return Optional.empty();
        }

        return findAll().stream()
                .filter(m -> {
                    String userEmail = m.getEmail();
                    return userEmail != null && email.equals(userEmail);
                })
                .findFirst();
    }
}