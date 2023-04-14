package com.example.sercurity.service;

import com.example.sercurity.model.User;

import java.util.Optional;

public interface UserService {
    User login(String email, String password);
    boolean logout(String email);

    User addUser(String fullName, String email, String password);
    Boolean activateUser(String activation_code);

    Boolean updatePassword(String email, String password);
    Boolean updateEmail(String email, String newEmail);

    Optional<User> findByEmail(String email);
    User findById(String id);


}
