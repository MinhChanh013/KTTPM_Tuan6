package com.example.ktpm_tuan05.service;


import com.example.ktpm_tuan05.authen.UserPrincipal;
import com.example.ktpm_tuan05.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
