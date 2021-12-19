package br.edu.infnet.appAula;

import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class UsuarioLoader implements ApplicationRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Usuario admin = new Usuario();
        admin.setEmail("administrador@mygym.com");
        admin.setNome("admin");
        admin.setSenha("1234");
        admin.setAdmin(true);

        usuarioService.incluir(admin);

        Usuario user1 = new Usuario();
        user1.setEmail("usuario1@mygym.com");
        user1.setNome("user1");
        user1.setSenha("1234");
        user1.setAdmin(false);

        usuarioService.incluir(user1);

    }
}
