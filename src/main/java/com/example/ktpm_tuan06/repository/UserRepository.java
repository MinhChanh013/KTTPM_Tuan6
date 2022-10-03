package com.example.ktpm_tuan05.repository;

import com.example.ktpm_tuan05.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
