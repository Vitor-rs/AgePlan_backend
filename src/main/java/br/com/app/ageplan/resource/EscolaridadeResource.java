package br.com.app.ageplan.resource;

import br.com.app.ageplan.dto.EscolaridadeDto;
import br.com.app.ageplan.service.EscolaridadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/escolaridade")
public class EscolaridadeResource {

    @Autowired
    private EscolaridadeService service;

    /*------------------------------------------------------------------*/
    // Métodos de busca de dados usando o método GET do protocolo HTTP
    // GET /escolaridades e GET /escolaridades/{id}

    @GetMapping
    public ResponseEntity<List<EscolaridadeDto>> findAll() {
        List<EscolaridadeDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<EscolaridadeDto> findById(@PathVariable Long id) {
        EscolaridadeDto dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    /*------------------------------------------------------------------*/
    // Métodos de inserção de dados usando o método POST do protocolo HTTP
    // POST /escolaridades

    @PostMapping
    public ResponseEntity<EscolaridadeDto> insert(EscolaridadeDto dto) {
        dto = service.insert(dto);

        /* O URI é o endereço do recurso que foi criado
         *  e que deve ser retornado no cabeçalho da resposta HTTP
         * com o código 201 (Created). URI significa Uniform Resource Identifier.
         * Ou seja, é um identificador único de um recurso.
         */

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();

        return ResponseEntity.created(uri).body(null);
    }

    /*------------------------------------------------------------------*/
  /* Métodos de atualização de dados usando o método PUT do protocolo HTTP
     PUT /escolaridades/{id}. O método PUT é idempotente, ou seja,
     se o recurso já existe, ele será atualizado, caso contrário, será criado.
     Lembrando que o PUT precisa do ID do recurso para atualizá-lo, pois ele
     não pode ser nulo. Se o recurso não existir, o código de resposta HTTP
     deve ser 404 (Not Found). Se o recurso for atualizado com sucesso, o
     código de resposta HTTP deve ser 200 (OK). Se o recurso for criado com
     sucesso, o código de resposta HTTP deve ser 201 (Created).
  */

    @PutMapping(value = "/{id}")
    public ResponseEntity<EscolaridadeDto> update(
            @PathVariable Long id,
            @RequestBody EscolaridadeDto dto) {

        dto = service.update(id, dto);

        return ResponseEntity.ok().body(dto);
    }

    /*------------------------------------------------------------------*/
    // Métodos de exclusão de dados usando o método DELETE do protocolo HTTP
    // DELETE /escolaridades/{id}

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}