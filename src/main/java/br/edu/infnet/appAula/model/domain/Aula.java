package br.edu.infnet.appAula.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Aula {
	private Integer id;
	private LocalDateTime data;
	//
	//
	private Professor professor;
	private Aluno aluno;
	private List<Atividade> atividades;
	
	public Aula() {
		data = LocalDateTime.now();
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

}
