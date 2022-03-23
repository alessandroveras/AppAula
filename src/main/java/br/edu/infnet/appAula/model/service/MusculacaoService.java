package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.clients.IMusculacaoClient;
import br.edu.infnet.appAula.model.domain.Musculacao;
import br.edu.infnet.appAula.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusculacaoService {

    @Autowired
    private IMusculacaoClient musculacaoClient;

    public List<Musculacao> obterLista() {
        return (List<Musculacao>) musculacaoClient.obterLista();
    }

    public List<Musculacao> obterLista(Usuario usuario) {
        return (List<Musculacao>) musculacaoClient.obterLista(usuario.getId());
    }

    public void incluir(Musculacao musculacao) {
        musculacaoClient.incluir(musculacao);
    }

    public Musculacao obterPorId(Integer id) {
        return musculacaoClient.obterPorId(id);
    }

    public long obterQtde() {
        return musculacaoClient.obterQtde();
    }
}
