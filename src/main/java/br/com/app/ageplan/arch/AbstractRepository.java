package br.com.app.ageplan.arch;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AbstractRepository extends JpaRepository<Object, Long> {

    /**
     * As entidades do projetos, cada uma, possui uma classe Repository, Por exemplo, a entidade Pessoa possui a classe
     * PessoaRepository, no entando, há repetição de código, pois todos os repositórios possuem os mesmos métodos.
     * Para isso criei uma interface chamada AbstractRepository, que possui os métodos genéricos que serão utilizados
     * por todas as entidades, sendo eles: save, update, delete, findById e findAll. Para começar, criei uma interface
     * chamada AbstractRepository, que possui os métodos genéricos que serão utilizados por todas as entidades, sendo
     * eles: save, update, delete, findById e findAll. Esta classe genericamente será implementada por todas as classes
     * Repository.
     */

    /**
     * A classe JpaRepository possui os métodos básicos para manipulação de dados no banco de dados, como por exemplo:
     * save, update, delete, findById e findAll. Esta classe genericamente será implementada por todas as classes
     * Repository. A AbstractRepository extende JpaRepository, e recebe dois parâmetros, o primeiro é o tipo de objeto
     * que será manipulado, e o segundo é o tipo do ID do objeto. Por exemplo, a entidade Pessoa possui a classe
     * PessoaRepository, que extende AbstractRepository, e recebe dois parâmetros, o primeiro é o tipo de objeto que
     * será manipulado, e o segundo é o tipo do ID do objeto.
     */

    // Vejamos a criação do método findAll:
    @Override
    @NotNull
    public List<Object> findAll();
    // Há um aviso que diz "Not annotated method overrides method annotated with @NonNullApi ", isso significa que
    // o método findAll da classe JpaRepository está anotado com @NonNullApi, e o método findAll da classe
    // AbstractRepository não está anotado com @NonNullApi, então, para resolver isso, basta anotar o método
    // findAll da classe AbstractRepository com @NonNullApi, assim:

}