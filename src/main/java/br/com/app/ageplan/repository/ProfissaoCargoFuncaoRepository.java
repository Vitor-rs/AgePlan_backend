package br.com.app.ageplan.repository;

import br.com.app.ageplan.entity.ProfissaoCargoFuncao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfissaoCargoFuncaoRepository extends JpaRepository<ProfissaoCargoFuncao, Long> {
}