package br.com.fiap.befic.api.controller;

import br.com.fiap.befic.domain.model.Seguidor;
import br.com.fiap.befic.domain.repository.SeguidorRepository;
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
    private SeguidorRepository seguidorRepository;

    @GetMapping("/{userId}")
    public List<Seguidor> listByUser(@PathVariable Long userId) {
        return (List<Seguidor>) seguidorRepository.findAllByUserId(userId);
    }

}
