package com.example.tradeai.Services;

import org.springframework.stereotype.Service;

@Service
public class HealthService {
    
    public String SupabaseConnectionCheck(){
        return "Connection Succesful";
    }
}
