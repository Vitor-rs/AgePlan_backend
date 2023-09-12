package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.Endereco;
import br.com.app.ageplan.entity.TipoLogradouro;

import java.io.Serial;
import java.io.Serializable;

/**
 * DTO para {@link Endereco}
 */

public class EnderecoDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /*------------------------------------------------------------*/
    Long id;
    String CEP;
    TipoLogradouro tipoLogradouro;
    String nomeLogradouro;
    Integer numero;
    String complemento;
    String bairro;
    String cidade;
    String estado;
}