package br.com.app.ageplan.dto;


import br.com.app.ageplan.entity.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * DTO para {@link Pessoa}
 */

public class PessoaDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    Long id;
    String nomeCompleto;
    String dataNascimento;
    String genero;
    Boolean estrangeiro;
    String CPF;
    String RG;
    String outrosDocumentos;
    String email;
    String telefonecelular;
    String telefoneFixo;
    Endereco endereco;
    Escolaridade escolaridade;
    NivelSerieEscolaridade nivelSerieEscolaridade;
    ProfissaoCargoFuncao profissaoCargoFuncao;
    OrgaoInstituicaoEmpresa orgaoInstituicaoEmpresa;

    /*----------------------------------------------------------*/
    // Construtor sem argumentos
    public PessoaDto() {
    }
    /*----------------------------------------------------------*/
    // Construtor com argumentos

    public PessoaDto(Long id,
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
    // Construtor usando o objeto Pessoa

    public PessoaDto(Pessoa entity) {
        id = entity.getId();
        nomeCompleto = entity.getNomeCompleto();
        dataNascimento = entity.getDataNascimento();
        genero = entity.getGenero();
        estrangeiro = entity.getEstrangeiro();
        CPF = entity.getCPF();
        RG = entity.getRG();
        outrosDocumentos = entity.getOutrosDocumentos();
        email = entity.getEmail();
        telefonecelular = entity.getTelefonecelular();
        telefoneFixo = entity.getTelefoneFixo();
        endereco = entity.getEndereco();
        escolaridade = entity.getEscolaridade();
        nivelSerieEscolaridade = entity.getNivelSerieEscolaridade();
        profissaoCargoFuncao = entity.getProfissaoCargoFuncao();
        orgaoInstituicaoEmpresa = entity.getOrgaoInstituicaoEmpresa();
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

}