package br.com.fiap.befic.domain.repository;

import br.com.fiap.befic.domain.model.Capitulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapituloRepository extends JpaRepository<Capitulo, Long> {
}
