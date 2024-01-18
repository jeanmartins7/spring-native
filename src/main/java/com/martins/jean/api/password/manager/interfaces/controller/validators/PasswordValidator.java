package com.martins.jean.api.password.manager.interfaces.controller.validators;

import com.martins.jean.api.password.manager.interfaces.controller.validators.validation.constraint.Password;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PasswordValidator implements ConstraintValidator<Password, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        log.info("Verify Password");
        String password = value == null ? "" : value;

        return password.length() > 8 &&
                containsNumbers(password) &&
                containsUppercase(password) &&
                containsLowercase(password) &&
                hasWhiteSpace(password) &&
                hasRepeatCharacter(password) &&
                hasCharacterSpecial(password);
    }

    private boolean containsNumbers(String password) {
        return password.matches(".*.\\d.*.");
    }

    private boolean containsLowercase(String password) {
        return password.matches(".*.[a-z].*.");
    }

    private boolean containsUppercase(String password) {
        return password.matches(".*.[A-Z].*.");
    }

    private boolean hasCharacterSpecial(String password) {
        return password.matches(".*.[!@#$%^&*()\\-+].*.");
    }

    private boolean hasRepeatCharacter(String password) {
        for (int i = 0; i < password.length(); i++) {
            for (int j = i + 1; j < password.length(); j++) {
                if (password.charAt(i) == password.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean hasWhiteSpace(String password) {
        return !password.matches(".*.\\s.*.");
    }

}
