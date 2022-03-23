package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.clients.IProfessorClient;
import br.edu.infnet.appAula.model.domain.Professor;
import br.edu.infnet.appAula.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private IProfessorClient professorClient;

    public List<Professor> obterLista() {
        return (List<Professor>) professorClient.obterLista();
    }

    public List<Professor> obterLista(Usuario usuario) {
        return (List<Professor>) professorClient.obterLista(usuario.getId());
    }

    public void incluir(Professor professor) {
        professorClient.incluir(professor);
    }

    public void excluir(Integer id) {
        professorClient.excluir(id);
    }

    public Professor obterPorId(Integer id) {
        return professorClient.obterPorId(id);
    }

    public long obterQtde() {
        return professorClient.obterQtde();
    }


}
