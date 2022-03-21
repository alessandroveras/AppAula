package br.edu.infnet.appAula.model.repository;

import br.edu.infnet.appAula.model.domain.Atividade;
import br.edu.infnet.appAula.model.domain.Musculacao;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtividadeRepository extends CrudRepository<Atividade, Integer> {

    @Query("from Atividade a where a.usuario.id = :userid ")
    List<Atividade> findAll(Integer userid, Sort by);
}
