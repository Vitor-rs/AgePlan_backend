package br.com.app.ageplan.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    /*----------------------------------------------------------*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*----------------------------------------------------------*/
    // Dados Pessoais

    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private Boolean estrangeiro;
    /*----------------------------------------------------------*/
    // Documentos
    private String CPF;
    private String RG;
    private String outrosDocumentos;
    /*----------------------------------------------------------*/
    // Comunicação
    private String email;
    private String telefonecelular;
    private String telefoneFixo;
    /*----------------------------------------------------------*/
    // Endereço
    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    /*----------------------------------------------------------*/
    // Dados Acadêmicos e Profissionais
    private Escolaridade escolaridade;
    private NivelSerieEscolaridade nivelSerieEscolaridade;
    private ProfissaoCargoFuncao profissaoCargoFuncao;
    private OrgaoInstituicaoEmpresa orgaoInstituicaoEmpresa;

    /*----------------------------------------------------------*/
    // Construtor sem argumentos ou vazio
    public Pessoa() {
    }
    /*----------------------------------------------------------*/
    // Construtor com argumentos


    public Pessoa(
            Long id,
            String nomeCompleto, String dataNascimento, String genero, Boolean estrangeiro,
            String CPF, String RG, String outrosDocumentos,
            String email, String telefonecelular, String telefoneFixo,
            Endereco endereco,
            Escolaridade escolaridade,
            NivelSerieEscolaridade nivelSerieEscolaridade,
            ProfissaoCargoFuncao profissaoCargoFuncao,
            OrgaoInstituicaoEmpresa orgaoInstituicaoEmpresa) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.estrangeiro = estrangeiro;
        this.CPF = CPF;
        this.RG = RG;
        this.outrosDocumentos = outrosDocumentos;
        this.email = email;
        this.telefonecelular = telefonecelular;
        this.telefoneFixo = telefoneFixo;
        this.endereco = endereco;
        this.escolaridade = escolaridade;
        this.nivelSerieEscolaridade = nivelSerieEscolaridade;
        this.profissaoCargoFuncao = profissaoCargoFuncao;
        this.orgaoInstituicaoEmpresa = orgaoInstituicaoEmpresa;
    }

    /*----------------------------------------------------------*/
    // Getters e Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getEstrangeiro() {
        return estrangeiro;
    }

    public void setEstrangeiro(Boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
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

    public String getOutrosDocumentos() {
        return outrosDocumentos;
    }

    public void setOutrosDocumentos(String outrosDocumentos) {
        this.outrosDocumentos = outrosDocumentos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonecelular() {
        return telefonecelular;
    }

    public void setTelefonecelular(String telefonecelular) {
        this.telefonecelular = telefonecelular;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public NivelSerieEscolaridade getNivelSerieEscolaridade() {
        return nivelSerieEscolaridade;
    }

    public void setNivelSerieEscolaridade(NivelSerieEscolaridade nivelSerieEscolaridade) {
        this.nivelSerieEscolaridade = nivelSerieEscolaridade;
    }

    public ProfissaoCargoFuncao getProfissaoCargoFuncao() {
        return profissaoCargoFuncao;
    }

    public void setProfissaoCargoFuncao(ProfissaoCargoFuncao profissaoCargoFuncao) {
        this.profissaoCargoFuncao = profissaoCargoFuncao;
    }

    public OrgaoInstituicaoEmpresa getOrgaoInstituicaoEmpresa() {
        return orgaoInstituicaoEmpresa;
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
                Objects.equals(getTelefonecelular(), pessoa.getTelefonecelular()) &&
                Objects.equals(getTelefoneFixo(), pessoa.getTelefoneFixo()) &&
                Objects.equals(getEndereco(), pessoa.getEndereco()) &&
                Objects.equals(getEscolaridade(), pessoa.getEscolaridade()) &&
                Objects.equals(getNivelSerieEscolaridade(), pessoa.getNivelSerieEscolaridade()) &&
                Objects.equals(getProfissaoCargoFuncao(), pessoa.getProfissaoCargoFuncao()) &&
                Objects.equals(getOrgaoInstituicaoEmpresa(), pessoa.getOrgaoInstituicaoEmpresa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getNomeCompleto(),
                getDataNascimento(),
                getGenero(),
                getEstrangeiro(),
                getCPF(), getRG(),
                getOutrosDocumentos(),
                getEmail(),
                getTelefonecelular(),
                getTelefoneFixo(),
                getEndereco(),
                getEscolaridade(),
                getNivelSerieEscolaridade(),
                getProfissaoCargoFuncao(),
                getOrgaoInstituicaoEmpresa());
    }

}