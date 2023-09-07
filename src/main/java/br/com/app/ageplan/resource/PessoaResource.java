package br.com.app.ageplan.resource;

import br.com.app.ageplan.entity.PessoaDto;
import br.com.app.ageplan.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaResource {

    @Autowired
    private PessoaService service;

    @GetMapping
    public ResponseEntity<List<PessoaDto>> findAll() {
        List<PessoaDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PessoaDto> findById(@PathVariable Long id) {
        PessoaDto dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<PessoaDto> insert(@RequestBody PessoaDto dto) {

        dto = service.insert(dto);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();
        return ResponseEntity.created(uri).body(null);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PessoaDto> update(
            @PathVariable Long id,
            @RequestBody PessoaDto dto) {

        dto = service.update(id, dto);

        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}