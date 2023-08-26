package br.com.app.ageplan.entity;

import br.com.app.ageplan.entity.enums.TipoLogradouro;
import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Entity
public class Endereco implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /*-------------------------------------------------------------------------------*/
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    /*-------------------------------------------------------------------------------*/
    private String CEP;
    private TipoLogradouro tipoLogradouro; // Rua, Avenida, Travessa, etc
    private String logradouro; // nome da rua, avenida, travessa, etc
    private Integer numero;
    private String complemento; // casa, apartamento, etc
    private String bairro;
    private String cidade;
    private String estado;

/*-------------------------------------------------------------------------------*/
    /* Construtor padrão */
    public Endereco() {}
/*-------------------------------------------------------------------------------*/
    /* Construtor com parâmetros */
    public Endereco(Long id, String CEP, TipoLogradouro tipoLogradouro,
                    String logradouro, Integer numero, String complemento,
                    String bairro, String cidade, String estado) {
        this.id = id;
        this.CEP = CEP;
        this.tipoLogradouro = TipoLogradouro.valueOf(tipoLogradouro.getDescricao());
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(Integer numero) {
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
/*-------------------------------------------------------------------------------*/

}