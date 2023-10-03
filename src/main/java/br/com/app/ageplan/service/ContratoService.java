package br.com.app.ageplan.service;

import br.com.app.ageplan.dto.ContratoDto;
import br.com.app.ageplan.entity.Contrato;
import br.com.app.ageplan.repository.ContratoRepository;
import br.com.app.ageplan.service.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContratoService {

    @Autowired
    private ContratoRepository repository;
    /*-------------------------------------------------------*/

    private ContratoDto getContratoDto(ContratoDto dto, Contrato entity) {
        entity.setSituacao(dto.getSituacao());
        entity.setDataInicio(dto.getDataInicio());
        entity.setDataTermino(dto.getDataTermino());
        entity.setDataCancelamento(dto.getDataCancelamento());
        entity.setDataTrancamento(dto.getDataTrancamento());

        entity = repository.save(entity);

        return new ContratoDto(entity);
    }

    @Transactional(readOnly = true)
    public List<ContratoDto> findAll() {
        List<Contrato> lista = repository.findAll();
        return lista.stream().map(ContratoDto::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ContratoDto findById(Long id) {
        Optional<Contrato> obj = repository.findById(id);
        Contrato entity = obj.orElseThrow(() ->
                new ResourceNotFoundException("Contrato não encontrado"));
        return new ContratoDto(entity);
    }

    @Transactional
    public ContratoDto insert(ContratoDto dto) {
        Contrato entity = new Contrato();
        return getContratoDto(dto, entity);
    }

    @Transactional
    public ContratoDto update(Long id, ContratoDto dto) {
        try {
            Contrato entity = repository.getReferenceById(id);
            return getContratoDto(dto, entity);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("Contrato não encontrado");
        }
    }

    @Transactional
    public void delete(Long id) {
        try {
            if (repository.existsById(id)) {
                repository.deleteById(id);
            }
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("Contrato não encontrado");
        }
    }


}