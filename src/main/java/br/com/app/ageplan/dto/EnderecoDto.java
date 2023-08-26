package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.Endereco;
import lombok.Getter;
import org.hibernate.boot.query.HbmResultSetMappingDescriptor;

@Getter
public class EnderecoDto {

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

/*-------------------------------------------------------------------*/
    /** Construtor padrão */
    public EnderecoDto() {}
/*-------------------------------------------------------------------*/
    /** Construtor com parâmetros */
    public EnderecoDto(String logradouro, String numero, String complemento, String bairro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
/*-------------------------------------------------------------------*/
    /** Construtor usando a classe como parâmetro */
    public EnderecoDto(Endereco endereco) {
        this.logradouro = endereco.getLogradouro();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.bairro = endereco.getBairro();
        this.cidade = endereco.getCidade();
        this.estado = endereco.getEstado();
    }
/*-------------------------------------------------------------------*/

    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

}