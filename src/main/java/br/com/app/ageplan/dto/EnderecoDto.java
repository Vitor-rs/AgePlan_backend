package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.Endereco;
import br.com.app.ageplan.entity.Pessoa;
import br.com.app.ageplan.entity.TipoLogradouro;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * DTO para {@link Endereco}
 */

@Getter
public class EnderecoDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /*------------------------------------------------------------*/
    private Long id;

    private String CEP;
//    private String nomeLogradouro;
//    private Integer numero;
//    private String complemento;
//    private String bairro;
//    private String cidade;
//    private String estado;
//    private String pais;
    /*------------------------------------------------------------*/
    // Relacionamento com a classe Pessoa
    // private List<Pessoa> pessoas;

    /*------------------------------------------------------------*/
    // Relacionamento com a classe TipoLogradouro
    private TipoLogradouro tipoLogradouro;

    /*------------------------------------------------------------*/
    // Construtor sem argumentos
    public EnderecoDto() {}

    /*------------------------------------------------------------*/
    // Construtor com argumentos
    public EnderecoDto(
            Long id,
            String CEP,
//            String nomeLogradouro,
//            Integer numero,
//            String complemento,
//            String bairro,
//            String cidade,
//            String estado,
//            String pais,
//            List<Pessoa> pessoas
            TipoLogradouro tipoLogradouro
    )
    {
        this.id = id;
        this.CEP = CEP;
//        this.nomeLogradouro = nomeLogradouro;
//        this.numero = numero;
//        this.complemento = complemento;
//        this.bairro = bairro;
//        this.cidade = cidade;
//        this.estado = estado;
//        this.pais = pais;
//        this.pessoas = pessoas;
        this.tipoLogradouro = tipoLogradouro;
    }

    /*------------------------------------------------------------*/
    // Construtor usando objeto Endereco como argumento
    public EnderecoDto(Endereco endereco) {
        this.id = endereco.getId();
        this.CEP = endereco.getCEP();
//        this.nomeLogradouro = endereco.getNomeLogradouro();
//        this.numero = endereco.getNumero();
//        this.complemento = endereco.getComplemento();
//        this.bairro = endereco.getBairro();
//        this.cidade = endereco.getCidade();
//        this.estado = endereco.getEstado();
//        this.pais = endereco.getPais();
//        this.pessoas = endereco.getPessoas();
        this.tipoLogradouro = endereco.getTipoLogradouro();
    }

    /*------------------------------------------------------------*/
    // Setters
    public void setId(Long id) { this.id = id; }
    public void setCEP(String CEP) { this.CEP = CEP; }
//    public void setNomeLogradouro(String nomeLogradouro) { this.nomeLogradouro = nomeLogradouro; }
//    public void setNumero(Integer numero) { this.numero = numero; }
//    public void setComplemento(String complemento) { this.complemento = complemento; }
//    public void setBairro(String bairro) { this.bairro = bairro; }
//    public void setCidade(String cidade) { this.cidade = cidade; }
//    public void setEstado(String estado) { this.estado = estado; }
//    public void setPais(String pais) { this.pais = pais; }
//    public void setPessoas(List<Pessoa> pessoas) { this.pessoas = pessoas; }
    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) { this.tipoLogradouro = tipoLogradouro; }

}