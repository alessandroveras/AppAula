package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.model.domain.Aerobico;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.repository.AerobicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AerobicoService {

    @Autowired
    private AerobicoRepository aerobicoRepository;

    public List<Aerobico> obterLista() {

        return (List<Aerobico>) aerobicoRepository.findAll(Sort.by(Sort.Direction.ASC, "descricao"));
    }

    public List<Aerobico> obterLista(Usuario usuario) {

        return (List<Aerobico>) aerobicoRepository.findAll(usuario.getId(),Sort.by(Sort.Direction.ASC, "descricao"));
    }

    public void incluir(Aerobico aerobico) {

        aerobicoRepository.save(aerobico);

    }

    public void excluir(Integer id) {

        aerobicoRepository.deleteById(id);

    }

    public Aerobico obterPorId(Integer id) {

        return aerobicoRepository.findById(id).orElse(null);
    }


}
