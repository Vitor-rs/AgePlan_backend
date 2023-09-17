package br.com.app.ageplan.service;

import br.com.app.ageplan.dto.RegistroFrequenciaDto;
import br.com.app.ageplan.entity.RegistroFrequencia;
import br.com.app.ageplan.repository.RegistroFrequenciaRepository;
import br.com.app.ageplan.service.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serial;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RegistroFrequenciaService {

    @Autowired
    private RegistroFrequenciaRepository repository;

    // Método para evitar repetição de código
    private RegistroFrequenciaDto getRegistroFrequenciaDto(RegistroFrequenciaDto dto, RegistroFrequencia entity) {
        entity.setDataHoraRegistro(dto.getDataHoraRegistro());
        entity.setNumeroAula(dto.getNumeroAula());
        entity.setPresenca(dto.getPresenca());
        entity.setConteudoPlanejado(dto.getConteudoPlanejado());
        entity.setConteudoMinistrado(dto.getConteudoMinistrado());
        entity.setObservacoesAnotacoes(dto.getObservacoesAnotacoes());
        entity.setDuracaoAula(dto.getDuracaoAula());
        entity.setFala(dto.getFala());
        entity.setAudicao(dto.getAudicao());
        entity.setLeitura(dto.getLeitura());
        entity.setEscrita(dto.getEscrita());
        entity.setTarefa(dto.getTarefa());
        entity.setSituacaoTarefa(dto.getSituacaoTarefa());
        entity.setApp(dto.getApp());
        entity.setEngajamento(dto.getEngajamento());
        entity.setSala(dto.getSala());

        entity = repository.save(entity);

        return new RegistroFrequenciaDto(entity);
    }

    /*-------------------------------------------------------------------------------*/
    // Métodos para busca e listagem

    @Transactional(readOnly = true)
    public List<RegistroFrequenciaDto> findAll() {
        List<RegistroFrequencia> lista = repository.findAll();
        return lista.stream().map(RegistroFrequenciaDto::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public RegistroFrequenciaDto findById(Long id) {
        Optional<RegistroFrequencia> obj = repository.findById(id);
        RegistroFrequencia entity = obj.orElseThrow(() ->
                new ResourceNotFoundException("Registro de Frequência não encontrado"));
        return new RegistroFrequenciaDto(entity);
    }

    /*-------------------------------------------------------------------------------*/
    // Métodos para inserção, atualização e deleção

    @Transactional
    public RegistroFrequenciaDto insert(RegistroFrequenciaDto dto) {
        RegistroFrequencia entity = new RegistroFrequencia();
        return getRegistroFrequenciaDto(dto, entity);
    }

    @Transactional
public RegistroFrequenciaDto update(Long id, RegistroFrequenciaDto dto) {
        try {
            RegistroFrequencia entity = repository.getReferenceById(id);
            return getRegistroFrequenciaDto(dto, entity);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("Registro de Frequência não encontrado");
        }
    }

    @Transactional
    public void delete(Long id) {
        try {
            if (repository.existsById(id)) {
                repository.deleteById(id);
            }
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("Registro de Frequência não encontrado");
        }
    }


}