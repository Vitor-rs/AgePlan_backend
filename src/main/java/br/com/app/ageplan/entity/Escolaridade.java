package br.com.app.ageplan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_escolaridade")
public class Escolaridade implements Serializable {
    @Serial
    private final static long serialVersionUID = 1L;
    /*--------------------------------------------------------*/
    @Id
    private Long id;
    /*--------------------------------------------------------*/
    private String nomeDescricao;

    /*--------------------------------------------------------*/
    // Construtor vazio
    public Escolaridade() {
    }

    // Construtor com parâmetros
    public Escolaridade(Long id, String nomeDescricao) {
        this.id = id;
        this.nomeDescricao = nomeDescricao;
    }

    /*--------------------------------------------------------*/
    // Getters
    public Long getId() {
        return id;
    }

    /*--------------------------------------------------------*/
    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDescricao() {
        return nomeDescricao;
    }

    public void setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
    }

    /*--------------------------------------------------------*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Escolaridade that)) return false;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getNomeDescricao(), that.getNomeDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getNomeDescricao());
    }
}