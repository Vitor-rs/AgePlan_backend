package br.com.app.ageplan.entity;

import jakarta.persistence.*;


import java.io.Serial;
import java.io.Serializable;

/** Como a classe Cliente herda de Pessoa, não é necessário declarar os atributos da classe Pessoa.
    A classe Pessoa também possui "id", portanto, a classe Pessoa será uma "superclasse" de Cliente, ou abstract class.
    As anotações necessárias para Cliente em relação a Pessoa são:
    @Entity
    @Inheritance(strategy = InheritanceType.JOINED)
    @DiscriminatorColumn(name = "tipo_pessoa", discriminatorType = DiscriminatorType.STRING)
    @DiscriminatorValue("C")
 *
 * */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_pessoa", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("C")
public class Cliente extends Pessoa implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String matricula;
    private String contrato;
    private String login;
    private String senha;

    /*----------------------------------------------------------*/

    /**
     * Em relação aos construtores de Cliente, não é necessário declarar os atributos da classe Pessoa.
     * O construtor sem argumentos é necessário para o Spring.
     * O construtor com argumentos é necessário para o Service.
     */

    // Construtor sem argumentos
    public Cliente() {
    }
    // Construtor com argumentos


    /**
     * Uma forma mais eficiente de declarar o construtor com argumentos da classe Cliente que herda de Pessoa seria
     * o seguinte:
     */

    public Cliente(Pessoa pessoa) {
        super();
        this.matricula = matricula;
        this.contrato = contrato;
        this.login = login;
        this.senha = senha;
    }
}