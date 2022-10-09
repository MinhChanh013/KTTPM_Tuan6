package com.example.ktpm_tuan06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ktpm_tuan06.activeMQ.Listener;
import com.example.ktpm_tuan06.activeMQ.Producer;

@SpringBootApplication
public class KtpmTuan06Application {
	
    public static void main(String[] args) {
        SpringApplication.run(KtpmTuan06Application.class, args);
        
    }

}
