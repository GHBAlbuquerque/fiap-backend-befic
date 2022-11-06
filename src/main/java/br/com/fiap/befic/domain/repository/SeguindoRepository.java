package br.com.fiap.befic.domain.repository;

import br.com.fiap.befic.domain.model.Seguindo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeguindoRepository extends MongoRepository<Seguindo, Long> {

    List<Seguindo> findAllByUserId(Long userId);
}