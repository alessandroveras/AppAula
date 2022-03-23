package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.clients.IAulaClient;
import br.edu.infnet.appAula.model.domain.Aula;
import br.edu.infnet.appAula.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AulaService {

    @Autowired
    private IAulaClient aulaClient;

    public List<Aula> obterLista() {
        return (List<Aula>) aulaClient.obterLista();
    }

    public List<Aula> obterLista(Usuario usuario) {
        return (List<Aula>) aulaClient.obterLista(usuario.getId());
    }

    public void incluir(Aula aula) {
        aulaClient.incluir(aula);
    }

    public void excluir(Integer id) {
        aulaClient.excluir(id);
    }

    public Aula obterPorId(Integer id) {
        return aulaClient.obterPorId(id);
    }

    public long obterQtde() {
        return aulaClient.obterQtde();
    }
}
