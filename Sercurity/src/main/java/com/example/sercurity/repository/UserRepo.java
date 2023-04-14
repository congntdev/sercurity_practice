package com.example.sercurity.repository;

import com.example.sercurity.constants.State;
import com.example.sercurity.model.User;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepo {
    private ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>();

    public User addUser(String fullName, String email, String hashedPassword) {
        return addUser(fullName, email, hashedPassword, State.PENDING);
    }
    public User addUser(String fullName, String email, String hashedPassword, State state) {
        String id = UUID.randomUUID().toString();
        User user = User.builder()
                .id(id)
                .fullName(fullName)
                .hashedPassword(hashedPassword)
                .email(email)
                .state(state)
                .build();
        users.put(id, user);
        return user;
    }

    public boolean isEmailExist(String email) {
        return users.values().stream().anyMatch(user -> user.getEmail().equalsIgnoreCase(email));
    }
}
