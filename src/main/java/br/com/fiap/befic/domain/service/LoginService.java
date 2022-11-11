package br.com.fiap.befic.domain.service;

import br.com.fiap.befic.api.dto.CreateUsuarioLoginDto;
import br.com.fiap.befic.domain.exception.BusinessException;
import br.com.fiap.befic.domain.model.Login;
import br.com.fiap.befic.domain.model.Usuario;
import br.com.fiap.befic.domain.model.enums.GeneroEnum;
import br.com.fiap.befic.domain.repository.LoginRepository;
import br.com.fiap.befic.domain.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Login> findAll() {
        return loginRepository.findAll();
    }

    public Login findByUsernameESenha(String username, String senha) {
        var result = loginRepository.findByUsernameAndSenha(username, senha);
        if (result.isEmpty()) throw new BusinessException("Login incorreto. Verifique usuário e senha.");
        if (result.size() > 1)
            throw new BusinessException("Mais de um login encontrado. Contate o administrador do sistema");

        return result.get(0);
    }

    public Login findByUsuario(Usuario usuario) {
        var result = loginRepository.findByUsuario(usuario);

        if (result.isEmpty()) throw new BusinessException("Login não encontrado");
        if (result.size() > 1)
            throw new BusinessException("Mais de um login encontrado. Contate o administrador do sistema");

        return result.get(0);
    }

    @Transactional
    public Login save(CreateUsuarioLoginDto createUsuarioLoginDto) {
        boolean emailIsInUse = usuarioRepository.findByEmail(createUsuarioLoginDto.getEmail())
                .isEmpty();

        boolean usernameIsInUse = loginRepository.findByUsername(createUsuarioLoginDto.getUsername())
                .isEmpty();

        if (!emailIsInUse && !usernameIsInUse)
            throw new BusinessException("Já existe um usuario cadastrado com esse e-mail e este username");
        if (!emailIsInUse)
            throw new BusinessException("Já existe um usuario cadastrado com esse e-mail");
        if (!usernameIsInUse)
            throw new BusinessException("Já existe um usuario cadastrado com esse username");

        GeneroEnum.valueOf(createUsuarioLoginDto.getGenero());

        var usuario = new Usuario(
                null,
                createUsuarioLoginDto.getNome(),
                createUsuarioLoginDto.getDtNasc(),
                createUsuarioLoginDto.getCelular(),
                createUsuarioLoginDto.getEmail(),
                GeneroEnum.valueOf(createUsuarioLoginDto.getGenero()),
                null,
                null);

        usuario = usuarioRepository.save(usuario);

        var login = new Login(null,
                usuario,
                createUsuarioLoginDto.getUsername(),
                createUsuarioLoginDto.getSenha(),
                null);

        login = loginRepository.save(login);

        return login;
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
