package br.edu.infnet.appAula.model.domain;

public class Professor {
    private Integer id;

    private final String nome;
    private final String email;
    private final String cpf;

    public Professor(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(id);
        sb.append(";");
        sb.append(nome);
        sb.append(";");
        sb.append(email);
        sb.append(";");
        sb.append(cpf);

        return sb.toString();
    }
}
