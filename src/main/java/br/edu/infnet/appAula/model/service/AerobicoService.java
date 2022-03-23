package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.clients.IAerobicoClient;
import br.edu.infnet.appAula.model.domain.Aerobico;
import br.edu.infnet.appAula.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AerobicoService {

    @Autowired
    private IAerobicoClient aerobicoClient;

    public List<Aerobico> obterLista() {
        return (List<Aerobico>) aerobicoClient.obterLista();
    }

    public List<Aerobico> obterLista(Usuario usuario) {
        return (List<Aerobico>) aerobicoClient.obterLista(usuario.getId());
    }

    public void incluir(Aerobico aerobico) {
        aerobicoClient.incluir(aerobico);
    }

    public Aerobico obterPorId(Integer id) {
        return aerobicoClient.obterPorId(id);
    }

    public long obterQtde() {
        return aerobicoClient.obterQtde();
    }

}
