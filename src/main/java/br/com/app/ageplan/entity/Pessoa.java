package br.com.app.ageplan.entity;

import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa extends Usuario {

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

    // Setters


    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstrangeiro(Boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setOutrosDocumentos(String outrosDocumentos) {
        this.outrosDocumentos = outrosDocumentos;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public void setProfissaoCargoFuncao(ProfissaoCargoFuncao profissaoCargoFuncao) {
        this.profissaoCargoFuncao = profissaoCargoFuncao;
    }

    public void setOrgaoInstituicaoEmpresa(OrgaoInstituicaoEmpresa orgaoInstituicaoEmpresa) {
        this.orgaoInstituicaoEmpresa = orgaoInstituicaoEmpresa;
    }

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