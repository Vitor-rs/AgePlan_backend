package br.com.app.ageplan.entity;

import jakarta.persistence.Id;

import java.io.Serial;
import java.io.Serializable;

public class OrgaoInstituicaoEmpresa implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /*-----------------------------------------------------------*/

    @Id
    private Long id;
    private String nome;

    /*-----------------------------------------------------------*/
    public OrgaoInstituicaoEmpresa() {
    }

    /*-----------------------------------------------------------*/
    public OrgaoInstituicaoEmpresa(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    /*-----------------------------------------------------------*/


}