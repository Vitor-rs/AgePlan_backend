package br.com.app.ageplan.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Entity
@Table(name = "tb_orgao_instituicao_empresa")
public class OrgaoInstituicaoEmpresa implements Serializable {
    @Serial
    private final static long serialVersionUID = 1L;
    // Getters
    /*--------------------------------------------------------*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*--------------------------------------------------------*/
    private String nomeDescricao;
    private String sigla;

    // Construtor sem argumentos ou vazio
    public OrgaoInstituicaoEmpresa() {
    }

    // Construtor com argumentos
    public OrgaoInstituicaoEmpresa(Long id, String nomeDescricao, String sigla) {
        this.id = id;
        this.nomeDescricao = nomeDescricao;
        this.sigla = sigla;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    // HashCode & Equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrgaoInstituicaoEmpresa that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getNomeDescricao(), that.getNomeDescricao()) && Objects.equals(getSigla(), that.getSigla());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNomeDescricao(), getSigla());
    }
}