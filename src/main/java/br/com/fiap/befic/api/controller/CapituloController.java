package br.com.fiap.befic.api.controller;

import br.com.fiap.befic.domain.model.Capitulo;
import br.com.fiap.befic.domain.service.CapituloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/capitulo")
public class CapituloController {

    @Autowired
    private CapituloService capituloService;

    @GetMapping
    public List<Capitulo> list() {
        return capituloService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Capitulo> findById(@PathVariable Long id) {
        var capitulo = capituloService.findById(id);

        return ResponseEntity.ok(capitulo);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Capitulo save(@Valid @RequestBody Capitulo Capitulo) {
        return capituloService.save(Capitulo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Capitulo> update(@Valid @PathVariable long id, @RequestBody Capitulo capitulo) {
        capitulo = capituloService.update(id, capitulo);
        return ResponseEntity.ok(capitulo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        if (!capituloService.existsById(id)) {
            ResponseEntity.notFound().build();
        }

        capituloService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
