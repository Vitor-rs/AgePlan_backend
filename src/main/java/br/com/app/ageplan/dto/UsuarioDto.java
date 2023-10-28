package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.Role;
import br.com.app.ageplan.entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO para {@link Usuario}
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto implements Serializable {
    private Long id;
    private String nomeUsuario;
    private String senha;
    private String email;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime dataHoraUltimoAcesso;
    private LocalDateTime dataHoraUltimaAlteracao;
    private LocalDateTime dataHoraExclusao;
    private String situacao;
    private List<Role> roles;

    // Construtor usando o objeto Usuario

    public UsuarioDto(Usuario usuario) {
        this.id = usuario.getId();
        this.nomeUsuario = usuario.getNomeUsuario();
        this.senha = usuario.getSenha();
        this.email = usuario.getEmail();
        this.dataHoraCriacao = usuario.getDataHoraCriacao();
        this.dataHoraUltimoAcesso = usuario.getDataHoraUltimoAcesso();
        this.dataHoraUltimaAlteracao = usuario.getDataHoraUltimaAlteracao();
        this.dataHoraExclusao = usuario.getDataHoraExclusao();
        this.situacao = usuario.getSituacao();
        this.roles = usuario.getRoles();
    }


    // Setters

    public void setId(Long id) {
        this.id = id;
    }

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


}