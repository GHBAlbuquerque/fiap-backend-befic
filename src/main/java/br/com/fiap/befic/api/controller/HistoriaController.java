package br.com.fiap.befic.api.controller;

import br.com.fiap.befic.api.dto.HistoriaDto;
import br.com.fiap.befic.domain.model.Capitulo;
import br.com.fiap.befic.domain.model.Historia;
import br.com.fiap.befic.domain.model.Usuario;
import br.com.fiap.befic.domain.service.CapituloService;
import br.com.fiap.befic.domain.service.HistoriaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historias")
public class HistoriaController {

    @Autowired
    private HistoriaService historiaService;

    @Autowired
    private CapituloService capituloService;

    @GetMapping
    public List<Historia> list() {
        return historiaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Historia> findById(@PathVariable Long id) {
        var historia = historiaService.findById(id);

        return ResponseEntity.ok(historia);
    }

    @GetMapping("/autor/{userId}")
    public ResponseEntity<List<Historia>> findByAutor(@PathVariable Long userId) {
        var autor = new Usuario();
        autor.setId(userId);
        var historia = historiaService.findByAutor(autor);

        return ResponseEntity.ok(historia);
    }

    @GetMapping("/{id}/capitulos")
    public ResponseEntity<List<Capitulo>> getCapitulos(@PathVariable Long id) {

        var capitulos = capituloService.findByHistoria(id);

        return ResponseEntity.ok(capitulos);
    }


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Historia save(@RequestBody HistoriaDto historiaDto) {
        var autor = new Usuario();
        autor.setId(historiaDto.getAutor());

        var historia = new Historia();
        BeanUtils.copyProperties(historiaDto, historia);
        historia.setAutor(autor);

        historia = historiaService.save(historia);
        return historia;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Historia> update(@PathVariable long id, @RequestBody Historia historia) {
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
