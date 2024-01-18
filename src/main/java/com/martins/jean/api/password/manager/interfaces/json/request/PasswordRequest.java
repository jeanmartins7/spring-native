package com.martins.jean.api.password.manager.interfaces.json.request;

import com.martins.jean.api.password.manager.interfaces.controller.validators.validation.constraint.Password;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PasswordRequest implements Serializable {

    @NotBlank
    @Password
    String password;

}
