package com.martins.jean.api.password.manager.interfaces.controller;

import com.martins.jean.api.password.manager.interfaces.json.request.PasswordRequest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping
@Slf4j
public class PasswordController {

    @PostMapping("/verify")
    public ResponseEntity<Boolean> postVerifyPassword(@RequestBody @Valid PasswordRequest request) {
        log.info("Password is valid");
        return ResponseEntity.ok(true);
    }
}
