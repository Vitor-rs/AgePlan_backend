package br.com.app.ageplan.service;

import br.com.app.ageplan.dto.OrgaoInstituicaoEmpresaDto;
import br.com.app.ageplan.entity.OrgaoInstituicaoEmpresa;
import br.com.app.ageplan.repository.OrgaoInstituicaoEmpresaRepository;
import br.com.app.ageplan.service.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrgaoInstituicaoEmpresaService {

    @Autowired
    private OrgaoInstituicaoEmpresaRepository repository;

    private OrgaoInstituicaoEmpresaDto getOrgaoInstituicaoEmpresaDto(OrgaoInstituicaoEmpresaDto dto, OrgaoInstituicaoEmpresa entity) {
        entity.setNomeDescricao(dto.getNomeDescricao());
        entity.setSigla(dto.getSigla());
        entity = repository.save(entity);
        return new OrgaoInstituicaoEmpresaDto(entity);
    }


    /*-------------------------------------------------------------------------------*/
    // Métodos de busca e listagem

    @Transactional(readOnly = true)
    public List<OrgaoInstituicaoEmpresaDto> findAll() {
        List<OrgaoInstituicaoEmpresa> lista = repository.findAll();
        return lista.stream().map(OrgaoInstituicaoEmpresaDto::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public OrgaoInstituicaoEmpresaDto findById(Long id) {
        Optional<OrgaoInstituicaoEmpresa> obj = repository.findById(id);
        OrgaoInstituicaoEmpresa entity = obj.orElseThrow(() -> new ResourceNotFoundException("Objeto não encontrado"));
        return new OrgaoInstituicaoEmpresaDto(entity);
    }

    /*-------------------------------------------------------------------------------*/
    // Métodos de inserção, atualização e deleção

    @Transactional
    public OrgaoInstituicaoEmpresaDto insert(OrgaoInstituicaoEmpresaDto dto) {
        OrgaoInstituicaoEmpresa entity = new OrgaoInstituicaoEmpresa();
        return getOrgaoInstituicaoEmpresaDto(dto, entity);
    }

    @Transactional
    public OrgaoInstituicaoEmpresaDto update(Long id, OrgaoInstituicaoEmpresaDto dto) {
        try {
            OrgaoInstituicaoEmpresa entity = repository.getReferenceById(id);
            return getOrgaoInstituicaoEmpresaDto(dto, entity);
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