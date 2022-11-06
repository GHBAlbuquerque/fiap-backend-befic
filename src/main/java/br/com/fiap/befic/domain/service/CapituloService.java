package br.com.fiap.befic.domain.service;

import br.com.fiap.befic.domain.exception.BusinessException;
import br.com.fiap.befic.domain.model.Capitulo;
import br.com.fiap.befic.domain.repository.CapituloRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CapituloService {

    private CapituloRepository capituloRepository;

    public List<Capitulo> findAll() {
        return capituloRepository.findAll();
    }

    public Capitulo findById(Long id) {
        return capituloRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Capitulo não encontrado"));
    }


    @Transactional
    public Capitulo save(Capitulo capitulo) {
        boolean isInUse = capituloRepository.findById(capitulo.getNumero())
                .stream().anyMatch(capituloExistente -> !capituloExistente.equals(capitulo));

        if (isInUse) {
            throw new BusinessException("Já existe uma capitulo cadastrado com este número");
        }

        return capituloRepository.save(capitulo);
    }

    @Transactional
    public Capitulo update(Long id, Capitulo capitulo) {
        if (!capituloRepository.existsById(id)) {
            ResponseEntity.notFound().build();
        }

        capitulo.setNumero(id);
        capitulo = capituloRepository.save(capitulo);

        return capitulo;
    }

    public boolean existsById(Long id) {
        return capituloRepository.existsById(id);
    }

    @Transactional
    public void delete(Long id) {
        capituloRepository.deleteById(id);
    }
}
