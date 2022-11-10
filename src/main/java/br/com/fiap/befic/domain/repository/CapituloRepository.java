package br.com.fiap.befic.domain.repository;

import br.com.fiap.befic.domain.model.Capitulo;
import br.com.fiap.befic.domain.model.Historia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CapituloRepository extends JpaRepository<Capitulo, Long> {

    public List<Capitulo> findByHistoriaId(Long historia);
}
