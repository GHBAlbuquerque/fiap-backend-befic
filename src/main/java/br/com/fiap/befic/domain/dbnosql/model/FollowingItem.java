package br.com.fiap.befic.domain.dbnosql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@Document("followingitems")
public class FollowingItem {

    @MongoId
    private Long id;
    private Long userId;
    private Long followingId;
    private String followingUsername;

}