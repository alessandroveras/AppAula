package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario validar(String email, String senha) {

        return usuarioRepository.autenticacao(email, senha);
    }
}
