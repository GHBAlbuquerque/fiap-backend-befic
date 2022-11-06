package br.com.fiap.befic.domain.dbsql.repository;

import br.com.fiap.befic.domain.dbsql.model.Login;
import br.com.fiap.befic.domain.dbsql.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoginRepository extends JpaRepository<Login, Long> {

    public List<Usuario> findByUsername(String username);
}
