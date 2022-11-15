package br.com.fiap.befic.domain.service;

import br.com.fiap.befic.domain.exception.BusinessException;
import br.com.fiap.befic.domain.model.Capitulo;
import br.com.fiap.befic.domain.model.CapituloId;
import br.com.fiap.befic.domain.repository.CapituloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CapituloService {

    @Autowired
    private CapituloRepository capituloRepository;

    public List<Capitulo> findAll() {
        return capituloRepository.findAll();
    }

    public Capitulo findById(CapituloId id) {
        return capituloRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Capitulo não encontrado"));
    }

    public List<Capitulo> findByHistoria(Long historiaId) {

        var capitulos = capituloRepository.findByHistoriaId(historiaId);

        if (capitulos.isEmpty()) throw new BusinessException("Capitulo não encontrado");

        return capitulos;
    }


    @Transactional
    public Capitulo save(Capitulo capitulo) {
        var capituloNumero = capituloRepository.countByHistoriaId(capitulo.getHistoriaId()) + 1;
        var capituloId = new CapituloId(capituloNumero, capitulo.getHistoriaId());

        boolean isInUse = capituloRepository.findById(capituloId)
                .stream().anyMatch(capituloExistente -> !capituloExistente.equals(capitulo));

        if (isInUse) {
            throw new BusinessException("Já existe uma capitulo cadastrado com este número");
        }

        return capituloRepository.save(capitulo);
    }

    @Transactional
    public Capitulo update(CapituloId capituloId, Capitulo capitulo) {
        if (!capituloRepository.existsById(capituloId)) {
            ResponseEntity.notFound().build();
        }

        capitulo.setNumero(capituloId.getNumero());
        capitulo.setHistoriaId(capituloId.getHistoriaId());
        capitulo = capituloRepository.save(capitulo);

        return capitulo;
    }

    public boolean existsById(CapituloId capituloId) {
        return capituloRepository.existsById(capituloId);
    }

    @Transactional
    public void delete(CapituloId capituloId) {
        capituloRepository.deleteById(capituloId);
    }
}
