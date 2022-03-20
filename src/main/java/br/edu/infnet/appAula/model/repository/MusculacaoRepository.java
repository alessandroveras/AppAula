package br.edu.infnet.appAula.model.repository;

import br.edu.infnet.appAula.model.domain.Musculacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusculacaoRepository extends CrudRepository<Musculacao, Integer> {
}
