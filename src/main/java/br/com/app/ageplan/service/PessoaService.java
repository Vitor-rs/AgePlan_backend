//package br.com.app.ageplan.service;
//
//import br.com.app.ageplan.dto.PessoaDto;
//import br.com.app.ageplan.entity.Pessoa;
//import br.com.app.ageplan.repository.PessoaRepository;
//import br.com.app.ageplan.service.exception.ResourceNotFoundException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Service
//public class PessoaService {
//    /**
//     * Injeção de dependência para o repositório PessoaRepository usando a anotação @Autowired do Spring
//     * O Spring vai se encarregar de criar uma instância de PessoaRepository e injetar no atributo repository
//     * da classe PessoaService. Isso é chamado de Inversão de Controle (IoC). A classe PessoaService não precisa
//     * mais instanciar PessoaRepository usando new PessoaRepository(). O Spring faz isso automaticamente. Algumas IDEs
//     * alertam que essa ingeção de dependência não é necessária, mas ela é necessária sim. Se você não fizer isso,
//     * o atributo repository vai ser null e vai dar erro de NullPointerException quando você tentar usar o atributo.
//     */
//    @Autowired
//    private PessoaRepository repository;
//
//    /**
//     * Para evitar repetição de código, esse método é usado tanto no método insert quanto no método update.
//     * Assim o código fica mais limpo e mais fácil de entender. Pois o código de insert e update são muito parecidos.
//     */
//    private PessoaDto getPessoaDto(PessoaDto dto, Pessoa entity) {
//        entity.setNomeCompleto(dto.getNomeCompleto());
//        entity.setDataNascimento(dto.getDataNascimento());
//        entity.setGenero(dto.getGenero());
//        entity.setEstrangeiro(dto.getEstrangeiro());
//        entity.setCPF(dto.getCPF());
//        entity.setRG(dto.getRG());
//        entity.setOutrosDocumentos(dto.getOutrosDocumentos());
//        entity.setEmail(dto.getEmail());
//        entity.setTelefoneCelular(dto.getTelefoneCelular());
//        entity.setTelefoneFixo(dto.getTelefoneFixo());
//        entity.setEndereco(dto.getEndereco());
//        entity.setEscolaridade(dto.getEscolaridade());
//        entity.setOrgaoInstituicaoEmpresa(dto.getOrgaoInstituicaoEmpresa());
//
//        entity = repository.save(entity);
//
//        return new PessoaDto(entity);
//    }
//
//
//    /*-------------------------------------------------------------------------------*/
//    // Métodos de busca e listagem
//    @Transactional(readOnly = true)
//    public List<PessoaDto> findAll() {
//        List<Pessoa> lista = repository.findAll();
//        return lista.stream().map(PessoaDto::new).collect(Collectors.toList());
//        /*
//         Outra forma de fazer a mesma coisa:
//         return lista.stream().map(PessoaDto::new).collect(Collectors.toList());
//         Essa forma é mais enxuta, mas pode ser mais difícil de entender.
//         A expressão lambda (x -> new PessoaDto(x)) é equivalente a PessoaDto::new
//         pode ser lida como "para cada elemento x da lista, crie um novo objeto PessoaDto
//         com o elemento x como argumento do construtor".
//         Se usam esses dois pontos duplos (::) para referenciar um construtor ou um método.
//         Na prática, é como se você tivesse escrito o código abaixo:
//            List<PessoaDto> listaDto = new ArrayList<>();
//            for (Pessoa x : lista) {
//                listaDto.add(new PessoaDto(x));
//            }
//            return listaDto;
//        */
//    }
//
//    @Transactional(readOnly = true)
//    public PessoaDto findById(Long id) {
//        Optional<Pessoa> obj = repository.findById(id);
//        Pessoa entity = obj.orElseThrow(() ->
//                new ResourceNotFoundException("O registro solicitado não foi localizado."));
//        return new PessoaDto(entity);
//    }
//
//    /*-------------------------------------------------------------------------------*/
//    // Métodos de inserção, atualização e remoção
//
//    @Transactional
//    public PessoaDto insert(PessoaDto dto) {
//        Pessoa entity = new Pessoa();
//        return getPessoaDto(dto, entity);
//    }
//
//    @Transactional
//    public PessoaDto update(Long id, PessoaDto dto) {
//        try {
//            Pessoa entity = repository.getReferenceById(id);
//            return getPessoaDto(dto, entity);
//        } catch (ResourceNotFoundException e) {
//            throw new ResourceNotFoundException("O registro solicitado de ID " + id + " não foi localizado.");
//        }
//    }
//
//    public void delete(Long id) {
//        try {
//            if (repository.existsById(id)) {
//                repository.deleteById(id);
//            }
//        } catch (ResourceNotFoundException e) {
//            throw new ResourceNotFoundException("O registro solicitado de ID " + id + " não foi localizado.");
//        }
//    }
//
//
//}