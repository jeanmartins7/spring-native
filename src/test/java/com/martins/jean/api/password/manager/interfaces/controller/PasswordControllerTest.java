package com.martins.jean.api.password.manager.interfaces.controller;

import com.martins.jean.api.password.manager.interfaces.json.request.PasswordRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PasswordControllerTest {

    @InjectMocks
    private PasswordController passwordController;

    @Test
    @DisplayName("when post verify password and returns password is valid")
    void post_verifyPassword_ReturnsTrue() {
        PasswordRequest passwordRequest = getRequestPasswordEmpty();
        passwordRequest.setPassword("AbTp9!fok");

        boolean passwordValid = passwordController.postVerifyPassword(passwordRequest).getBody();

        Assertions.assertNotNull(passwordValid);
        Assertions.assertEquals(true, passwordValid);

    }

    private PasswordRequest getRequestPasswordEmpty() {
        return PasswordRequest.builder()
                .password("")
                .build();
    }

}