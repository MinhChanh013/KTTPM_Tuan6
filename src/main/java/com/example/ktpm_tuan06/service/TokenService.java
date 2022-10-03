package com.example.ktpm_tuan05.service;


import com.example.ktpm_tuan05.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
