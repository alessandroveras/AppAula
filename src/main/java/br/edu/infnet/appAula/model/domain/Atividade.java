package br.edu.infnet.appAula.model.domain;

import br.edu.infnet.appAula.exceptions.DuracaoMinutosInvalidException;
import br.edu.infnet.appAula.exceptions.IntensidadeInvalidException;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TAtividade")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer duracaoMinutos;
    private String descricao;
	private String intensidade;
    private Boolean supervisionada;

    public Atividade(Integer duracaoMinutos, String descricao, String intensidade, Boolean supervisionada) throws DuracaoMinutosInvalidException, IntensidadeInvalidException {

        if (duracaoMinutos <=0){
            throw new DuracaoMinutosInvalidException("Impossivel criar atividade com duracao invalida [<=0]");
        }
        List<String> listaIntensidade = new ArrayList<String>();
        listaIntensidade.add("Baixa");
        listaIntensidade.add("Alta");
        listaIntensidade.add("Media");

        if  (!listaIntensidade.contains(intensidade)) {
            throw new IntensidadeInvalidException("Intensidade possui um valor designado invalido, favor selecionar um valor dentre a lista [Baixa, Media, Alta]");
        }
        this.descricao = descricao;
        this.duracaoMinutos = duracaoMinutos;
		this.intensidade = intensidade;
		this.supervisionada = supervisionada;
    }

    public Atividade() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(Integer duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
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
        sb.append(";");

        return sb.toString();
    }
}
