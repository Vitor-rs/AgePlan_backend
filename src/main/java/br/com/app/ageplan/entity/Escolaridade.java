package br.com.app.ageplan.entity;

import jakarta.persistence.Id;

import java.io.Serial;
import java.io.Serializable;


public class Escolaridade implements Serializable {
    @Serial
    private final static long serialVersionUID = 1L;
    /*--------------------------------------------------------*/
    @Id
    private Long id;
    /*--------------------------------------------------------*/
    private String nomeDescricao;
}