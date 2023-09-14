package br.com.app.ageplan.service;

import br.com.app.ageplan.dto.EscolaridadeDto;
import br.com.app.ageplan.entity.Escolaridade;
import br.com.app.ageplan.repository.EscolaridadeRepository;
import br.com.app.ageplan.service.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EscolaridadeService {

    @Autowired
    private EscolaridadeRepository repository;

    /*---------------------------------------------------------------------------*/
    // Método para evitar repetição de código
    private EscolaridadeDto getEscolaridadeDto(EscolaridadeDto dto, Escolaridade entity) {
        entity.setId(dto.getId());
        entity.setNomeDescricao(dto.getNomeDescricao());
        entity = repository.save(entity);
        return new EscolaridadeDto(entity);
    }

    /*---------------------------------------------------------------------------*/
    // Métodos de busca e listagem
    @Transactional(readOnly = true)
    public List<EscolaridadeDto> findAll() {
        List<Escolaridade> lista = repository.findAll();
        return lista.stream().map(EscolaridadeDto::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public EscolaridadeDto findById(Long id) {
        Optional<Escolaridade> obj = repository.findById(id);
        Escolaridade entity = obj.orElseThrow(() ->
                new ResourceNotFoundException("O registro solicitado não foi localizado."));
        return new EscolaridadeDto(entity);
    }

    /*---------------------------------------------------------------------------*/
    // Métodos de inserção, atualização e remoção

    @Transactional
    public EscolaridadeDto insert(EscolaridadeDto dto) {
        Escolaridade entity = new Escolaridade();
        return getEscolaridadeDto(dto, entity);
    }

    @Transactional
    public EscolaridadeDto update(Long id, EscolaridadeDto dto) {
        try {
            Escolaridade entity = repository.getReferenceById(id);
            return getEscolaridadeDto(dto, entity);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("O registro solicitado de ID " + id + " não foi localizado.");
        }
    }

    public void delete(Long id) {
        try {
            if (repository.existsById(id)) {
                repository.deleteById(id);
            } else {
                throw new ResourceNotFoundException("O registro solicitado de ID " + id + " não foi localizado.");
            }
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("O registro solicitado de ID " + id + " não foi localizado.");
        }
    }

}