package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.Endereco;
import br.com.app.ageplan.entity.TipoLogradouro;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * DTO para {@link Endereco}
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /*------------------------------------------------------------*/
    private Long id;
    private String CEP;
    private String nomeLogradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    /*------------------------------------------------------------*/
    // Relacionamento com a classe Pessoa
    // private List<Pessoa> pessoas;

    /*------------------------------------------------------------*/
    // Relacionamento com a classe TipoLogradouro
    private TipoLogradouro tipoLogradouro;

    /*------------------------------------------------------------*/
    // Construtor usando objeto Endereco como argumento
    public EnderecoDto(Endereco endereco) {
        this.id = endereco.getId();
        this.CEP = endereco.getCEP();
        this.nomeLogradouro = endereco.getNomeLogradouro();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.bairro = endereco.getBairro();
        this.cidade = endereco.getCidade();
        this.estado = endereco.getEstado();
        this.pais = endereco.getPais();
        this.tipoLogradouro = endereco.getTipoLogradouro();
    }

}