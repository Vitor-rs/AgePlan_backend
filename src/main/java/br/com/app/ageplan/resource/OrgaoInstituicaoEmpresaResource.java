package br.com.app.ageplan.resource;


import br.com.app.ageplan.dto.OrgaoInstituicaoEmpresaDto;
import br.com.app.ageplan.service.OrgaoInstituicaoEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/orgao_instituicao_empresa")
public class OrgaoInstituicaoEmpresaResource {

    @Autowired
    private OrgaoInstituicaoEmpresaService service;

    @GetMapping
    public ResponseEntity<List<OrgaoInstituicaoEmpresaDto>> findAll() {
        List<OrgaoInstituicaoEmpresaDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrgaoInstituicaoEmpresaDto> findById(@PathVariable Long id) {
        OrgaoInstituicaoEmpresaDto dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<OrgaoInstituicaoEmpresaDto> insert(@RequestBody OrgaoInstituicaoEmpresaDto dto) {

        dto = service.insert(dto);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();

        return ResponseEntity.ok().body(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<OrgaoInstituicaoEmpresaDto> update(
            @PathVariable Long id,
            @RequestBody OrgaoInstituicaoEmpresaDto dto) {

        dto = service.update(id, dto);

        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }




}