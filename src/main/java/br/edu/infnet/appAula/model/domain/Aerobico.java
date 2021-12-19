package br.edu.infnet.appAula.model.domain;

public class Aerobico extends Atividade {

    public Aerobico(Integer duracaoMinutos, String descricao, String intensidade, Boolean supervisionada) {
        super(duracaoMinutos, descricao, intensidade, supervisionada);
    }

    @Override
    public Integer calcularCaloriasQueimadas() {
        return 0;
    }
}
