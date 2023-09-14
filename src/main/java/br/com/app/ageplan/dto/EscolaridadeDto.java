package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.Escolaridade;
import lombok.Value;

import java.io.Serial;
import java.io.Serializable;

/**
 * DTO para {@link Escolaridade}
 */

public class EscolaridadeDto implements Serializable {
    @Serial
    private final static long serialVersionUID = 1L;
    /*--------------------------------------------------------*/
    private Long id;

    private String nomeDescricao;
}