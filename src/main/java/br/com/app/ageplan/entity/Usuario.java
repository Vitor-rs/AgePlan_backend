package br.com.app.ageplan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Usuario implements Serializable {
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

//    @ManyToMany
//    @JoinTable(name = "tb_usuario_role",
//            joinColumns = @JoinColumn(name = "usuario_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))
//    private List<Role> roles;

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

    /*public void setRoles(List<Role> roles) {
        this.roles = roles;
    }*/


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
                Objects.equals(getSituacao(), usuario.getSituacao());
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
                getSituacao());
    }
}