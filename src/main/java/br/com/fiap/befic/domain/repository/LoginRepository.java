package br.com.fiap.befic.domain.repository;

import br.com.fiap.befic.domain.model.Login;
import br.com.fiap.befic.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoginRepository extends JpaRepository<Login, Long> {

    public List<Login> findByUsuario(Usuario usuario);

    public List<Login> findByUsername(String username);

    public List<Login> findByUsernameAndSenha(String username, String senha);
}
