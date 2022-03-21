package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.model.domain.Atividade;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtividadeService {

    @Autowired
    private AtividadeRepository atividadeRepository;


    public List<Atividade> obterLista(Usuario usuario) {

        return (List<Atividade>) atividadeRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "descricao"));
    }

    public void excluir(Integer id) {

        atividadeRepository.deleteById(id);
    }

    public Atividade obterPorId(Integer id) {

        return atividadeRepository.findById(id).orElse(null);
    }


}
