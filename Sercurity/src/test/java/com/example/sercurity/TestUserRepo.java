package com.example.sercurity;

import com.example.sercurity.constants.State;
import com.example.sercurity.model.User;
import com.example.sercurity.repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

//@SpringBootTest
public class TestUserRepo {
    @Test
    public void addUser() {
        UserRepo userRepo = new UserRepo();
        User user = userRepo.addUser("John", "john@gmail.com", "test123456", State.PENDING);
        assertThat(user).isNotNull();
        System.out.println(user.getId());
        assertThat(user.getId()).isNotBlank();
    }

    @Test
    public void addUserWithOutState() {
        UserRepo userRepo = new UserRepo();
        User user = userRepo.addUser("John", "john@gmail.com", "test123456");
        assertThat(user).isNotNull();
        assertThat(user.getId()).isNotBlank();
        assertThat(user.getState()).isEqualTo(State.PENDING);
    }

    @Test
    public void isEmailExist() {
        UserRepo userRepo = new UserRepo();
        userRepo.addUser("John", "john@gmail.com", "test123456");
        userRepo.addUser("anh", "anh@gmail.com", "test1234aa56");
        userRepo.addUser("em", "em@gmail.com", "test1234dd56");
        assertThat(userRepo.isEmailExist("john@gmail.com")).isTrue();
        assertThat(userRepo.isEmailExist("josshn@gmail.com")).isFalse();

    }
}
