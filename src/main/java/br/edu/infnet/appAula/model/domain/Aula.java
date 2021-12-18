package br.edu.infnet.appAula.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Aula {
    private Integer id;
    private LocalDateTime data;
    private Integer duracao;

    private Professor professor;
    private Aluno aluno;
    private List<Atividade> atividades;

    public Aula() {
        this.data = LocalDateTime.now();
        this.duracao = 1;
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

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
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

    @Override
    public String toString() {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String mensagem = String.format("%d;%s;%d;%s;%s;%d",
                this.id,
                this.data.format(formato),
                this.duracao,
                this.professor,
                this.aluno,
                this.atividades.size()
                );

        return mensagem;

    }
}
