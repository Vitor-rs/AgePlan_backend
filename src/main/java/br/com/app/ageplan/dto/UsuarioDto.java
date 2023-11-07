package br.com.app.ageplan.dto;

import br.com.app.ageplan.entity.Usuario;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO para {@link Usuario}
 */

public abstract class UsuarioDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    String nomeUsuario;
    String senha;
    String email;
    LocalDateTime dataHoraCriacao;
    LocalDateTime dataHoraUltimoAcesso;
    LocalDateTime dataHoraUltimaAlteracao;
    LocalDateTime dataHoraExclusao;
    String situacao;
    private Long id;
}