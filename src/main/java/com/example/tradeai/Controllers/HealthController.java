package com.example.tradeai.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HealthController {

    @GetMapping("/api/healthcheck")
    public ResponseEntity<String> HealthCheck(@RequestParam(value = "name",defaultValue = "VD") String xyz){
        return ResponseEntity.status(200).body("health check is successful"+xyz);
    }
    
}
