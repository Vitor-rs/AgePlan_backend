package br.com.app.ageplan.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Entity
public abstract class Pessoa implements Serializable {
/** Atributo serial version UID que é usado para
 * identificar a versão de uma classe serializada
*/
    @Serial
    private static final long serialVersionUID = 1L;
/*------------------------------------------------------------*/
    /** Este atributo ID é gerado automaticamente pelo banco de dados e não pode ser nulo.
        O GenerationType.IDENTITY é usado para gerar automaticamente o valor do ID.
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;
/*------------------------------------------------------------*/
    private String nome;
    private String dataNascimento;
    private String CPF;
    private String RG;
    private String telefoneCelular;
    private String telefoneFixo;
    private String email;
    private Boolean estrangeiro;

/*------------------------------------------------------------*/
    /** Este atributo é uma chave estrangeira que referencia a classe Endereco.
        O JoinColumn é usado para especificar a coluna com a qual a entidade está mapeada.
    */
    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "dado_academico_id")
    private DadoAcademico dadoAcademico;

/*------------------------------------------------------------*/
    /** Construtor padrão */
    public Pessoa() {}
/*------------------------------------------------------------*/
    /** Construtor com parâmetros */
    public Pessoa(Long id, String nome, String dataNascimento,
                  String CPF, String RG, String telefoneCelular,
                  String telefoneFixo, String email, Boolean estrangeiro,
                  Endereco endereco, DadoAcademico dadoAcademico) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.RG = RG;
        this.telefoneCelular = telefoneCelular;
        this.telefoneFixo = telefoneFixo;
        this.email = email;
        this.estrangeiro = estrangeiro;
        this.endereco = endereco;
        this.dadoAcademico = dadoAcademico;
    }
/*------------------------------------------------------------*/

    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public void setRG(String RG) {
        this.RG = RG;
    }
    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }
    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEstrangeiro(Boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setDadoAcademico(DadoAcademico dadoAcademico) {
        this.dadoAcademico = dadoAcademico;
    }
}