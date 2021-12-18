package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.model.domain.Professor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProfessorService {

    private static Integer id = 1;
    private final Map<Integer, Professor> mapaProfessor = new HashMap<Integer, Professor>();

    public List<Professor> obterLista() {

        return new ArrayList<Professor>(mapaProfessor.values());
    }

    public void incluir(Professor professor) {

        professor.setId(id++);

        mapaProfessor.put(professor.getId(), professor);

    }

    public void excluir(Integer id) {

        mapaProfessor.remove(id);

    }

    public Professor obterPorId(Integer id) {

        return mapaProfessor.get(id);
    }


}
