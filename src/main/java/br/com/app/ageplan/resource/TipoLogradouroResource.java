package br.com.app.ageplan.resource;

import br.com.app.ageplan.dto.TipoLogradouroDto;
import br.com.app.ageplan.service.TipoLogradouroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/tipo_logradouro")
public class TipoLogradouroResource {

    @Autowired
    public TipoLogradouroService service;

    @GetMapping
    public ResponseEntity<List<TipoLogradouroDto>> findAll() {
        List<TipoLogradouroDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<TipoLogradouroDto> findById(@PathVariable Long id) {
        TipoLogradouroDto dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<TipoLogradouroDto> insert(@RequestBody TipoLogradouroDto dto) {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();
        return ResponseEntity.created(uri).body(null);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<TipoLogradouroDto> update(
            @PathVariable Long id,
            @RequestBody TipoLogradouroDto dto) {

        dto = service.update(id, dto);

        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}