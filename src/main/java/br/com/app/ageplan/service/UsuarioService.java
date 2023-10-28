package br.com.app.ageplan.service;

import br.com.app.ageplan.entity.Usuario;
import br.com.app.ageplan.dto.UsuarioDto;
import br.com.app.ageplan.repository.UsuarioRepository;
import br.com.app.ageplan.service.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    private UsuarioDto getUsuarioDto(UsuarioDto dto, Usuario entity) {
        entity.setNomeUsuario(dto.getNomeUsuario());
        entity.setSenha(dto.getSenha());
        entity.setEmail(dto.getEmail());
        entity.setDataHoraCriacao(dto.getDataHoraCriacao());
        entity.setDataHoraUltimoAcesso(dto.getDataHoraUltimoAcesso());
        entity.setDataHoraUltimaAlteracao(dto.getDataHoraUltimaAlteracao());
        entity.setDataHoraExclusao(dto.getDataHoraExclusao());
        entity.setSituacao(dto.getSituacao());

        entity = repository.save(entity);

        return new UsuarioDto(entity);
    }

    /*-------------------------------------------------------------------------------*/
    // Métodos de busca e listagem

    @Transactional(readOnly = true)
    public List<UsuarioDto> findAll() {
        List<Usuario> lista = repository.findAll();
        return lista.stream().map(UsuarioDto::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public UsuarioDto findById(Long id) {
        Optional<Usuario> obj = repository.findById(id);
        Usuario entity = obj.orElseThrow(() ->
                new ResourceNotFoundException("O registro solicitado de ID " + id + " não foi localizado."));
        return new UsuarioDto(entity);
    }

    /*-------------------------------------------------------------------------------*/

    // Métodos de inserção, atualização e deleção

    @Transactional
    public UsuarioDto insert(UsuarioDto dto) {
        Usuario entity = new Usuario();
        return getUsuarioDto(dto, entity);
    }

    @Transactional
    public UsuarioDto update(Long id, UsuarioDto dto) {
        try {
            Usuario entity = repository.getReferenceById(id);
            return getUsuarioDto(dto, entity);
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