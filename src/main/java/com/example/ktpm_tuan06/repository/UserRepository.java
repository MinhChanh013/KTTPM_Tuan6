package com.example.ktpm_tuan06.repository;

import com.example.ktpm_tuan06.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
