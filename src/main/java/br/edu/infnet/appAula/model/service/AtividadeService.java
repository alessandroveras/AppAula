package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.clients.IAtividadeClient;
import br.edu.infnet.appAula.model.domain.Atividade;
import br.edu.infnet.appAula.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtividadeService {

    @Autowired
    private IAtividadeClient atividadeClient;

    public List<Atividade> obterLista() {
        return (List<Atividade>) atividadeClient.obterLista();
    }

    public List<Atividade> obterLista(Usuario usuario) {
        return (List<Atividade>) atividadeClient.obterLista(usuario.getId());
    }

    public void excluir(Integer id) {
        atividadeClient.excluir(id);
    }

    public Atividade obterPorId(Integer id) {
        return atividadeClient.obterPorId(id);
    }

    public long obterQtde() {
        return atividadeClient.obterQtde();
    }

}
