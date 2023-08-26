package br.com.app.ageplan.entity.enums;

import lombok.Getter;

@Getter
public enum Escolaridade {

    FUNDAMENTAL_INCOMPLETO("Fundamental Incompleto"),
    FUNDAMENTAL_COMPLETO("Fundamental Completo"),
    MEDIO_INCOMPLETO("Médio Incompleto"),
    MEDIO_COMPLETO("Médio Completo"),
    SUPERIOR_INCOMPLETO("Superior Incompleto"),
    SUPERIOR_COMPLETO("Superior Completo"),
    POS_GRADUACAO_INCOMPLETO("Pós-Graduação Incompleto"),
    POS_GRADUACAO_COMPLETO("Pós-Graduação Completo"),
    MESTRADO_INCOMPLETO("Mestrado Incompleto"),
    MESTRADO_COMPLETO("Mestrado Completo"),
    DOUTORADO_INCOMPLETO("Doutorado Incompleto"),
    DOUTORADO_COMPLETO("Doutorado Completo");

    private final String descricao;

    Escolaridade(String descricao) {
        this.descricao = descricao;
    }

}