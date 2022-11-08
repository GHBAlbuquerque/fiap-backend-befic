package br.com.fiap.befic.api.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Getter
@Setter
@Accessors(chain = true)
public class HistoriaDto {
    private Long id;

    private Long autor;

    private String nome;

    private LocalDate dt_publicacao;

    private LocalDate dt_atualizacao;

    private String sinopse;

}
