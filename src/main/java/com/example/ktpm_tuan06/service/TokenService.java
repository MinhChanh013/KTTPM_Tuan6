package com.example.ktpm_tuan06.service;


import com.example.ktpm_tuan06.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
    
    
    
}
