package br.com.app.ageplan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;


/**
 * A classe Pessoa é uma classe abstrata, pois não faz sentido instanciar um objeto Pessoa.
 * A classe Pessoa é uma superclasse de Aluno e Professor.
 * Ao declarar a classe Pessoa como abstrata, segundo a arquitetura de camadas MVC ORM do Spring,
 * a classe Pessoa não será mapeada para o banco de dados. Somente as classes Aluno e Professor serão mapeadas.
 * Das camadas Dto, Repository, Service e Resource (Controller), a entity abstrata Pessoa apenas terá um Dto.
 */


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /*----------------------------------------------------------*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Dados Pessoais
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private Boolean estrangeiro;

    // Documentos
    private String CPF;
    private String RG;
    private String outrosDocumentos;

    // Comunicação
    private String email;
    private String telefoneCelular;
    private String telefoneFixo;

    /*----------------------------------------------------------*/
    // Atributos de Relacionamento

    @ManyToOne
    @JoinColumn(name = "id_endereco_fk")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "id_escolaridade_fk")
    private Escolaridade escolaridade;

    //    private NivelSerieEscolaridade nivelSerieEscolaridade;
    @ManyToOne
    @JoinColumn(name = "id_profissao_cargo_funcao_fk")
    private ProfissaoCargoFuncao profissaoCargoFuncao;

    @ManyToOne
    @JoinColumn(name = "id_orgao_instituicao_empresa_fk")
    private OrgaoInstituicaoEmpresa orgaoInstituicaoEmpresa;


    /*----------------------------------------------------------*/
    // HashCode e Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return Objects.equals(getId(), pessoa.getId()) &&
                Objects.equals(getNomeCompleto(), pessoa.getNomeCompleto()) &&
                Objects.equals(getDataNascimento(), pessoa.getDataNascimento()) &&
                Objects.equals(getGenero(), pessoa.getGenero()) &&
                Objects.equals(getEstrangeiro(), pessoa.getEstrangeiro()) &&
                Objects.equals(getCPF(), pessoa.getCPF()) &&
                Objects.equals(getRG(), pessoa.getRG()) &&
                Objects.equals(getOutrosDocumentos(), pessoa.getOutrosDocumentos()) &&
                Objects.equals(getEmail(), pessoa.getEmail()) &&
                Objects.equals(getTelefoneCelular(), pessoa.getTelefoneCelular()) &&
                Objects.equals(getTelefoneFixo(), pessoa.getTelefoneFixo()) &&
                Objects.equals(getEndereco(), pessoa.getEndereco()) &&
                Objects.equals(getEscolaridade(), pessoa.getEscolaridade()) &&
                Objects.equals(getProfissaoCargoFuncao(), pessoa.getProfissaoCargoFuncao()) &&
                Objects.equals(getOrgaoInstituicaoEmpresa(), pessoa.getOrgaoInstituicaoEmpresa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getId(),
                getNomeCompleto(),
                getDataNascimento(),
                getGenero(),
                getEstrangeiro(),
                getCPF(),
                getRG(),
                getOutrosDocumentos(),
                getEmail(),
                getTelefoneCelular(),
                getTelefoneFixo(),
                getEndereco(),
                getEscolaridade(),
                getProfissaoCargoFuncao(),
                getOrgaoInstituicaoEmpresa()
        );
    }
}