package br.com.app.ageplan.resource;


import br.com.app.ageplan.dto.EnderecoDto;
import br.com.app.ageplan.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoResource {

    @Autowired
    private EnderecoService service;

    @GetMapping
    public ResponseEntity<List<EnderecoDto>> findAll() {
        List<EnderecoDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<EnderecoDto> findById(Long id) {
        EnderecoDto dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<EnderecoDto> insert(@RequestBody EnderecoDto dto) {

        dto = service.insert(dto);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();

        return ResponseEntity.created(uri).body(null);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<EnderecoDto> update(
            @PathVariable Long id,
            @RequestBody EnderecoDto dto) {

        dto = service.update(id, dto);

        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}