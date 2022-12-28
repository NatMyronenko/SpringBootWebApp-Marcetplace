package com.example.marketplace.repositories;

import com.example.marketplace.models.User;
import org.apache.coyote.http11.upgrade.UpgradeServletOutputStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void findByEmailTest() {
        User user = new User();
        user.setEmail("tom@email");
        assertEquals("tom@email",user.getEmail());
    }
}