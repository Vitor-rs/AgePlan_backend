package br.com.app.ageplan.repository;

import br.com.app.ageplan.entity.Escolaridade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaridadeRepository extends JpaRepository<Escolaridade, Long> {
}