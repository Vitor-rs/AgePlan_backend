//package br.com.app.ageplan.entity;
//
///*
//    Documentação de classes relacionadas a Usuario em PlantUml e estratégias de relacionamento:
//
//
//    entity Usuario {
//    - id: Long
//    - nomeUsuario: String
//    - senha: String
//    - email: String
//    - dataHoraCriacao: LocalDateTime
//    - dataHoraUltimoAcesso: LocalDateTime
//    - dataHoraUltimaAlteracao: LocalDateTime
//    - dataHoraExclusao: LocalDateTime
//    - situacao: String
//}
//
//abstract class Pessoa {
//    - id: Long
//    - nomeCompleto: String
//    - dataNascimento: Date
//    - genero: String
//    - estrangeiro: Boolean
//    - CPF: String
//    - RG: String
//    - outrosDocumentos: String
//    - telefoneCelular: String
//    - telefoneFixo: String
//    - endereco: Endereco
//    - escolaridade: Escolaridade
//    - orgaoInstituicaoEmpresa: OrgaoInstituicaoEmpresa
//}
//
//Usuario <|- Pessoa
//
//class Role {
//    - id: Long
//    - nome: String
//}
//
//'Classe associativa para relacionamento N:N entre Usuario e Role
//class UsuarioRole {
//    - id: Long
//    - usuario: Usuario
//    - role: Role
//}
//
//Usuario "1" -- "*" UsuarioRole
//Role "1" -- "*" UsuarioRole
//
//De acordo com as estratégias acima, o código da classe UsuarioRole em Java abaixo será:
//*/
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import java.io.Serial;
//import java.io.Serializable;
//import java.util.Objects;
//
//@Entity
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "tb_usuario_role")
//public class UsuarioRole implements Serializable {
//    @Serial
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    /*---------------------------------------------------------------------*/
//
//    @ManyToOne
//    @JoinColumn(name = "usuario_id")
//    private Usuario usuario;
//
//    @ManyToOne
//    @JoinColumn(name = "role_id")
//    private Role role;
//
//    /*---------------------------------------------------------------------*/
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof UsuarioRole that)) return false;
//        return Objects.equals(getId(), that.getId()) && Objects.equals(getUsuario(), that.getUsuario()) && Objects.equals(getRole(), that.getRole());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId(), getUsuario(), getRole());
//    }
//}