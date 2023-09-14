package br.com.app.ageplan.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Entity
@Table(name = "tb_tipo_logradouro")
public class TipoLogradouro implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*----------------------------------------------------------*/
    private String nomeTipoLogradouro;

    /*----------------------------------------------------------*/
    // Construtor sem argumentos
    public TipoLogradouro() {
    }

    /*----------------------------------------------------------*/
    // Construtor com argumentos
    public TipoLogradouro(Long id, String nomeTipoLogradouro) {
        this.id = id;
        this.nomeTipoLogradouro = nomeTipoLogradouro;
    }

    /*----------------------------------------------------------*/
    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeTipoLogradouro(String nomeTipoLogradouro) {
        this.nomeTipoLogradouro = nomeTipoLogradouro;
    }

    /*----------------------------------------------------------*/
    // Equals and HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TipoLogradouro that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getNomeTipoLogradouro(), that.getNomeTipoLogradouro());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNomeTipoLogradouro());
    }
}