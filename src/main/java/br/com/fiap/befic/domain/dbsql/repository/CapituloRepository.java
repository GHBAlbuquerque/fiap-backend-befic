package br.com.fiap.befic.domain.dbsql.repository;

import br.com.fiap.befic.domain.dbsql.model.Capitulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapituloRepository extends JpaRepository<Capitulo, Long> {
}
