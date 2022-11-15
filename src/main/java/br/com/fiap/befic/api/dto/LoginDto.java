package br.com.fiap.befic.api.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Accessors(chain = true)
public class LoginDto {

    @NotNull
    private String username;

    @NotNull
    private String senha;
}
