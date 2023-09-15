package br.com.app.ageplan.dto;

import lombok.Getter;

import br.com.app.ageplan.entity.ProfissaoCargoFuncao;

import java.io.Serial;
import java.io.Serializable;

/**
 * DTO para {@link ProfissaoCargoFuncao}
 */
@Getter
public class ProfissaoCargoFuncaoDto implements Serializable {
    @Serial
    private final static long serialVersionUID = 1L;

    // Getters
    private Long id;
    private String nomeDescricao;

    // Construtor vazio
    public ProfissaoCargoFuncaoDto() {}

    // Construtor com parâmetros
    public ProfissaoCargoFuncaoDto(Long id, String nomeDescricao) {
        this.id = id;
        this.nomeDescricao = nomeDescricao;
    }

    // Construtor usando entidade como parâmetro
    public ProfissaoCargoFuncaoDto(ProfissaoCargoFuncao entity) {
        this.id = entity.getId();
        this.nomeDescricao = entity.getNomeDescricao();
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
    }

}