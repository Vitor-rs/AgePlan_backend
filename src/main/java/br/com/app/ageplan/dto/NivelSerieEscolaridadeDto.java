package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.NivelSerieEscolaridade;

import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

/**
 * DTO para {@link NivelSerieEscolaridade}
 */

@Getter
public class NivelSerieEscolaridadeDto implements Serializable {
    @Serial
    private final static long serialVersionUID = 1L;
    /*--------------------------------------------------------*/
    private Long id;
    private String nomeDescricao;
    private NivelSerieEscolaridade nivelSerieEscolaridade;
    /*--------------------------------------------------------*/
    // Construtor sem argumentos
    public NivelSerieEscolaridadeDto() {}
    /*--------------------------------------------------------*/
    // Construtor com argumentos'
    public NivelSerieEscolaridadeDto(Long id, String nomeDescricao, NivelSerieEscolaridade nivelSerieEscolaridade) {
        this.id = id;
        this.nomeDescricao = nomeDescricao;
        this.nivelSerieEscolaridade = nivelSerieEscolaridade;

    }
    /*--------------------------------------------------------*/
    // Construtor usando a entidade como argumento
    public NivelSerieEscolaridadeDto(NivelSerieEscolaridade nivelSerieEscolaridade) {
        this.id = nivelSerieEscolaridade.getId();
        this.nomeDescricao = nivelSerieEscolaridade.getNomeDescricao();
        this.nivelSerieEscolaridade = nivelSerieEscolaridade;
    }
    /*--------------------------------------------------------*/
    // Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
    }
    public void setNivelSerieEscolaridade(NivelSerieEscolaridade nivelSerieEscolaridade) {
        this.nivelSerieEscolaridade = nivelSerieEscolaridade;
    }
}