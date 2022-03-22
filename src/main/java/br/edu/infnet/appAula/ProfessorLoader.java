package br.edu.infnet.appAula;

import br.edu.infnet.appAula.model.domain.Professor;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ProfessorLoader implements ApplicationRunner {

    @Autowired
    private ProfessorService professorService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Usuario usuario = new Usuario();
        usuario.setId(2);

        Professor professor = new Professor();
        professor.setEmail("professor1@bodytech.com");
        professor.setNome("Professor 1");
        professor.setCpf("111.111.111-11");
        professor.setUsuario(usuario);

        professorService.incluir(professor);
    }
}
