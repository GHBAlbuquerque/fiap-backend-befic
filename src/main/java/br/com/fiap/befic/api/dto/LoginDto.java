package br.com.fiap.befic.api.dto;

import br.com.fiap.befic.domain.model.Usuario;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class LoginDto {

    private Long id;

    private Usuario usuario;

    private String username;

    private String senha;
}
