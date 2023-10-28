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

De acordo com as estratégias acima, o código da classe Usuario em Java abaixo será:
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_usuario")
public class Usuario implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*------------------------------------------------------------------*/

    private String nomeUsuario;
    private String senha;
    private String email;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime dataHoraUltimoAcesso;
    private LocalDateTime dataHoraUltimaAlteracao;
    private LocalDateTime dataHoraExclusao;
    private String situacao;

    /*------------------------------------------------------------------*/
    // A classe associativa UsuarioRole é criada para representar o relacionamento N:N entre Usuario e Role

    @ManyToMany
    @JoinTable(name = "tb_usuario_role",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

    // Setters

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public void setDataHoraUltimoAcesso(LocalDateTime dataHoraUltimoAcesso) {
        this.dataHoraUltimoAcesso = dataHoraUltimoAcesso;
    }

    public void setDataHoraUltimaAlteracao(LocalDateTime dataHoraUltimaAlteracao) {
        this.dataHoraUltimaAlteracao = dataHoraUltimaAlteracao;
    }

    public void setDataHoraExclusao(LocalDateTime dataHoraExclusao) {
        this.dataHoraExclusao = dataHoraExclusao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }


    // Equals e HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getId(), usuario.getId()) &&
                Objects.equals(getNomeUsuario(), usuario.getNomeUsuario()) &&
                Objects.equals(getSenha(), usuario.getSenha()) &&
                Objects.equals(getEmail(), usuario.getEmail()) &&
                Objects.equals(getDataHoraCriacao(), usuario.getDataHoraCriacao()) &&
                Objects.equals(getDataHoraUltimoAcesso(), usuario.getDataHoraUltimoAcesso()) &&
                Objects.equals(getDataHoraUltimaAlteracao(), usuario.getDataHoraUltimaAlteracao()) &&
                Objects.equals(getDataHoraExclusao(), usuario.getDataHoraExclusao()) &&
                Objects.equals(getSituacao(), usuario.getSituacao()) &&
                Objects.equals(getRoles(), usuario.getRoles());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),
                getId(),
                getNomeUsuario(),
                getSenha(),
                getEmail(),
                getDataHoraCriacao(),
                getDataHoraUltimoAcesso(),
                getDataHoraUltimaAlteracao(),
                getDataHoraExclusao(),
                getSituacao(),
                getRoles());
    }
}