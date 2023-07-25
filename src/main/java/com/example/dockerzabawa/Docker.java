package com.example.dockerzabawa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Docker {
    @GetMapping
    public ResponseEntity<String> cos(){
        return ResponseEntity.ok("get ogolny");
    }
    @GetMapping("/docker")
    public ResponseEntity<String> cos1(){
        return ResponseEntity.ok("get");
    }
    @PostMapping("/docker")
    public ResponseEntity<String> cos2(){
        return ResponseEntity.ok("post");
    }
}
