package br.com.app.ageplan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/** Como a classe Aluno herda de Pessoa, não é necessário declarar os atributos da classe Pessoa.
    A classe Pessoa também possui "id", portanto, a classe Pessoa será uma "superclasse" de Aluno, ou abstract class.
    As anotações necessárias para Aluno em relação a Pessoa são:
    @Entity
    @Inheritance(strategy = InheritanceType.JOINED)
    @DiscriminatorColumn(name = "tipo_pessoa", discriminatorType = DiscriminatorType.STRING)
    @DiscriminatorValue("C")
 *
 * */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_cliente")

/*
    Existem 3 estratégias de herança no JPA:
    1. SINGLE_TABLE: todos os atributos de todas as classes filhas ficam em uma única tabela.
    2. JOINED: cada classe filha possui sua própria tabela, mas os atributos da classe pai ficam em uma tabela separada.
    3. TABLE_PER_CLASS: cada classe filha possui sua própria tabela, e os atributos da classe pai ficam em cada tabela filha.

    A estratégia SINGLE_TABLE é a mais simples, mas pode gerar problemas de performance, pois a tabela pode ficar muito grande.

    A estratégia JOINED é a mais recomendada, pois não gera problemas de performance, e é a mais simples de implementar.

    A estratégia TABLE_PER_CLASS é a mais complexa, e não é recomendada.

    Como a classe Pessoa é uma classe abstrata, Pessoa apenas terá a camada de Dto.

    A classe Pessoa é uma superclasse de Aluno e Professor.
    Ao declarar a classe Pessoa como abstrata, segundo a arquitetura de camadas MVC ORM do Spring,

    a classe Pessoa não será mapeada para o banco de dados. Somente as classes Aluno e Professor serão mapeadas.

    Para criar um relacionamento de herança entre as classes Pessoa, Aluno e Professor, é necessário utilizar as anotações:

    - na classe Pessoa:

    @Entit
    @MappedSuperclass
    @Inheritance(strategy = InheritanceType.JOINED)
    @DiscriminatorColumn(name = "tipo_pessoa", discriminatorType = DiscriminatorType.STRING)

    - na classe Aluno:

    @Entity
    @DiscriminatorValue("C")

    - na classe Professor:

    @Entity
    @DiscriminatorValue("P")

    A anotação @MappedSuperclass indica que a classe Pessoa não será mapeada para o banco de dados.
    Logo abaixo da anotação @Entity, é necessário adicionar a anotação @MappedSuperclass.

    Há casos em que a anotação @Entity n~so é necessária nas classes filhas, pois a classe pai já possui a anotação @Entity.


    Uma alternativa à herança é a composição.

    A composição é uma alternativa à herança, e é mais recomendada que a herança.

    Para fazer a composição, é necessário criar um atributo do tipo Pessoa na classe Aluno.

    A classe Aluno possui um atributo do tipo Pessoa, e esse atributo é anotado com @OneToOne.

    A anotação @OneToOne indica que a relação entre Aluno e Pessoa é de um para um.

    A anotação @JoinColumn(name = "id_pessoa_fk") indica que a coluna "id_pessoa_fk" será criada na tabela tb_cliente.



    A anotação @Inheritance(strategy = InheritanceType.JOINED) indica que a estratégia de herança será JOINED.

    A anotação @DiscriminatorColumn(name = "tipo_pessoa", discriminatorType = DiscriminatorType.STRING) indica que a coluna "tipo_pessoa" será criada na tabela tb_pessoa.

    A anotação @DiscriminatorValue("C") indica que o valor da coluna "tipo_pessoa" será "C" para a classe Aluno.

    A DiscriminatorColumn e DiscriminatorValue são opcionais, mas é recomendado utilizá-las para evitar problemas de performance.

    DiscriminatorColumn significa que a coluna "tipo_pessoa" será criada na tabela tb_pessoa.

    DiscriminatorValue significa que o valor da coluna "tipo_pessoa" será "C" para a classe Aluno.


*/
public class Aluno extends Pessoa implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;


    // Getters
    private String matricula;
    private String contrato;
    private String login;
    private String senha;



    // Equals e HashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getMatricula(), aluno.getMatricula()) && Objects.equals(getContrato(), aluno.getContrato()) && Objects.equals(getLogin(), aluno.getLogin()) && Objects.equals(getSenha(), aluno.getSenha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMatricula(), getContrato(), getLogin(), getSenha());
    }
}