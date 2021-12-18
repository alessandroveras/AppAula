package br.edu.infnet.appAula.model.tests;

import br.edu.infnet.appAula.model.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor professor = new Professor("Maria Personal", "maria.personal@bodytech.com.br", "10177249706");
        professor.setId(1);

        System.out.println(professor);

    }
}
