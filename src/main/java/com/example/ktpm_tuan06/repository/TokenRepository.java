package com.example.ktpm_tuan05.repository;


import com.example.ktpm_tuan05.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
