package com.example.marketplace.services;

import com.example.marketplace.models.User;
import com.example.marketplace.models.enums.Role;
import com.example.marketplace.repositories.UserRepository;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class UserServiceTest {
   static User user;
   @Autowired
    UserRepository userRepository;
   @Autowired
    UserService userService;
@BeforeAll
static void prepareData(){
    user = new User();
}

    @Test
    void createUserTest() {
        User user =new User();
        user.setEmail("tom@mail");
        boolean isUserCreated = userService.createUser(user);

        Assert.assertTrue(isUserCreated);
        Assert.assertTrue(CoreMatchers.is(user.getRoles()).matches(Collections.singleton(Role.ROLE_USER)));

        Mockito.verify(userRepository, Mockito.times(1)).save(user);


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