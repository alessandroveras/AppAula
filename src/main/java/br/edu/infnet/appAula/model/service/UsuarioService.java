package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.clients.IUsuarioClient;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private IUsuarioClient usuarioClient;

    public List<Usuario> obterLista() {
        return usuarioClient.obterLista();
    }

    public void incluir(Usuario usuario) {
        usuarioClient.incluir(usuario);
    }

    public void excluir(Integer id) {
        usuarioClient.excluir(id);

    }

    public Usuario obterPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public long obterQtde() {
        return usuarioRepository.count();
    }

    public Usuario validar(String email, String senha) {
        return usuarioRepository.autenticacao(email, senha);
    }

}
