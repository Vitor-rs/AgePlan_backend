package br.com.app.ageplan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Entity
public class NivelSerieEscolaridade implements Serializable {
    @Serial
    private final static long serialVersionUID = 1L;
    /*--------------------------------------------------------*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*--------------------------------------------------------*/
    private String nomeDescricao;

    /*--------------------------------------------------------*/
    // Construtor sem argumentos
    public NivelSerieEscolaridade() {}

    /*--------------------------------------------------------*/
    // Construtor com argumentos
    public NivelSerieEscolaridade(Long id, String nomeDescricao) {
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
    // Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NivelSerieEscolaridade that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getNomeDescricao(), that.getNomeDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNomeDescricao());
    }
}