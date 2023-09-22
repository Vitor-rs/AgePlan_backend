package br.com.app.ageplan.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Entity
@Table(name = "tb_profissao_cargo_funcao")
public class ProfissaoCargoFuncao implements Serializable {
    @Serial
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*--------------------------------------------------------*/
    private String nomeDescricao;

    /*--------------------------------------------------------*/
    // Construtor vazio
    public ProfissaoCargoFuncao() {
    }

    /*--------------------------------------------------------*/
    // Construtor com parâmetros
    public ProfissaoCargoFuncao(Long id, String nomeDescricao) {
        this.id = id;
        this.nomeDescricao = nomeDescricao;
    }

    /*--------------------------------------------------------*/
    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
    }

    /*--------------------------------------------------------*/
    // equals() e hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProfissaoCargoFuncao that)) return false;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getNomeDescricao(), that.getNomeDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getId(),
                getNomeDescricao());
    }
}