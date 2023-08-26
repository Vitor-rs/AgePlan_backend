package br.com.app.ageplan.dto;

import lombok.Getter;

@Getter
public class PessoaDto {

    /*----------------------------------------------------------------------------------*/
    private Long id;
    private String nome;
    private String dataNascimento;
    private String CPF;
    private String RG;
    private String telefoneCelular;
    private String telefoneFixo;
    private String email;
    private Boolean estrangeiro;
    private EnderecoDto endereco;
    private DadoAcademicoDto dadoAcademico;
/*----------------------------------------------------------------------------------*/
    /** Construtor padrão */
    public PessoaDto() {}
/*----------------------------------------------------------------------------------*/
    /** Construtor com parâmetros */
    public PessoaDto(Long id, String nome, String dataNascimento,
                   String CPF, String RG, String telefoneCelular,
                   String telefoneFixo, String email, Boolean estrangeiro,
                   EnderecoDto endereco, DadoAcademicoDto dadoAcademico)
    {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.RG = RG;
        this.telefoneCelular = telefoneCelular;
        this.telefoneFixo = telefoneFixo;
        this.email = email;
        this.estrangeiro = estrangeiro;
        this.endereco = endereco;
        this.dadoAcademico = dadoAcademico;
    }
/*----------------------------------------------------------------------------------*/
    /* Construtor usando a classe como parêmetro */
    public PessoaDto(PessoaDto pessoaDto) {
        this.id = pessoaDto.getId();
        this.nome = pessoaDto.getNome();
        this.dataNascimento = pessoaDto.getDataNascimento();
        this.CPF = pessoaDto.getCPF();
        this.RG = pessoaDto.getRG();
        this.telefoneCelular = pessoaDto.getTelefoneCelular();
        this.telefoneFixo = pessoaDto.getTelefoneFixo();
        this.email = pessoaDto.getEmail();
        this.estrangeiro = pessoaDto.getEstrangeiro();
        this.endereco = pessoaDto.getEndereco();
        this.dadoAcademico = pessoaDto.getDadoAcademico();
    }

}