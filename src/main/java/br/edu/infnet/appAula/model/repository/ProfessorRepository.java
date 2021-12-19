package br.edu.infnet.appAula.model.repository;

import br.edu.infnet.appAula.model.domain.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Integer> {
}
