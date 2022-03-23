package br.edu.infnet.appAula;

import br.edu.infnet.appAula.model.domain.Endereco;
import br.edu.infnet.appAula.model.domain.Professor;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.service.EnderecoService;
import br.edu.infnet.appAula.model.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ProfessorLoader implements ApplicationRunner {

    @Autowired
    private ProfessorService professorService;

    @Autowired
    private EnderecoService enderecoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Long qtdeProfessores = professorService.obterQtde();

        if (qtdeProfessores == 0) {
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

            professorService.incluir(professor);
        }
    }
}
