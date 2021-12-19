package br.edu.infnet.appAula.model.domain;

public abstract class Atividade {
    private Integer id;

    private final Integer duracaoMinutos;
    private final String descricao;
	private final String intensidade;
    private final Boolean supervisionada;

    public Atividade(Integer duracaoMinutos, String descricao, String intensidade, Boolean supervisionada) {
        this.duracaoMinutos = duracaoMinutos;
        this.descricao = descricao;
		this.intensidade = intensidade;
		this.supervisionada = supervisionada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDuracao() {
        return duracaoMinutos;
    }

    public String getDescricao() {
        return descricao;
    }

	public String getIntensidade() {
		return intensidade;
	}

	public Boolean getSupervisionada() {
        return supervisionada;
    }

	public abstract Integer calcularCaloriasQueimadas();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append(";");
        sb.append(duracaoMinutos);
        sb.append(";");
        sb.append(descricao);
        sb.append(";");
        sb.append(intensidade);
		sb.append(";");
		sb.append(supervisionada);
		sb.append(";");
		sb.append(this.calcularCaloriasQueimadas());

        return sb.toString();
    }
}
