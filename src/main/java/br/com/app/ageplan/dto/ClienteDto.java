//package br.com.app.ageplan.dto;
//
//import br.com.app.ageplan.entity.Aluno;
//import lombok.Getter;
//
//import java.io.Serial;
//import java.io.Serializable;
//
///**
// * DTO para {@link br.com.app.ageplan.entity.Aluno}
// */
//
//
//@Getter
//public class ClienteDto extends PessoaDto implements Serializable {
//    @Serial
//    private static final long serialVersionUID = 1L;
//
//    /*----------------------------------------------------------*/
//    // Getters
//    private Long id;
//    private String matricula;
//    private String contrato;
//    private String login;
//    private String senha;
//
//    /*----------------------------------------------------------*/
//    // Construtor sem argumentos
//    public ClienteDto() {}
//
//    // Construtor com argumentos
//    public ClienteDto(
//            Long id,
//            String matricula,
//            String contrato,
//            String login,
//            String senha
//    ) {
//        this.id = id;
//        this.matricula = matricula;
//        this.contrato = contrato;
//        this.login = login;
//        this.senha = senha;
//    }
//
//    // Construtor usando a entidade Aluno
//    public ClienteDto(Aluno cliente) {
//        this.id = cliente.getId();
//        this.matricula = cliente.getMatricula();
//        this.contrato = cliente.getContrato();
//        this.login = cliente.getLogin();
//        this.senha = cliente.getSenha();
//    }
//
//    /*----------------------------------------------------------*/
//    // Setters
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setMatricula(String matricula) {
//        this.matricula = matricula;
//    }
//
//    public void setContrato(String contrato) {
//        this.contrato = contrato;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }
//
//}