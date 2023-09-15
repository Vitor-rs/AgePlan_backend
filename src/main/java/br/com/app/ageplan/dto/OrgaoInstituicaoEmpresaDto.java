package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.OrgaoInstituicaoEmpresa;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

/**
 * DTO para {@link OrgaoInstituicaoEmpresa}
 */

@Getter
public class OrgaoInstituicaoEmpresaDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /*--------------------- Getters -------------------*/
    private Long id;

    private String nomeDescricao;

    private String sigla;

    /*--------------------- Construtor vazio -------------------*/
    public OrgaoInstituicaoEmpresaDto() {
    }

    /*--------------------- Construtor com parâmetros -------------------*/
    public OrgaoInstituicaoEmpresaDto(Long id, String nomeDescricao, String sigla) {
        this.id = id;
        this.nomeDescricao = nomeDescricao;
        this.sigla = sigla;
    }

    /*--------------------- Construtor usando entidade -------------------*/
    public OrgaoInstituicaoEmpresaDto(OrgaoInstituicaoEmpresa obj) {
        this.id = obj.getId();
        this.nomeDescricao = obj.getNomeDescricao();
        this.sigla = obj.getSigla();
    }

    /*--------------------- Setters -------------------*/
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

}