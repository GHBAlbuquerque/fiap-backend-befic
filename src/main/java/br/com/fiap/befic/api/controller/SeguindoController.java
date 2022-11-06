package br.com.fiap.befic.api.controller;

import br.com.fiap.befic.domain.dbnosql.model.Following;
import br.com.fiap.befic.domain.dbnosql.repository.FollowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/seguindo")
public class SeguindoController {

    @Autowired
    private FollowingRepository followingRepository;

    @GetMapping("/{userId}")
    public List<Following> listByUser(@PathVariable Long userId) {
        return followingRepository.findAllByUserId(userId);
    }
}
