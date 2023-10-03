package br.com.app.ageplan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_contrato")
public class Contrato implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /*-------------------------------------------------------------*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*-------------------------------------------------------------*/

    private Boolean situacao;
    private Date dataInicio;
    private Date dataTermino;
    private Date dataCancelamento;
    private Date dataTrancamento;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contrato contrato)) return false;
        return Objects.equals(getId(), contrato.getId()) &&
                Objects.equals(getSituacao(), contrato.getSituacao()) &&
                Objects.equals(getDataInicio(), contrato.getDataInicio()) &&
                Objects.equals(getDataTermino(), contrato.getDataTermino()) &&
                Objects.equals(getDataCancelamento(), contrato.getDataCancelamento()) &&
                Objects.equals(getDataTrancamento(), contrato.getDataTrancamento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getSituacao(),
                getDataInicio(),
                getDataTermino(),
                getDataCancelamento(),
                getDataTrancamento());
    }
}