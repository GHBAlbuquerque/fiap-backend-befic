package br.com.fiap.befic.api.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Accessors(chain = true)
public class CapituloDto {

    @NotNull
    private Long historiaId;

    @NotNull
    private String titulo;

    @NotNull
    private String conteudo;

    private String notasIniciais;

    private String notasFinais;

}
