package br.edu.infnet.appAula;

import br.edu.infnet.appAula.model.domain.Professor;
import br.edu.infnet.appAula.model.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ProfessorLoader implements ApplicationRunner {

    @Autowired
    private ProfessorService professorService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Professor professor = new Professor();
        professor.setEmail("alessandro@bodytech.com");
        professor.setNome("Alessandro Personal");
        professor.setCpf("111.111.111-11");

        professorService.incluir(professor);

    }
}
