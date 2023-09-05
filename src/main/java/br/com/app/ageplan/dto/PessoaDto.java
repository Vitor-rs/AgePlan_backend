package br.com.app.ageplan.dto;


import br.com.app.ageplan.entity.Pessoa;

import java.io.Serial;
import java.io.Serializable;

public class PessoaDto implements Serializable {
    /* As vezes algumas IDEs alertam o uso do Lombok @Getter, pois o mesmo pode ser substituído por um método
     * getNomeDaVariavel() e o mesmo pode ser gerado automaticamente pelo IDE, mas o Lombok é uma ferramenta
     * que facilita o desenvolvimento, pois ele gera automaticamente os métodos getters e setters, além de
     * outros métodos que podem ser úteis, como o toString(), equals(), hashCode() e etc.
    * */

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String dataNascimento;
    private String CPF;
    private String RG;

    /*------------------------------------------------------------*/
    /* Construtor padrão */
    public PessoaDto() {
    }

    /*------------------------------------------------------------*/
    /**
     * Construtor com parâmetros
     */
    public PessoaDto(Long id, String nome, String dataNascimento, String CPF) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
    }

    /*------------------------------------------------------------*/
    /* Construtuor com a classe entity Pessoa */
    public PessoaDto(Pessoa entity) {
        id = entity.getId();
        nome = entity.getNome();
        dataNascimento = entity.getDataNascimento();
        CPF = entity.getCPF();
    }

    /*------------------------------------------------------------*/
    /* Getters e Setters */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

}