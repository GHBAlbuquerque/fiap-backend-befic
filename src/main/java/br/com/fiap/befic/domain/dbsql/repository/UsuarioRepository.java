package br.com.fiap.befic.domain.dbsql.repository;

import br.com.fiap.befic.domain.dbsql.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public List<Usuario> findByNome(String nome);

    public List<Usuario> findByNomeContaining(String nome);

    public List<Usuario> findByEmail(String email);
}
