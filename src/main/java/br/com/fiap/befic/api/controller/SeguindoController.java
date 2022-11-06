package br.com.fiap.befic.api.controller;

import br.com.fiap.befic.domain.model.Seguindo;
import br.com.fiap.befic.domain.repository.SeguindoRepository;
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
    private SeguindoRepository seguindoRepository;

    @GetMapping("/{userId}")
    public List<Seguindo> listByUser(@PathVariable Long userId) {
        return seguindoRepository.findAllByUserId(userId);
    }
}
