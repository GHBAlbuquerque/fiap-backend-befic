package br.com.fiap.befic.domain.service;

import br.com.fiap.befic.domain.exception.BusinessException;
import br.com.fiap.befic.domain.dbsql.model.Login;
import br.com.fiap.befic.domain.dbsql.repository.LoginRepository;
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

    public Login findById(Long id) {
        return loginRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Login não encontrado"));
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
