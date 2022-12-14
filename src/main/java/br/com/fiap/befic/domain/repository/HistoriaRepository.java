package br.com.fiap.befic.domain.repository;

import br.com.fiap.befic.domain.model.Historia;
import br.com.fiap.befic.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoriaRepository extends JpaRepository<Historia, Long> {

    public List<Historia> findByNomeContaining(String nome);

    public List<Historia> findByNomeAndAutor(String nome, Usuario autor);

    public List<Historia> findByAutor(Usuario autor);
}
