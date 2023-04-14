package com.example.sercurity.service;

import com.example.sercurity.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceInMemory implements UserService {
    @Override
    public User login(String email, String password) {
        return null;
    }

    @Override
    public boolean logout(String email) {
        return false;
    }

    @Override
    public User addUser(String fullName, String email, String password) {
        return null;
    }

    @Override
    public Boolean activateUser(String activation_code) {
        return null;
    }

    @Override
    public Boolean updatePassword(String email, String password) {
        return null;
    }

    @Override
    public Boolean updateEmail(String email, String newEmail) {
        return null;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public User findById(String id) {
        return null;
    }
}
