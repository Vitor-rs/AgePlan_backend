package br.com.app.ageplan.entity;

import br.com.app.ageplan.entity.enums.Escolaridade;
import br.com.app.ageplan.entity.enums.NivelEscolaridade;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class DadoAcademico implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Escolaridade escolaridadeAtual;
    @Enumerated(EnumType.STRING)
    private NivelEscolaridade nivelEscolaridade;
    private String curso;
    private String instituicao;


}