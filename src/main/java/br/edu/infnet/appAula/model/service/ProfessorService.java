package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.model.domain.Professor;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> obterLista() {

        return (List<Professor>) professorRepository.findAll();
    }

    public List<Professor> obterLista(Usuario usuario) {

        return (List<Professor>) professorRepository.findAll(usuario.getId());
    }

    public void incluir(Professor professor) {

        professorRepository.save(professor);

    }

    public void excluir(Integer id) {

        professorRepository.deleteById(id);

    }

    public Professor obterPorId(Integer id) {

        return professorRepository.findById(id).orElse(null);
    }


}
