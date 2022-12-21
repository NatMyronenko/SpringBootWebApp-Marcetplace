package com.example.marketplace.repositories;

import com.example.marketplace.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
    /**
     * Find a user by email.
     *
     * @param email The email address of the user you want to find.
     * @return A User object
     */
    User findByEmail(String email);

}
