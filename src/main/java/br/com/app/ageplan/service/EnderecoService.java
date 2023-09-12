package br.com.app.ageplan.service;

import br.com.app.ageplan.dto.EnderecoDto;
import br.com.app.ageplan.entity.Endereco;
import br.com.app.ageplan.repository.EnderecoRepository;
import br.com.app.ageplan.service.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    @Transactional
    public List<EnderecoDto> findAll() {
        List<Endereco> lista = repository.findAll();
        return lista.stream().map(EnderecoDto::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public EnderecoDto findById(Long id) {

        Optional<Endereco> obj = repository.findById(id);

        Endereco entity = obj.orElseThrow(() ->
                new ResourceNotFoundException("O registro solicitado não foi localizado."));

        return new EnderecoDto(entity);
    }

    @Transactional
    public EnderecoDto insert(EnderecoDto dto) {

        Endereco entity = new Endereco();

        return getEnderecoDto(dto, entity);
    }


    @Transactional
    public EnderecoDto update(Long id, EnderecoDto dto) {

        try {
            Endereco entity = repository.getReferenceById(id);

            return getEnderecoDto(dto, entity);

        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("O registro solicitado de ID " + id + " não foi localizado.");
        }
    }

    @Transactional
    public void delete(Long id) {

        try {
            if (repository.existsById(id)) {
                repository.deleteById(id);
            }
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("O registro solicitado de ID " + id + " não foi localizado.");
        }
    }

    /*------------------------------------------*/
    // Método para retornar um objeto EnderecoDto e evitar duplicação de código.
    private EnderecoDto getEnderecoDto(EnderecoDto dto, Endereco entity) {
        entity.setNomeLogradouro(dto.getNomeLogradouro());
        entity.setNumero(dto.getNumero());
        entity.setComplemento(dto.getComplemento());
        entity.setBairro(dto.getBairro());
        entity.setCidade(dto.getCidade());
        entity.setEstado(dto.getEstado());
        entity.setCEP(dto.getCEP());

        entity = repository.save(entity);

        return new EnderecoDto(entity);
    }


    /*--------------------------------*/
    /* Métodos de validação de dados. */
    /*--------------------------------*/


}