package br.com.fiap.befic.api.controller;

import br.com.fiap.befic.domain.model.Capitulo;
import br.com.fiap.befic.domain.model.CapituloId;
import br.com.fiap.befic.domain.service.CapituloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/capitulos")
public class CapituloController {

    @Autowired
    private CapituloService capituloService;

    @GetMapping
    public List<Capitulo> list() {
        return capituloService.findAll();
    }

    @PostMapping("/buscar")
    public ResponseEntity<Capitulo> findById(@RequestBody CapituloId id) {
        var capitulo = capituloService.findById(id);

        return ResponseEntity.ok(capitulo);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Capitulo save(@Valid @RequestBody Capitulo Capitulo) {
        return capituloService.save(Capitulo);
    }

    @PutMapping("/alterar")
    public ResponseEntity<Capitulo> update(@Valid @RequestBody Capitulo capitulo) {
        var capituloId = new CapituloId(capitulo.getNumero(), capitulo.getHistoriaId());
        capitulo = capituloService.update(capituloId, capitulo);
        return ResponseEntity.ok(capitulo);
    }

    @DeleteMapping("/deletar")
    public ResponseEntity<Void> delete(@RequestBody CapituloId id)  {
        if (!capituloService.existsById(id)) {
            ResponseEntity.notFound().build();
        }

        capituloService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
