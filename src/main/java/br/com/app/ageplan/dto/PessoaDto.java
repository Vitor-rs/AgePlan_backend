package br.com.app.ageplan.dto;


import br.com.app.ageplan.entity.Endereco;
import br.com.app.ageplan.entity.Escolaridade;
import br.com.app.ageplan.entity.OrgaoInstituicaoEmpresa;
import br.com.app.ageplan.entity.Pessoa;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

/**
 * DTO para {@link Pessoa}
 */

@Getter
public class PessoaDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private Boolean estrangeiro;
    private String CPF;
    private String RG;
    private String outrosDocumentos;
    private String email;
    private String telefoneCelular;
    private String telefoneFixo;

    /*----------------------------------------------------------*/
    // Atributos de Relacionamento

    private Endereco endereco;
    private Escolaridade escolaridade;
    private OrgaoInstituicaoEmpresa orgaoInstituicaoEmpresa;

    /*----------------------------------------------------------*/
    // Construtor sem argumentos
    public PessoaDto() {
    }
    /*----------------------------------------------------------*/
    // Construtor com argumentos

    public PessoaDto(Long id,
                     String nomeCompleto,
                     String dataNascimento,
                     String genero,
                     Boolean estrangeiro,
                     String CPF,
                     String RG,
                     String outrosDocumentos,
                     String email,
                     String telefoneCelular,
                     String telefoneFixo,
                     Endereco endereco,
                     Escolaridade escolaridade,
                     OrgaoInstituicaoEmpresa orgaoInstituicaoEmpresa
    ) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.estrangeiro = estrangeiro;
        this.CPF = CPF;
        this.RG = RG;
        this.outrosDocumentos = outrosDocumentos;
        this.email = email;
        this.telefoneCelular = telefoneCelular;
        this.telefoneFixo = telefoneFixo;
        this.endereco = endereco;
        this.escolaridade = escolaridade;
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
        telefoneCelular = entity.getTelefoneCelular();
        telefoneFixo = entity.getTelefoneFixo();
        endereco = entity.getEndereco();
        escolaridade = entity.getEscolaridade();
        orgaoInstituicaoEmpresa = entity.getOrgaoInstituicaoEmpresa();
    }

    /*----------------------------------------------------------*/
    // Setters
    public void setId(Long id) {
        this.id = id;
    }

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

    public void setOrgaoInstituicaoEmpresa(OrgaoInstituicaoEmpresa orgaoInstituicaoEmpresa) {
        this.orgaoInstituicaoEmpresa = orgaoInstituicaoEmpresa;
    }

}