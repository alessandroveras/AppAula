package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario validar(String email, String senha) {

        return usuarioRepository.autenticacao(email, senha);
    }

    public List<Usuario> obterLista() {

        return (List<Usuario>) usuarioRepository.findAll(Sort.by(Sort.Direction.ASC, "email"));
    }

    public void incluir(Usuario usuario) {

        usuarioRepository.save(usuario);
    }

    public void excluir(Integer id) {

        usuarioRepository.deleteById(id);

    }

    public Usuario obterPorId(Integer id) {

        return usuarioRepository.findById(id).orElse(null);
    }

}
