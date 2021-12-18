package br.edu.infnet.appAula.model.domain;

public class Aluno {
	private Integer id;

	private String nome;
	private String email;
	private String cpf;
	private String plano;

	public Aluno(String nome, String email, String cpf, String plano) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.plano = plano;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}

	public String getPlano() {
		return plano;
	}

	@Override
	public String toString() {
		return "Aluno{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", email='" + email + '\'' +
				", cpf='" + cpf + '\'' +
				", plano='" + plano + '\'' +
				'}';
	}
}
