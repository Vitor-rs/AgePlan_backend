package br.com.app.ageplan.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@MappedSuperclass
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable {
    /**
     * Atributo serial version UID que é usado para
     * identificar a versão de uma classe serializada
     */
    @Serial
    private static final long serialVersionUID = 1L;
    /*------------------------------------------------------------*/
    /**
     * O atributo "id" é a chave primária da tabela "tb_pessoa". Usa-se a anotação GenerationType.SEQUENCE
     * para gerar o valor da chave primária. O atributo "generator" é usado para especificar o nome da
     * sequência que será usada para gerar o valor da chave primária
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_sequence")
    @Column(name = "id", nullable = false)
    private Long id;
    /*------------------------------------------------------------*/
    private String nome;
    private String dataNascimento;
    private String CPF;
    private String RG;

    /*------------------------------------------------------------*/
    /* Construtor padrão */
    public Pessoa() {}
    /*------------------------------------------------------------*/

    /**
     * Construtor com parâmetros
     */
    public Pessoa(String nome, String dataNascimento, String CPF, String RG) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.RG = RG;

    }
    /*------------------------------------------------------------*/

    /**
     * Getters e Setters
     */
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

    public String getRG() { return RG; }

    public void setRG(String RG) { this.RG = RG; }

    /*------------------------------------------------------------*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return Objects.equals(getId(), pessoa.getId())
                && Objects.equals(getNome(), pessoa.getNome())
                && Objects.equals(getDataNascimento(), pessoa.getDataNascimento())
                && Objects.equals(getCPF(), pessoa.getCPF())
                && Objects.equals(getRG(), pessoa.getRG());

        /* O "equals" é usado para comparar o objeto atual com outro objeto.
         * O "instanceof" é usado para verificar se um objeto é do tipo especificado.
         * O "Objects.equals" compara dois objetos para verificar se são iguais.
         * A maioria dos métodos "equals" são implementados com o "instanceof" e o "Objects.equals".
         * A maior vantagem do "equals" é que ele pode ser usado para comparar objetos nulos.
        * */
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getDataNascimento(), getCPF(), getRG());

        /* A função do "hashCode" no código é retornar um valor inteiro que representa o objeto.
         * Por exemplo, se você tiver uma classe Pessoa com os atributos nome e idade, você pode
         * retornar um valor inteiro que representa o objeto Pessoa. O "hashCode" é usado para
         * melhorar o desempenho de pesquisa em estruturas de dados como HashMap, HashSet, etc.
         * O "Objects.hash" retorna um valor inteiro calculado a partir dos argumentos.
         * Um exemplo de hashcode é o número de identificação de um produto, como o código de barras.
         * Um número hash calculado seria algo como 123456789. Então a classe Pessoa teria um número
         * hash de 123456789. O "Objects.hash" é usado para calcular o hash de vários argumentos.
        * */
    }
}