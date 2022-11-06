package br.com.fiap.befic.api.controller;

import br.com.fiap.befic.domain.dbnosql.model.Follower;
import br.com.fiap.befic.domain.dbnosql.repository.FollowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seguidores")
public class SeguidoresController {

    @Autowired
    private FollowerRepository followerRepository;

    @GetMapping("/{userId}")
    public List<Follower> listByUser(@PathVariable Long userId) {
        return (List<Follower>) followerRepository.findAllByUserId(userId);
    }

}
