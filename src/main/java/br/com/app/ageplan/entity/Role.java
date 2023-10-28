package br.com.app.ageplan.entity;

/*
    Documentação de classes relacionadas a Usuario em PlantUml e estratégias de relacionamento:


entity Usuario {
    - id: Long
    - nomeUsuario: String
    - senha: String
    - email: String
    - dataHoraCriacao: LocalDateTime
    - dataHoraUltimoAcesso: LocalDateTime
    - dataHoraUltimaAlteracao: LocalDateTime
    - dataHoraExclusao: LocalDateTime
    - situacao: String
}

abstract class Pessoa {
    - id: Long
    - nomeCompleto: String
    - dataNascimento: Date
    - genero: String
    - estrangeiro: Boolean
    - CPF: String
    - RG: String
    - outrosDocumentos: String
    - telefoneCelular: String
    - telefoneFixo: String
    - endereco: Endereco
    - escolaridade: Escolaridade
    - orgaoInstituicaoEmpresa: OrgaoInstituicaoEmpresa
}

Usuario <|- Pessoa

class Role {
    - id: Long
    - nome: String
}

'Classe associativa para relacionamento N:N entre Usuario e Role
class UsuarioRole {
    - id: Long
    - usuario: Usuario
    - role: Role
}

Usuario "1" -- "*" UsuarioRole
Role "1" -- "*" UsuarioRole

De acordo com as estratégias acima, o código da classe Role em Java abaixo será:
*/


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;


@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_role")
public class Role implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*---------------------------------------------------------------------*/

    private String nome;

    /*------------------------------------------------------------------*/
    // A classe associativa UsuarioRole é criada para representar o relacionamento N:N entre Role e Usuario

    @ManyToMany
    @JoinTable(name = "tb_usuario_role",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id"))
    private List<Usuario> usuarios;


    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    // Equals e HashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role role)) return false;
        return Objects.equals(getId(), role.getId()) &&
                Objects.equals(getNome(), role.getNome()) &&
                Objects.equals(getUsuarios(), role.getUsuarios());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getUsuarios());
    }
}