package com.ci_cd.ci_cd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CiCdController {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(){
        return ResponseEntity.ok("welcome to ci_cd project and ci cd is working fine");
    }
}
