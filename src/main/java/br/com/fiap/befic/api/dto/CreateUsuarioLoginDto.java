package br.com.fiap.befic.api.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Accessors(chain = true)
public class CreateUsuarioLoginDto {

    @NotNull
    private String username;

    @NotNull
    private String senha;

    @NotNull
    private String nome;

    @NotNull
    private Integer ano;

    @NotNull
    private Integer mes;

    @NotNull
    private Integer dia;

    @NotNull
    private String celular;

    @NotNull
    private String email;

    @NotNull
    private String genero;

}
