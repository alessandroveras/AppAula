package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.model.domain.Aula;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AulaService {

    @Autowired
    private AulaRepository aulaRepository;

    public List<Aula> obterLista() {
        return (List<Aula>) aulaRepository.findAll(Sort.by(Sort.Direction.ASC, "duracao"));
    }

    public List<Aula> obterLista(Usuario usuario) {
        return (List<Aula>) aulaRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "data"));
    }

    public void incluir(Aula aula) {
        aulaRepository.save(aula);
    }

    public void excluir(Integer id) {
        aulaRepository.deleteById(id);
    }

    public Aula obterPorId(Integer id) {
        return aulaRepository.findById(id).orElse(null);
    }
    
    public long obterQtde() {
        return aulaRepository.count();
    }
}
