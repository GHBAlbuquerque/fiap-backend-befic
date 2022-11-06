package br.com.fiap.befic.domain.repository;

import br.com.fiap.befic.domain.model.Seguidor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeguidorRepository extends MongoRepository<Seguidor, Long> {

    List<Seguidor> findAllByUserId(Long userId);

}