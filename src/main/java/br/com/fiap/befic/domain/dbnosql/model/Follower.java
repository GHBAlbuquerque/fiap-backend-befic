package br.com.fiap.befic.domain.dbnosql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@AllArgsConstructor
@Document("followers")
public class Follower {

    @MongoId
    private String id;
    private Long userId;
    private Long followerId;
    private String followerUsername;

}