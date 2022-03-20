package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.model.domain.Musculacao;
import br.edu.infnet.appAula.model.domain.Musculacao;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.repository.MusculacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusculacaoService {

    @Autowired
    private MusculacaoRepository musculacaoRepository;

    public List<Musculacao> obterLista() {

        return (List<Musculacao>) musculacaoRepository.findAll();
    }

//    public List<Musculacao> obterLista(Usuario usuario) {
//
//        return (List<Musculacao>) musculacaoRepository.findAll(usuario.getId());
//    }

    public void incluir(Musculacao musculacao) {

        musculacaoRepository.save(musculacao);

    }

    public void excluir(Integer id) {

        musculacaoRepository.deleteById(id);

    }

    public Musculacao obterPorId(Integer id) {

        return musculacaoRepository.findById(id).orElse(null);
    }


}
