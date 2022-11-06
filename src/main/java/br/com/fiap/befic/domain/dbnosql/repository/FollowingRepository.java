package br.com.fiap.befic.domain.dbnosql.repository;

import br.com.fiap.befic.domain.dbnosql.model.FollowingItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowingRepository extends MongoRepository<FollowingItem, Long> {

    FollowingItem userId(Long userId);
}