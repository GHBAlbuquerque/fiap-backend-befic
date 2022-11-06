package br.com.fiap.befic.domain.dbnosql.repository;

import br.com.fiap.befic.domain.dbnosql.model.FollowerItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowerRepository extends MongoRepository<FollowerItem, Long> {

    FollowerItem userId(Long userId);
}