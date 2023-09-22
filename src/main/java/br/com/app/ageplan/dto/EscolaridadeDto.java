package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.Escolaridade;

import java.io.Serial;
import java.io.Serializable;

/**
 * DTO para {@link br.com.app.ageplan.entity.Escolaridade}
 */

public class EscolaridadeDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nomeDescricao;

    /*----------------------------------------------------------*/
    // Construtor sem argumentos
    public EscolaridadeDto() {
    }

    /*----------------------------------------------------------*/
    // Construtor com argumentos
    public EscolaridadeDto(Long id, String nomeDescricao) {
        this.id = id;
        this.nomeDescricao = nomeDescricao;
    }

    /*----------------------------------------------------------*/
    // Construtor usando a entidade como argumento
    public EscolaridadeDto(Escolaridade escolaridade) {
        this.id = escolaridade.getId();
        this.nomeDescricao = escolaridade.getNomeDescricao();
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
    }

}