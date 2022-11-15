package br.com.fiap.befic.api.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Accessors(chain = true)
public class HistoriaDto {

    @NotNull
    private Long autor;

    @NotNull
    private String nome;

    @NotNull
    private String sinopse;

}
