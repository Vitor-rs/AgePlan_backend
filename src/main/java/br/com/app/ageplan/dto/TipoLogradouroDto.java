package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.TipoLogradouro;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

/**
 * DTO para {@link TipoLogradouro}
 */

@Getter
public class TipoLogradouroDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /*----------------------------------------------------------*/
    // Getters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeTipoLogradouro;

    /*----------------------------------------------------------*/
    // Construtor sem argumentos
    public TipoLogradouroDto() {
    }

    /*----------------------------------------------------------*/
    // Construtor com argumentos
    public TipoLogradouroDto(Long id, String nomeTipoLogradouro) {
        this.id = id;
        this.nomeTipoLogradouro = nomeTipoLogradouro;
    }

    /*----------------------------------------------------------*/
    // Construtor usando a entidade como argumento
    public TipoLogradouroDto(TipoLogradouro entity) {
        this.id = entity.getId();
        this.nomeTipoLogradouro = entity.getNomeTipoLogradouro();
    }

    /*----------------------------------------------------------*/
    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeTipoLogradouro(String nomeTipoLogradouro) {
        this.nomeTipoLogradouro = nomeTipoLogradouro;
    }


}