package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.Escolaridade;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

/**
 * DTO para {@link Escolaridade}
 */

@Getter
public class EscolaridadeDto implements Serializable {
    @Serial
    private final static long serialVersionUID = 1L;
    /*--------------------------------------------------------*/
    // Getters
    /*--------------------------------------------------------*/
    private Long id;

    private String nomeDescricao;

    /*--------------------------------------------------------*/
    // Construtor vazio
    public EscolaridadeDto() {
    }

    // Construtor com parâmetros
    public EscolaridadeDto(Long id, String nomeDescricao) {
        this.id = id;
        this.nomeDescricao = nomeDescricao;
    }

    /*--------------------------------------------------------*/
    // Construtor usando a entidade como parâmetro
    public EscolaridadeDto(Escolaridade escolaridade) {
        this.id = escolaridade.getId();
        this.nomeDescricao = escolaridade.getNomeDescricao();
    }

    /*--------------------------------------------------------*/
    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
    }

}