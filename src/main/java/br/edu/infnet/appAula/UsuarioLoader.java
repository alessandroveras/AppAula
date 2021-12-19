package br.edu.infnet.appAula;

import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.repository.UsuarioRepository;
import br.edu.infnet.appAula.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class UsuarioLoader implements ApplicationRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Usuario usuario = new Usuario();
        usuario.setEmail("alessandro.veras@gmail.com");
        usuario.setNome("Alessandro Veras");
        usuario.setSenha("1234");

        usuarioService.incluir(usuario);

    }
}
