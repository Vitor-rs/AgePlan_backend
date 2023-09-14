package br.com.app.ageplan.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Entity
@Table(name = "tb_escolaridade")
public class Escolaridade implements Serializable {
    @Serial
    private final static long serialVersionUID = 1L;
    /*--------------------------------------------------------*/
    // Getters
    /*--------------------------------------------------------*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    // Setters
    public void setId(Long id) {
        this.id = id;
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