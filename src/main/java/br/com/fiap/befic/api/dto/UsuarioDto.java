package br.com.fiap.befic.api.dto;

import br.com.fiap.befic.domain.dbsql.model.enums.GeneroEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Getter
@Setter
@Accessors(chain = true)
public class UsuarioDto {

    private Long id;

    private String nome;

    private LocalDate dt_nasc;

    private String celular;

    private String email;

    private GeneroEnum genero;

    private String perfil;

}
