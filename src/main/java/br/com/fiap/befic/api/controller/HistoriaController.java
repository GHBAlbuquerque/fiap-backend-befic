package br.com.fiap.befic.api.controller;

import br.com.fiap.befic.domain.dbsql.model.Historia;
import br.com.fiap.befic.domain.service.HistoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/historia")
public class HistoriaController {

    @Autowired
    private HistoriaService historiaService;

    @GetMapping
    public List<Historia> list() {
        return historiaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Historia> findById(@PathVariable Long id) {
        var historia = historiaService.findById(id);

        return ResponseEntity.ok(historia);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Historia save(@Valid @RequestBody Historia Historia) {
        return historiaService.save(Historia);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Historia> update(@Valid @PathVariable long id, @RequestBody Historia historia) {
        historia = historiaService.update(id, historia);
        return ResponseEntity.ok(historia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        if (!historiaService.existsById(id)) {
            ResponseEntity.notFound().build();
        }

        historiaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
