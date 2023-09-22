package br.com.app.ageplan.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link br.com.app.ageplan.entity.Professor}
 */

public class ProfessorDto implements Serializable {
    Long id;
    String especialidade;
}

/* Uma classe Record é uma classe que representa um registro de dados. Mas como assim?
*  Uma classe Record é uma classe que representa um registro de dados, ou seja, uma classe que representa um objeto imutável.
* Um objeto imutável é um objeto que não pode ser alterado após ser criado.
*
* Não é a mesma coisa que um DTO?
*   - Não. Um DTO é um objeto que representa um objeto de negócio, ou seja, um objeto que representa um objeto de negócio.
*   - Já uma classe Record é uma classe que representa um registro de dados, ou seja, uma classe que representa um objeto imutável.
*
* Posso usar um Record como um DTO?
* - Sim. Um Record pode ser usado como um DTO.

  Um Record tem construtor, getters, equals, hashCode e toString também? Ou só alguns deles?
  * Um Record tem construtor, getters, equals, hashCode e toString.
  *
*
*
* */