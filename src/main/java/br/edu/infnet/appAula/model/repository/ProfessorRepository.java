package br.edu.infnet.appAula.model.repository;

import br.edu.infnet.appAula.model.domain.Professor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Integer> {

    @Query("from Professor professor where professor.usuario.id = :userid")
    public List<Professor> findAll(Integer userid);
}
