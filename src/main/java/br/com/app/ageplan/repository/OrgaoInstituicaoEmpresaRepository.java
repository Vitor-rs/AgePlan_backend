package br.com.app.ageplan.repository;

import br.com.app.ageplan.entity.OrgaoInstituicaoEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgaoInstituicaoEmpresaRepository extends JpaRepository<OrgaoInstituicaoEmpresa, Long> {
}