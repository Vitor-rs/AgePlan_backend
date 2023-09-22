package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.RegistroFrequencia;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO para {@link RegistroFrequencia}
 */
@Getter
public class RegistroFrequenciaDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

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
    public RegistroFrequenciaDto() {
    }

    /*--------------------------------------------------------------*/
    // Construtor com parâmetros formatado como na entity
    public RegistroFrequenciaDto(
            Long id,
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
        this.id = id;
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
    // Construtor usando a própria entity como parâmetro formatado como na entity
    public RegistroFrequenciaDto(RegistroFrequencia entity) {
        this.id = entity.getId();
        this.dataHoraRegistro = entity.getDataHoraRegistro();
        this.numeroAula = entity.getNumeroAula();
        this.presenca = entity.getPresenca();
        this.conteudoPlanejado = entity.getConteudoPlanejado();
        this.conteudoMinistrado = entity.getConteudoMinistrado();
        this.observacoesAnotacoes = entity.getObservacoesAnotacoes();
        this.duracaoAula = entity.getDuracaoAula();
        this.fala = entity.getFala();
        this.audicao = entity.getAudicao();
        this.leitura = entity.getLeitura();
        this.escrita = entity.getEscrita();
        this.tarefa = entity.getTarefa();
        this.situacaoTarefa = entity.getSituacaoTarefa();
        this.app = entity.getApp();
        this.engajamento = entity.getEngajamento();
        this.sala = entity.getSala();
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


}