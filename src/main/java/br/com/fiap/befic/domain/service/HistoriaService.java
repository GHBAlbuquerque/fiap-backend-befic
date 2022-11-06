package br.com.fiap.befic.domain.service;

import br.com.fiap.befic.domain.exception.BusinessException;
import br.com.fiap.befic.domain.dbsql.model.Historia;
import br.com.fiap.befic.domain.dbsql.repository.HistoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class HistoriaService {

    @Autowired
    private HistoriaRepository historiaRepository;

    public List<Historia> findAll() {
        return historiaRepository.findAll();
    }

    public Historia findById(Long id) {
        return historiaRepository.findById(id)
                .orElseThrow(() -> new BusinessException("Historia não encontrado"));
    }

    public List<Historia> findByNameContaining(String nome) {

        return historiaRepository.findByNomeContaining(nome);
    }

    @Transactional
    public Historia save(Historia historia) {
        boolean isInUse = historiaRepository.findByNomeAndAutor(historia.getNome(), historia.getAutor())
                .stream().anyMatch(historiaExistente -> !historiaExistente.equals(historia));

        if (isInUse) {
            throw new BusinessException("Já existe uma historia cadastrado com este nome para este autor");
        }

        return historiaRepository.save(historia);
    }

    @Transactional
    public Historia update(Long id, Historia historia) {
        if (!historiaRepository.existsById(id)) {
            ResponseEntity.notFound().build();
        }

        historia.setId(id);
        historia = historiaRepository.save(historia);

        return historia;
    }

    public boolean existsById(Long id) {
        return historiaRepository.existsById(id);
    }

    @Transactional
    public void delete(Long id) {
        historiaRepository.deleteById(id);
    }
}
