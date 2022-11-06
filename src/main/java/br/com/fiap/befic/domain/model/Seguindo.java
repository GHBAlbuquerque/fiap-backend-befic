package br.com.fiap.befic.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@AllArgsConstructor
@Document("following")
public class Seguindo {

    @MongoId
    private String id;
    private Long userId;
    private Long followingId;
    private String followingUsername;

}