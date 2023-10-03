package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.Contrato;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * DTO para {@link Contrato}
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContratoDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /*-------------------------------------------------------------*/
    private Long id;
    /*-------------------------------------------------------------*/
    private Boolean situacao;
    private Date dataInicio;
    private Date dataTermino;
    private Date dataCancelamento;
    private Date dataTrancamento;

    /*----------------------------------------------------------*/
    // Construtor usando o objeto Contrato

    public ContratoDto(Contrato entity) {
        this.id = entity.getId();
        this.situacao = entity.getSituacao();
        this.dataInicio = entity.getDataInicio();
        this.dataTermino = entity.getDataTermino();
        this.dataCancelamento = entity.getDataCancelamento();
        this.dataTrancamento = entity.getDataTrancamento();
    }

}