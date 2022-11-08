package br.com.fiap.befic.domain.service;

import br.com.fiap.befic.domain.exception.BusinessException;
import br.com.fiap.befic.domain.model.Login;
import br.com.fiap.befic.domain.model.Usuario;
import br.com.fiap.befic.domain.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public List<Login> findAll() {
        return loginRepository.findAll();
    }

    public Login findByUsuario(Usuario usuario) {
        var result = loginRepository.findByUsuario(usuario);

        if (result.isEmpty()) throw new BusinessException("Login não encontrado");
        if (result.size() > 1)
            throw new BusinessException("Mais de um login encontrado. Contate o administrador do sistema");

        return result.get(0);
    }

    @Transactional
    public Login save(Login login) {
        boolean isInUse = loginRepository.findByUsername(login.getUsername())
                .stream().anyMatch(loginExistente -> !loginExistente.equals(login));

        if (isInUse) {
            throw new BusinessException("Já existe um login cadastrado com esse username");
        }

        return loginRepository.save(login);
    }

    @Transactional
    public Login update(Long id, Login login) {
        if (!loginRepository.existsById(id)) {
            ResponseEntity.notFound().build();
        }

        login.setId(id);
        login = loginRepository.save(login);

        return login;
    }

    public boolean existsById(Long id) {
        return loginRepository.existsById(id);
    }

    @Transactional
    public void delete(Long id) {
        loginRepository.deleteById(id);
    }
}
