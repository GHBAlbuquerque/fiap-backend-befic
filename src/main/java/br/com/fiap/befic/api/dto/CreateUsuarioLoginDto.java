package br.com.fiap.befic.api.dto;

import br.com.fiap.befic.domain.model.enums.GeneroEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

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
    private LocalDate dtNasc;

    @NotNull
    private String celular;

    @NotNull
    private String email;

    @NotNull
    private String genero;

}
