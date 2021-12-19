package br.edu.infnet.appAula.model.tests;

import br.edu.infnet.appAula.model.domain.Alongamento;

public class AlongamentoTest {

	public static void main(String[] args) {
		
		Alongamento alongamento = new Alongamento(10, "Alongamento", "Baixa", false);
		System.out.println("Calorias queimadas: " + alongamento.calcularCaloriasQueimadas());
	}

}
