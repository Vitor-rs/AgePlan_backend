package br.com.app.ageplan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class Endereco implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /*----------------------------------------------------------*/
    @Id
    private Long id;
    /*----------------------------------------------------------*/
    private String CEP;
    @ManyToOne
    @JoinColumn(name = "tipo_logradouro_id")
    private TipoLogradouro tipoLogradouro;
    private String nomeLogradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;


}