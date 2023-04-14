package com.example.sercurity.model;

import com.example.sercurity.constants.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class User {
    private String id;
    private String fullName;
    private String email;
    private String hashedPassword;
    private State state;
}
