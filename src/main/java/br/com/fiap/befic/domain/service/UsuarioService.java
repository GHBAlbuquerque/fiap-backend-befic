package br.com.fiap.befic.domain.service;

import br.com.fiap.befic.domain.exception.BusinessException;
import br.com.fiap.befic.domain.model.Usuario;
import br.com.fiap.befic.domain.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Usuario não encontrado"));
    }

    public List<Usuario> findByNameContaining(String nome) {
        List<Usuario> usuarios = usuarioRepository.findByNomeContaining(nome);

        return usuarios;
    }

    @Transactional
    public Usuario save(Usuario usuario) {
        boolean isInUse = usuarioRepository.findByEmail(usuario.getEmail())
                .stream().anyMatch(usuarioExistente -> !usuarioExistente.equals(usuario));

        if (isInUse) {
            throw new BusinessException("Já existe um usuario cadastrado com esse e-mail");
        }

        return usuarioRepository.save(usuario);
    }

    @Transactional
    public Usuario update(Long id, Usuario usuario) {
        if (!usuarioRepository.existsById(id)) {
            ResponseEntity.notFound().build();
        }

        usuario.setId(id);
        usuario = usuarioRepository.save(usuario);

        return usuario;
    }

    public boolean existsById(Long id) {
        return usuarioRepository.existsById(id);
    }

    @Transactional
    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }
}
