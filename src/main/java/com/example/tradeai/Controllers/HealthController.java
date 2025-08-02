package com.example.tradeai.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//datasource
import javax.sql.DataSource;
import java.sql.Connection;



@RestController
public class HealthController {

    @Autowired
    public DataSource dataSource;

    @GetMapping("/api/healthcheck")
    public ResponseEntity<String> HealthCheck(){

        try (Connection conn = dataSource.getConnection()) {
            if(conn.isValid(3)){
                return ResponseEntity.status(200).body("health check success");
            }else{
                return ResponseEntity.status(500).body("health check invalid");
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body("health check failed" + e.getMessage());
        }
        
    }
    
}
