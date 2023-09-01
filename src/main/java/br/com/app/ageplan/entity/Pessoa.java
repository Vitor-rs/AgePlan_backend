package br.com.app.ageplan.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class Pessoa implements Serializable {
/** Atributo serial version UID que é usado para
 * identificar a versão de uma classe serializada */
    @Serial
    private static final long serialVersionUID = 1L;
    /*------------------------------------------------------------*/
    /** Este atributo ID é gerado automaticamente pelo banco de dados e não pode ser nulo.
        O GenerationType.IDENTITY é usado para gerar automaticamente o valor do ID. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;
/*------------------------------------------------------------*/
    private String nome;
    private String dataNascimento;
    private String CPF;

/*------------------------------------------------------------*/
    /* Construtor padrão */
    public Pessoa() {}
/*------------------------------------------------------------*/
    /** Construtor com parâmetros */
    public Pessoa(String nome, String dataNascimento, String CPF) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
    }
/*------------------------------------------------------------*/
/** Getters e Setters */
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
    public String getCPF() { return CPF; }
    public void setCPF(String CPF) { this.CPF = CPF; }

}