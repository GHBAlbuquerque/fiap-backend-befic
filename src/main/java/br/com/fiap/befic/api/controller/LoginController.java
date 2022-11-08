package br.com.fiap.befic.api.controller;

import br.com.fiap.befic.domain.model.Login;
import br.com.fiap.befic.domain.model.Usuario;
import br.com.fiap.befic.domain.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public List<Login> list() {
        return loginService.findAll();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Login> findByUsuario(@PathVariable Long userId) {
        var usuario = new Usuario();
        usuario.setId(userId);
        var login = loginService.findByUsuario(usuario);

        return ResponseEntity.ok(login);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Login save(@Valid @RequestBody Login Login) {
        return loginService.save(Login);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Login> update(@Valid @PathVariable long id, @RequestBody Login login) {
        login = loginService.update(id, login);
        return ResponseEntity.ok(login);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        if (!loginService.existsById(id)) {
            ResponseEntity.notFound().build();
        }

        loginService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
