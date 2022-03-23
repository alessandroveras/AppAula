package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.clients.IUsuarioClient;
import br.edu.infnet.appAula.model.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

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
        return usuarioClient.obterPorId(id);
    }

    public long obterQtde() {
        return usuarioClient.obterQtde();
    }

    public Usuario validar(String email, String senha) {
        return usuarioClient.validar(email, senha);
    }

}
