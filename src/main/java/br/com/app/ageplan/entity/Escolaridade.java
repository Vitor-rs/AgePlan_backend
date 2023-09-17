package br.com.app.ageplan.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Getter
@Entity
@Table(name = "tb_escolaridade")
public class Escolaridade implements Serializable {
    @Serial
    private final static long serialVersionUID = 1L;
    /*--------------------------------------------------------*/
    // Getters
    /*--------------------------------------------------------*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*--------------------------------------------------------*/
    private String nomeDescricao;

    /** Por enquanto, a classe Escolaridade terá de ter relacionamento ManyToMany. Para fazer isso
     * é necessário criar uma tabela de relacionamento entre Escolaridade e NivelSerieEscolaridade.
     * Essa tabela/classe de relacionamento terá de ter os atributos id, escolaridade_id e nivel_serie_escolaridade_id.
     * Um nome para essa tabela/classe de relacionamento poderia ser EscolaridadeNivelSerieEscolaridade.
     * Para mapear esse relacionamento, é necessário usar a anotação @ManyToMany e a anotação @JoinTable.
     * A anotação @JoinTable é usada para mapear a tabela/classe de relacionamento. Já que a classe EscolaridadeNivelSerieEscolaridade
     * para representar a tabela de relacionamento entre Escolaridade e NivelSerieEscolaridade e o nome dessa table será
     * "tb_escolaridade_nivel_serie_escolaridade", então a anotação @JoinTable ficará assim:
     * "@JoinTable(name = "tb_escolaridade_nivel_serie_escolaridade")".
     * A anotação @JoinTable tem um atributo chamado joinColumns que é usado para mapear a coluna que representa a chave estrangeira
     * da classe que está sendo mapeada. No caso, a classe Escolaridade. Como a classe Escolaridade tem um atributo chamado id,
     * então o atributo joinColumns ficará assim: joinColumns = @JoinColumn(name = "escolaridade_id").
     * A anotação @JoinTable tem outro atributo chamado inverseJoinColumns que é usado para mapear a coluna que representa a chave
     * estrangeira da outra classe que está sendo mapeada. No caso, a classe NivelSerieEscolaridade. Como a classe NivelSerieEscolaridade
     * tem um atributo chamado id, então o atributo inverseJoinColumns ficará assim: inverseJoinColumns = @JoinColumn(name = "nivel_serie_escolaridade_id").
     * O atributo joinColumns é usado para mapear a coluna que representa a chave estrangeira da classe que está sendo mapeada.
     * O atributo inverseJoinColumns é usado para mapear a coluna que representa a chave estrangeira da outra classe que está sendo mapeada.
    */


    @ManyToMany
    @JoinTable(name = "tb_escolaridade_nivel_serie_escolaridade",
            joinColumns = @JoinColumn(name = "escolaridade_id"),
            inverseJoinColumns = @JoinColumn(name = "nivel_serie_escolaridade_id")
    )
    private List<NivelSerieEscolaridade> nivelSerieEscolaridade;

    /** Há um aviso de erro nesse atributo que diz: ""ManyToMany" atribute type should be a container."
     * Isso acontece porque o atributo nivelSerieEscolaridade é do tipo NivelSerieEscolaridade e não do tipo List<NivelSerieEscolaridade>.
     *
     */


    /*--------------------------------------------------------*/
    // Construtor vazio
    public Escolaridade() {
    }

    // Construtor com parâmetros
    public Escolaridade(Long id, String nomeDescricao) {
        this.id = id;
        this.nomeDescricao = nomeDescricao;
    }

    /*--------------------------------------------------------*/
    // Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setNomeDescricao(String nomeDescricao) {
        this.nomeDescricao = nomeDescricao;
    }
    public void setNivelSerieEscolaridade(List<NivelSerieEscolaridade> nivelSerieEscolaridade) {
        this.nivelSerieEscolaridade = nivelSerieEscolaridade;
    }

    /*--------------------------------------------------------*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Escolaridade that)) return false;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getNomeDescricao(), that.getNomeDescricao()) &&
                Objects.equals(getNivelSerieEscolaridade(), that.getNivelSerieEscolaridade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNomeDescricao(), getNivelSerieEscolaridade());
    }
}