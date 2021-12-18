package br.edu.infnet.appAula.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appAula.model.domain.Aerobico;
import br.edu.infnet.appAula.model.domain.Alongamento;
import br.edu.infnet.appAula.model.domain.Aluno;
import br.edu.infnet.appAula.model.domain.Atividade;
import br.edu.infnet.appAula.model.domain.Aula;
import br.edu.infnet.appAula.model.domain.Musculacao;
import br.edu.infnet.appAula.model.domain.Professor;

public class AulaTest {

	public static void main(String[] args) {
		
		Musculacao musculacao = new Musculacao();
		//TODO Preencher atributos de musculacao;
		
		Aerobico aerobico = new Aerobico();
		//TODO Preencher atributos de aerobico;
		
		Alongamento alongamento = new Alongamento();
		//TODO Preencher atributos de alongamento;
		
		List<Atividade> atividades = new ArrayList<Atividade>();
		atividades.add(musculacao);
		atividades.add(aerobico);
		atividades.add(alongamento);

		Professor professor = new Professor("Maria Personal", "maria.personal@bodytech.com.br", "10177249706");
		professor.setId(999);

		Aluno aluno = new Aluno("Joao Aluno", "joao@aluno.com", "11111111111", "Premium");
		aluno.setId(10);

		Aula aula = new Aula();
		aula.setId(1);
		aula.setDuracao(1);
		aula.setProfessor(professor);		
		aula.setAluno(aluno);
		aula.setAtividades(atividades);
		System.out.println(aula);
		
		

	}

}
