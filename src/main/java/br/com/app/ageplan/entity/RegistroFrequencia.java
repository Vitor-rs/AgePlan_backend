package br.com.app.ageplan.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Entity
public class RegistroFrequencia implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*--------------------------------------------------------------*/

	private LocalDateTime dataHoraRegistro;
	private Integer numeroAula;
	private char presenca;
	private String conteudoPlanejado;
    private String conteudoMinistrado;
	private String observacoesAnotacoes;
	private String duracaoAula;
	private Integer fala;
	private Integer audicao;
	private Integer leitura;
	private Integer escrita;
	private Integer tarefa;
	private String situacaoTarefa;
	private String app;
	private Integer engajamento;
	private Integer sala;

    /*--------------------------------------------------------------*/
    // Construtor vazio
    public RegistroFrequencia() {}

    /*--------------------------------------------------------------*/
    // Construtor com parâmetros
    public RegistroFrequencia(
            LocalDateTime dataHoraRegistro,
            Integer numeroAula, char presenca,
            String conteudoPlanejado,
            String conteudoMinistrado,
            String observacoesAnotacoes,
            String duracaoAula,
            Integer fala,
            Integer audicao,
            Integer leitura,
            Integer escrita,
            Integer tarefa,
            String situacaoTarefa,
            String app,
            Integer engajamento,
            Integer sala
    ) {
        this.dataHoraRegistro = dataHoraRegistro;
        this.numeroAula = numeroAula;
        this.presenca = presenca;
        this.conteudoPlanejado = conteudoPlanejado;
        this.conteudoMinistrado = conteudoMinistrado;
        this.observacoesAnotacoes = observacoesAnotacoes;
        this.duracaoAula = duracaoAula;
        this.fala = fala;
        this.audicao = audicao;
        this.leitura = leitura;
        this.escrita = escrita;
        this.tarefa = tarefa;
        this.situacaoTarefa = situacaoTarefa;
        this.app = app;
        this.engajamento = engajamento;
        this.sala = sala;
    }

    /*--------------------------------------------------------------*/
    // Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setDataHoraRegistro(LocalDateTime dataHoraRegistro) {
        this.dataHoraRegistro = dataHoraRegistro;
    }
    public void setNumeroAula(Integer numeroAula) {
        this.numeroAula = numeroAula;
    }
    public void setPresenca(char presenca) {
        this.presenca = presenca;
    }
    public void setConteudoPlanejado(String conteudoPlanejado) {
        this.conteudoPlanejado = conteudoPlanejado;
    }
    public void setConteudoMinistrado(String conteudoMinistrado) {
        this.conteudoMinistrado = conteudoMinistrado;
    }
    public void setObservacoesAnotacoes(String observacoesAnotacoes) {
        this.observacoesAnotacoes = observacoesAnotacoes;
    }
    public void setDuracaoAula(String duracaoAula) {
        this.duracaoAula = duracaoAula;
    }
    public void setFala(Integer fala) {
        this.fala = fala;
    }
    public void setAudicao(Integer audicao) {
        this.audicao = audicao;
    }
    public void setLeitura(Integer leitura) {
        this.leitura = leitura;
    }
    public void setEscrita(Integer escrita) {
        this.escrita = escrita;
    }
    public void setTarefa(Integer tarefa) {
        this.tarefa = tarefa;
    }
    public void setSituacaoTarefa(String situacaoTarefa) {
        this.situacaoTarefa = situacaoTarefa;
    }
    public void setApp(String app) {
        this.app = app;
    }
    public void setEngajamento(Integer engajamento) {
        this.engajamento = engajamento;
    }
    public void setSala(Integer sala) {
        this.sala = sala;
    }


    /*--------------------------------------------------------------*/
    // equals() e hashCode()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistroFrequencia that)) return false;
        return presenca == that.presenca &&
                Objects.equals(id, that.id) &&
                Objects.equals(dataHoraRegistro, that.dataHoraRegistro) &&
                Objects.equals(numeroAula, that.numeroAula) &&
                Objects.equals(conteudoPlanejado, that.conteudoPlanejado) &&
                Objects.equals(conteudoMinistrado, that.conteudoMinistrado) &&
                Objects.equals(observacoesAnotacoes, that.observacoesAnotacoes) &&
                Objects.equals(duracaoAula, that.duracaoAula) &&
                Objects.equals(fala, that.fala) &&
                Objects.equals(audicao, that.audicao) &&
                Objects.equals(leitura, that.leitura) &&
                Objects.equals(escrita, that.escrita) &&
                Objects.equals(tarefa, that.tarefa) &&
                Objects.equals(situacaoTarefa, that.situacaoTarefa) &&
                Objects.equals(app, that.app) &&
                Objects.equals(engajamento, that.engajamento) &&
                Objects.equals(sala, that.sala);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getId(),
                getDataHoraRegistro(),
                getNumeroAula(),
                getPresenca(),
                getConteudoPlanejado(),
                getConteudoMinistrado(),
                getObservacoesAnotacoes(),
                getDuracaoAula(),
                getFala(),
                getAudicao(),
                getLeitura(),
                getEscrita(),
                getTarefa(),
                getSituacaoTarefa(),
                getApp(),
                getEngajamento(),
                getSala()
        );
    }

}