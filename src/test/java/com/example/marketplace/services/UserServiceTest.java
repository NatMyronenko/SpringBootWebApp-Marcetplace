package com.example.marketplace.services;

import com.example.marketplace.models.User;
import com.example.marketplace.repositories.UserRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class UserServiceTest {
   static User user;
    UserRepository userRepository;
    UserService userService;
@BeforeAll
static void prepareData(){
    user = new User();
}

    @Test
    void createUserTest() {
        User user =new User();
        user.setEmail("tom@mail");
        assertEquals("tom@mail",user.getEmail());

    }

    @Test
  //  void findListAllUsersTest() {
       void whenGivenEmail_shouldReturnListUsers(){


    }

    @Test
    void banUser() {
    }

    @Test
    void changeUserRoles() {
    }

    @Test
    void getUserByPrincipal() {
    }
}