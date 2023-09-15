package br.com.app.ageplan.service;

import br.com.app.ageplan.dto.ProfissaoCargoFuncaoDto;
import br.com.app.ageplan.entity.ProfissaoCargoFuncao;
import br.com.app.ageplan.repository.ProfissaoCargoFuncaoRepository;
import br.com.app.ageplan.service.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProfissaoCargoFuncaoService {

    @Autowired
    private ProfissaoCargoFuncaoRepository repository;

    private ProfissaoCargoFuncaoDto getProfissaoFuncaoCargoDto(ProfissaoCargoFuncaoDto dto, ProfissaoCargoFuncao entity) {
        entity.setNomeDescricao(dto.getNomeDescricao());
        entity = repository.save(entity);
        return new ProfissaoCargoFuncaoDto(entity);
    }


    /*-------------------------------------------------------------------------------*/
    // Métodos de busca e listagem

    @Transactional(readOnly = true)
    public List<ProfissaoCargoFuncaoDto> findAll() {
        List<ProfissaoCargoFuncao> lista = repository.findAll();
        return lista.stream().map(ProfissaoCargoFuncaoDto::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ProfissaoCargoFuncaoDto findById(Long id) {
        Optional<ProfissaoCargoFuncao> obj = repository.findById(id);
        ProfissaoCargoFuncao entity = obj.orElseThrow(() ->
                new ResourceNotFoundException("O registro solicitado de ID " + id + " não foi localizado."));
        return new ProfissaoCargoFuncaoDto(entity);
    }

    /*-------------------------------------------------------------------------------*/
    // Métodos de inserção, atualização e deleção

    @Transactional
    public ProfissaoCargoFuncaoDto insert(ProfissaoCargoFuncaoDto dto) {
        ProfissaoCargoFuncao entity = new ProfissaoCargoFuncao();
        return getProfissaoFuncaoCargoDto(dto, entity);
    }

    @Transactional
    public ProfissaoCargoFuncaoDto update(Long id, ProfissaoCargoFuncaoDto dto) {
        try {
            ProfissaoCargoFuncao entity = repository.getReferenceById(id);
            return getProfissaoFuncaoCargoDto(dto, entity);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("O registro solicitado de ID " + id + " não foi localizado.");
        }
    }

    public void delete(Long id) {
        try {
            if (repository.existsById(id)) {
                repository.deleteById(id);
            }
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("O registro solicitado de ID " + id + " não foi localizado.");
        }
    }
}