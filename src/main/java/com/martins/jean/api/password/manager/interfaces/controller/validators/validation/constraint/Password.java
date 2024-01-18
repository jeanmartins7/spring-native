package com.martins.jean.api.password.manager.interfaces.controller.validators.validation.constraint;

import com.martins.jean.api.password.manager.interfaces.controller.validators.PasswordValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Documented
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordValidator.class)
public @interface Password {

    String message() default "Password is invalid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
