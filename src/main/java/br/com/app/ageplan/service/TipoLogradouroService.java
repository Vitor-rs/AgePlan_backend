package br.com.app.ageplan.service;

import br.com.app.ageplan.dto.TipoLogradouroDto;
import br.com.app.ageplan.entity.TipoLogradouro;
import br.com.app.ageplan.repository.TipoLogradouroRepository;
import br.com.app.ageplan.service.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TipoLogradouroService {

    @Autowired
    private TipoLogradouroRepository repository;

    @Transactional(readOnly = true)
    public List<TipoLogradouroDto> findAll() {
        List<TipoLogradouro> lista = repository.findAll();
        return lista.stream().map(TipoLogradouroDto::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public TipoLogradouroDto findById(Long id) {
        Optional<TipoLogradouro> obj = repository.findById(id);
        TipoLogradouro entity = obj.orElseThrow(() ->
                new ResourceNotFoundException("O registro solicitado não foi localizado."));
        return new TipoLogradouroDto(entity);
    }

    @Transactional
    public TipoLogradouroDto insert(TipoLogradouroDto dto) {
        TipoLogradouro entity = new TipoLogradouro();
        entity.setNomeTipoLogradouro(dto.getNomeTipoLogradouro());
        entity = repository.save(entity);
        return new TipoLogradouroDto(entity);
    }

    @Transactional
    public TipoLogradouroDto update(Long id, TipoLogradouroDto dto) {
        try {
            TipoLogradouro entity = repository.getReferenceById(id);
            entity.setNomeTipoLogradouro(dto.getNomeTipoLogradouro());
            entity = repository.save(entity);
            return new TipoLogradouroDto(entity);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("O registro solicitado de ID " + id + " não foi localizado.");
        }
    }

    @Transactional
    public void delete(Long id) {
        try { if (repository.existsById(id)) { repository.deleteById(id); }
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("O registro solicitado de ID " + id + " não foi localizado.");
        }
    }

}