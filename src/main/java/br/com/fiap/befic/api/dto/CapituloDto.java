package br.com.fiap.befic.api.dto;

import br.com.fiap.befic.domain.model.Historia;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Getter
@Setter
@Accessors(chain = true)
public class CapituloDto {

    private Long numero;

    private Long historia;

    private String titulo;

    private LocalDate dt_publicacao;

    private LocalDate dt_atualizacao;

    private String conteudo;

    private String notasIniciais;

    private String notasFinais;

}
