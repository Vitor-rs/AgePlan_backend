package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * DTO para {@link Pessoa}
 */

@Getter
@AllArgsConstructor
@NoArgsConstructor
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
    private ProfissaoCargoFuncao profissaoCargoFuncao;

    /*----------------------------------------------------------*/
    // Construtor usando o objeto Pessoa
    public PessoaDto(Pessoa entity) {
        this.id = entity.getId();
        this.nomeCompleto = entity.getNomeCompleto();
        this.dataNascimento = entity.getDataNascimento();
        this.genero = entity.getGenero();
        this.estrangeiro = entity.getEstrangeiro();
        this.CPF = entity.getCPF();
        this.RG = entity.getRG();
        this.outrosDocumentos = entity.getOutrosDocumentos();
        this.email = entity.getEmail();
        this.telefoneCelular = entity.getTelefoneCelular();
        this.telefoneFixo = entity.getTelefoneFixo();
        this.endereco = entity.getEndereco();
        this.escolaridade = entity.getEscolaridade();
        this.orgaoInstituicaoEmpresa = entity.getOrgaoInstituicaoEmpresa();
        this.profissaoCargoFuncao = entity.getProfissaoCargoFuncao();
    }


}