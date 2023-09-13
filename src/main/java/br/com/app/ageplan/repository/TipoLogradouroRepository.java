package br.com.app.ageplan.repository;

import br.com.app.ageplan.entity.TipoLogradouro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoLogradouroRepository extends JpaRepository<TipoLogradouro, Long> {
}