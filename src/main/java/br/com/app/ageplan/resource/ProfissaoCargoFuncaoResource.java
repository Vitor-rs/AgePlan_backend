package br.com.app.ageplan.resource;

import br.com.app.ageplan.dto.ProfissaoCargoFuncaoDto;
import br.com.app.ageplan.service.ProfissaoCargoFuncaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/profissao_cargo_funcao")
public class ProfissaoCargoFuncaoResource {

    @Autowired
    private ProfissaoCargoFuncaoService service;

    @GetMapping
    public ResponseEntity<List<ProfissaoCargoFuncaoDto>> findAll() {
        List<ProfissaoCargoFuncaoDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProfissaoCargoFuncaoDto> findById(@PathVariable Long id) {
        ProfissaoCargoFuncaoDto dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<ProfissaoCargoFuncaoDto> insert(@RequestBody ProfissaoCargoFuncaoDto dto) {

        dto = service.insert(dto);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();

        return ResponseEntity.created(uri).body(null);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProfissaoCargoFuncaoDto> update(
            @PathVariable Long id,
            @RequestBody ProfissaoCargoFuncaoDto dto) {

        dto = service.update(id, dto);

        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}