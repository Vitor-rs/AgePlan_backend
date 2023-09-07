package br.com.app.ageplan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class TipoLogradouro implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /*----------------------------------------------------------*/
    @Id
    private Long id;
    /*----------------------------------------------------------*/
    private String nomeTipoLogradouro;
}