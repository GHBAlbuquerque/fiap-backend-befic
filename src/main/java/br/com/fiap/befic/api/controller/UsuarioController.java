package br.com.fiap.befic.api.controller;

import br.com.fiap.befic.domain.model.Usuario;
import br.com.fiap.befic.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> list() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        var usuario = usuarioService.findById(id);

        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Usuario>> findByNameContaining(@PathVariable String nome) {
        var usuarios = usuarioService.findByNameContaining(nome);

        if (usuarios.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario save(@Valid @RequestBody Usuario Usuario) {
        return usuarioService.save(Usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> update(@Valid @PathVariable long id, @RequestBody Usuario usuario) {
        usuario = usuarioService.update(id, usuario);
        return ResponseEntity.ok(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        if (!usuarioService.existsById(id)) {
            ResponseEntity.notFound().build();
        }

        usuarioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
