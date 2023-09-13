package br.com.app.ageplan.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

import java.util.Objects;

@Entity
@Getter
@Table(name = "tb_endereco")
public class Endereco implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /*----------------------------------------------------------*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*----------------------------------------------------------*/
    private String CEP;

/*
    private String nomeLogradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
*/

    /*----------------------------------------------------------*/
    // Relacionamento com a classe TipoLogradouro
    @ManyToOne
    @JoinColumn(name = "tipo_logradouro_id_fk")
    private TipoLogradouro tipoLogradouro;

    /*----------------------------------------------------------*/
    // Associação com a classe Pessoa
/*
    @OneToMany(mappedBy = "endereco", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Pessoa> pessoas;
*/

    /*----------------------------------------------------------*/
    // Construtor sem argumentos
    public Endereco() {}

    /*----------------------------------------------------------*/
    // Construtor com argumentos
    public Endereco(Long id,
                    String CEP,

                    /*
                      String nomeLogradouro
                      Integer numero,
                      String complemento,
                      String bairro,
                      String cidade,
                      String estado,
                      String pais
                     */

                    TipoLogradouro tipoLogradouro
    )
    {
        this.id = id;
        this.CEP = CEP;
/*
    this.nomeLogradouro = nomeLogradouro;
    this.numero = numero;
    this.complemento = complemento;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.pais = pais;
*/
        this.tipoLogradouro = tipoLogradouro;
    }

    /*----------------------------------------------------------*/
    // Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
/**
 * public void setNomeLogradouro(String nomeLogradouro) {
 * this.nomeLogradouro = nomeLogradouro;
 * }
 * public void setNumero(Integer numero) {
 * this.numero = numero;
 * }
 * public void setComplemento(String complemento) {
 * this.complemento = complemento;
 * }
 * public void setBairro(String bairro) {
 * this.bairro = bairro;
 * }
 * public void setCidade(String cidade) {
 * this.cidade = cidade;
 * }
 * public void setEstado(String estado) {
 * this.estado = estado;
 * }
 * public void setPais(String pais) {
 * this.pais = pais;
 * }
 * public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
 * this.tipoLogradouro = tipoLogradouro;
 * }
 * ----------------------------------------------------------
 * equals() e hashCode()
 */
@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco endereco)) return false;
        return Objects.equals(getId(), endereco.getId()) &&
                Objects.equals(getCEP(), endereco.getCEP()) &&
/*
    Objects.equals(getNomeLogradouro(), endereco.getNomeLogradouro()) &&
    Objects.equals(getNumero(), endereco.getNumero()) &&
    Objects.equals(getComplemento(), endereco.getComplemento()) &&
    Objects.equals(getBairro(), endereco.getBairro()) &&
    Objects.equals(getCidade(), endereco.getCidade()) &&
    Objects.equals(getEstado(), endereco.getEstado()) &&
    Objects.equals(getPais(), endereco.getPais()
*/
                Objects.equals(getTipoLogradouro(), endereco.getTipoLogradouro()
                );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getId(),
                getCEP(),
/*
    getNomeLogradouro(),
    getNumero(),
    getComplemento(),
    getBairro(),
    getCidade(),
    getEstado(),
    getPais()
 */
               getTipoLogradouro()
        );
    }
}