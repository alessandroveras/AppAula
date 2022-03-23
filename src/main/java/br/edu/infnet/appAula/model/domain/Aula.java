package br.edu.infnet.appAula.model.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Aula {

    private Integer id;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime data;

    private Integer duracao;

    private Professor professor;

    private List<Atividade> atividades;

    private Usuario usuario;

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

    public void setData(LocalDateTime data) {
        this.data = data;
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

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String mensagem = String.format("%d;%s;%d;%s;%s;%d",
                this.id,
                this.data.format(formato),
                this.duracao,
                this.professor,
                this.atividades.size()
        );

        return mensagem;

    }
}