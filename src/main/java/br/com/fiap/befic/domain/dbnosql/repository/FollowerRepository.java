package br.com.fiap.befic.domain.dbnosql.repository;

import br.com.fiap.befic.domain.dbnosql.model.Follower;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FollowerRepository extends MongoRepository<Follower, Long> {

    List<Follower> findAllByUserId(Long userId);

}