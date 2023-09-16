package br.com.app.ageplan.service;

import br.com.app.ageplan.dto.NivelSerieEscolaridadeDto;
import br.com.app.ageplan.entity.NivelSerieEscolaridade;
import br.com.app.ageplan.repository.NivelSerieEscolaridadeRepository;
import br.com.app.ageplan.service.exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NivelSerieEscolaridadeService {

     @Autowired
    private NivelSerieEscolaridadeRepository repository;

    private NivelSerieEscolaridadeDto getNivelSerieEscolaridadeDto(NivelSerieEscolaridadeDto dto, NivelSerieEscolaridade entity) {
        entity.setNomeDescricao(dto.getNomeDescricao());
        entity = repository.save(entity);
        return new NivelSerieEscolaridadeDto(entity);
    }

    /*-------------------------------------------------------------------------------*/
    // Métodos de busca e listagem

    @Transactional(readOnly = true)
    public List<NivelSerieEscolaridadeDto> findAll() {
        List<NivelSerieEscolaridade> lista = repository.findAll();
        return lista.stream().map(NivelSerieEscolaridadeDto::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public NivelSerieEscolaridadeDto findById(Long id) {
        Optional<NivelSerieEscolaridade> obj = repository.findById(id);
        NivelSerieEscolaridade entity = obj.orElseThrow(() -> new ResourceNotFoundException("Objeto não encontrado"));
        return new NivelSerieEscolaridadeDto(entity);
    }

    /*-------------------------------------------------------------------------------*/
    // Métodos de inserção, atualização e deleção

    @Transactional
    public NivelSerieEscolaridadeDto insert(NivelSerieEscolaridadeDto dto) {
        NivelSerieEscolaridade entity = new NivelSerieEscolaridade();
        return getNivelSerieEscolaridadeDto(dto, entity);
    }

    @Transactional
    public NivelSerieEscolaridadeDto update(Long id, NivelSerieEscolaridadeDto dto) {
        try {
            NivelSerieEscolaridade entity = repository.getReferenceById(id);
            return getNivelSerieEscolaridadeDto(dto, entity);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("O registro não foi localizado.");
        }
    }

    @Transactional
    public void delete(Long id) {
        try {
            if (repository.existsById(id)) {
                repository.deleteById(id);
            }
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("O registro não foi localizado.");
        }
    }

}