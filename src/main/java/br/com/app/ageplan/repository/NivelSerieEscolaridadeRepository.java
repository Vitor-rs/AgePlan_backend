package br.com.app.ageplan.repository;

import br.com.app.ageplan.entity.NivelSerieEscolaridade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelSerieEscolaridadeRepository extends JpaRepository<NivelSerieEscolaridade, Long> {
}