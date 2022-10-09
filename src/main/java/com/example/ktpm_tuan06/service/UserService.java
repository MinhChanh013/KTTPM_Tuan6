package com.example.ktpm_tuan06.service;


import com.example.ktpm_tuan06.authen.UserPrincipal;
import com.example.ktpm_tuan06.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
    void updatePass(String userName, String pass);
    
}
