package br.com.app.ageplan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
    private String nomeLogradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    /*----------------------------------------------------------*/
    // Relacionamento com a classe TipoLogradouro
    @ManyToOne
    @JoinColumn(name = "tipo_logradouro_id_fk")
    private TipoLogradouro tipoLogradouro;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco endereco)) return false;
        return Objects.equals(getId(), endereco.getId()) &&
                Objects.equals(getCEP(), endereco.getCEP()) &&
                Objects.equals(getNomeLogradouro(), endereco.getNomeLogradouro()) &&
                Objects.equals(getNumero(), endereco.getNumero()) &&
                Objects.equals(getComplemento(), endereco.getComplemento()) &&
                Objects.equals(getBairro(), endereco.getBairro()) &&
                Objects.equals(getCidade(), endereco.getCidade()) &&
                Objects.equals(getEstado(), endereco.getEstado()) &&
                Objects.equals(getPais(), endereco.getPais()) &&
                Objects.equals(getTipoLogradouro(), endereco.getTipoLogradouro()
                );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getId(),
                getCEP(),
                getNomeLogradouro(),
                getNumero(),
                getComplemento(),
                getBairro(),
                getCidade(),
                getEstado(),
                getPais(),
                getTipoLogradouro());
    }
}