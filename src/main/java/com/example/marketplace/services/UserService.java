package com.example.marketplace.services;

import com.example.marketplace.models.enums.Role;
import com.example.marketplace.models.User;
import com.example.marketplace.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public boolean createUser(User user){
       // String email = user.getEmail();
        if (userRepository.findByEmail(user.getEmail()) !=null)
            return false;
        user.setActive(true);
        user.getRoles().add(Role.ROLE_USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        log.info("Saving new user with email: {}", user.getEmail() );
        userRepository.save(user);
        return true;
    }
}
