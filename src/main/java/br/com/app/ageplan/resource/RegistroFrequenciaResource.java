package br.com.app.ageplan.resource;

import br.com.app.ageplan.dto.RegistroFrequenciaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.app.ageplan.service.RegistroFrequenciaService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/registro_frequencia")
public class RegistroFrequenciaResource {

    @Autowired
    private RegistroFrequenciaService service;

    @GetMapping
    public ResponseEntity<List<RegistroFrequenciaDto>> findAll() {
        List<RegistroFrequenciaDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<RegistroFrequenciaDto> findById(@PathVariable Long id) {
        RegistroFrequenciaDto dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<RegistroFrequenciaDto> insert(@RequestBody RegistroFrequenciaDto dto) {

        dto = service.insert(dto);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();

        return ResponseEntity.created(uri).body(null);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<RegistroFrequenciaDto> update(
            @PathVariable Long id,
            @RequestBody RegistroFrequenciaDto dto) {

        dto = service.update(id, dto);

        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}