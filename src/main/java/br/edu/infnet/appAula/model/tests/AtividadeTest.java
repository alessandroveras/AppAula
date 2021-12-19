package br.edu.infnet.appAula.model.tests;

import br.edu.infnet.appAula.model.domain.Aerobico;
import br.edu.infnet.appAula.model.domain.Alongamento;
import br.edu.infnet.appAula.model.domain.Musculacao;

public class AtividadeTest {

	public static void main(String[] args) {

		Musculacao musculacao = new Musculacao(45, "Musculacao", "Media", true );
		System.out.print("Musculacao: " + musculacao);

		Aerobico aerobico = new Aerobico(30, "Musculacao", "Media", false);
		System.out.print("Aerobico: " + aerobico);

		Alongamento alongamento = new Alongamento(10, "Alongamento", "Baixa", false);
		System.out.print("Alongamento: " + alongamento);
		
	}

}
