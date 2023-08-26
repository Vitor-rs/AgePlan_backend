package br.com.app.ageplan.entity.enums;

import lombok.Getter;

@Getter
public enum TipoLogradouro {

    RUA("Rua"),
    AVENIDA("Avenida"),
    TRAVESSA("Travessa"),
    ESTRADA("Estrada"),
    ALAMEDA("Alameda"),
    RODOVIA("Rodovia"),
    PRACA("Praça"),
    LARGO("Largo"),
    BECO("Beco"),
    OUTROS("Outros");

    private final String descricao;

    TipoLogradouro(String descricao) {
        this.descricao = descricao;
    }

}