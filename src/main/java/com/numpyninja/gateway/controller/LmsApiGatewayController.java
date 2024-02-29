package com.numpyninja.gateway.controller;


import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 
  
@RestController
@RequestMapping("/api") 
public class LmsApiGatewayController { 
  
    @GetMapping("/hello") 
    public ResponseEntity<String> getAnonymous() { 
        return ResponseEntity.ok("Welcome to API Gateway"); 
    } 
  
}
