package br.edu.infnet.appAula;

import br.edu.infnet.appAula.model.domain.*;
import br.edu.infnet.appAula.model.service.AerobicoService;
import br.edu.infnet.appAula.model.service.AulaService;
import br.edu.infnet.appAula.model.service.EnderecoService;
import br.edu.infnet.appAula.model.service.MusculacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Order(3)
public class AulaLoader implements ApplicationRunner {

    @Autowired
    private AulaService aulaService;
    @Autowired
    private EnderecoService enderecoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Usuario usuario = new Usuario();
        usuario.setId(2);

        Endereco endereco = new Endereco();
        endereco = enderecoService.obterPorCep("22770102");
        endereco.setComplemento("AP");

        Professor professor = new Professor();
        professor.setEmail("professor1@bodytech.com");
        professor.setNome("Professor1");
        professor.setCpf("111.111.111-11");
        professor.setUsuario(usuario);
        professor.setEndereco(endereco);

        Aula aula = new Aula();
        aula.setDuracao(60);
        aula.setData(LocalDateTime.now());
        aula.setProfessor(professor);

//        aulaService.incluir(aula);
    }
}
