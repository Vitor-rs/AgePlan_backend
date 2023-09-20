//package br.com.app.ageplan.entity;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//
//
//import java.io.Serial;
//import java.io.Serializable;
//import java.util.Objects;
//
///** Como a classe Cliente herda de Pessoa, não é necessário declarar os atributos da classe Pessoa.
//    A classe Pessoa também possui "id", portanto, a classe Pessoa será uma "superclasse" de Cliente, ou abstract class.
//    As anotações necessárias para Cliente em relação a Pessoa são:
//    @Entity
//    @Inheritance(strategy = InheritanceType.JOINED)
//    @DiscriminatorColumn(name = "tipo_pessoa", discriminatorType = DiscriminatorType.STRING)
//    @DiscriminatorValue("C")
// *
// * */
//
//
//@Getter
//@Entity
////@Inheritance(strategy = InheritanceType.JOINED)
////@DiscriminatorColumn(name = "tipo_pessoa", discriminatorType = DiscriminatorType.STRING)
////@DiscriminatorValue("C")
//public class Cliente extends Pessoa implements Serializable {
//    @Serial
//    private static final long serialVersionUID = 1L;
//
//
//    // Getters
//    private String matricula;
//    private String contrato;
//    private String login;
//    private String senha;
//
//    public Cliente() {}
//
//    public Cliente(String matricula, String contrato, String login, String senha) {
//        this.matricula = matricula;
//        this.contrato = contrato;
//        this.login = login;
//        this.senha = senha;
//    }
//
//    // Construtor com os atributos da classe Pessoa
//    //
//    public Cliente(
//            Long id,
//            String nomeCompleto,
//            String dataNascimento,
//            String genero,
//            Boolean estrangeiro,
//            String CPF,
//            String RG,
//            String outrosDocumentos,
//            String email,
//            String telefoneCelular,
//            String telefoneFixo,
//            Endereco endereco,
//            Escolaridade escolaridade,
//            OrgaoInstituicaoEmpresa orgaoInstituicaoEmpresa,
//            String matricula,
//            String contrato,
//            String login,
//            String senha
//    ) {
//        super(
//                id,
//                nomeCompleto,
//                dataNascimento,
//                genero,
//                estrangeiro,
//                CPF,
//                RG,
//                outrosDocumentos,
//                email,
//                telefoneCelular,
//                telefoneFixo,
//                endereco,
//                escolaridade,
//                orgaoInstituicaoEmpresa
//        );
//        this.matricula = matricula;
//        this.contrato = contrato;
//        this.login = login;
//        this.senha = senha;
//    }
//
//    // Setters
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
//    // Equals e HashCode
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Cliente cliente)) return false;
//        if (!super.equals(o)) return false;
//        return Objects.equals(getMatricula(), cliente.getMatricula()) && Objects.equals(getContrato(), cliente.getContrato()) && Objects.equals(getLogin(), cliente.getLogin()) && Objects.equals(getSenha(), cliente.getSenha());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), getMatricula(), getContrato(), getLogin(), getSenha());
//    }
//}