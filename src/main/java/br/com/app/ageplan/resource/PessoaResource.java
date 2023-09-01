package br.com.app.ageplan.resource;

import br.com.app.ageplan.dto.PessoaDto;
import br.com.app.ageplan.entity.Pessoa;
import br.com.app.ageplan.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaResource {

}