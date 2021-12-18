package br.edu.infnet.appAula.model.tests;

import br.edu.infnet.appAula.model.domain.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Joao Aluno", "joao@aluno.com", "11111111111", "Premium");
        aluno.setId(1);

        System.out.println(aluno);
    }
}
