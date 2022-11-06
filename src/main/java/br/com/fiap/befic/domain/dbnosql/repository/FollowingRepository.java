package br.com.fiap.befic.domain.dbnosql.repository;

import br.com.fiap.befic.domain.dbnosql.model.Following;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FollowingRepository extends MongoRepository<Following, Long> {

    List<Following> findAllByUserId(Long userId);
}