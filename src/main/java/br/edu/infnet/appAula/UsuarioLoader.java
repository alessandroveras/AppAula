package br.edu.infnet.appAula;

import br.edu.infnet.appAula.model.domain.Endereco;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.service.EnderecoService;
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

    @Autowired
    private EnderecoService enderecoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Usuario admin = new Usuario();
        admin.setEmail("admin@mygym.com");
        admin.setNome("admin");
        admin.setSenha("1234");
        admin.setAdmin(true);
        usuarioService.incluir(admin);

        Endereco endereco = new Endereco();
        endereco = enderecoService.obterPorCep("21630130");
        endereco.setComplemento("Casa");

        Usuario user1 = new Usuario();
        user1.setEmail("user1@mygym.com");
        user1.setNome("user1");
        user1.setSenha("1234");
        user1.setAdmin(false);
        user1.setEndereco(endereco);

        usuarioService.incluir(user1);

    }
}
