package com.example.ktpm_tuan06.repository;


import com.example.ktpm_tuan06.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
