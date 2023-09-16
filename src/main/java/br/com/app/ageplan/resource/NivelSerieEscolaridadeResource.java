package br.com.app.ageplan.resource;

import br.com.app.ageplan.dto.NivelSerieEscolaridadeDto;
import br.com.app.ageplan.service.NivelSerieEscolaridadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/nivel_serie_escolaridade")
public class NivelSerieEscolaridadeResource {

    @Autowired
    private NivelSerieEscolaridadeService service;

    @GetMapping
    public ResponseEntity<List<NivelSerieEscolaridadeDto>> findAll() {
        List<NivelSerieEscolaridadeDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<NivelSerieEscolaridadeDto> findById(@PathVariable Long id) {
        NivelSerieEscolaridadeDto dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<NivelSerieEscolaridadeDto> insert(@RequestBody NivelSerieEscolaridadeDto dto) {

        dto = service.insert(dto);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();

        return ResponseEntity.ok().body(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<NivelSerieEscolaridadeDto> update(
            @PathVariable Long id,
            @RequestBody NivelSerieEscolaridadeDto dto) {

        dto = service.update(id, dto);

        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}