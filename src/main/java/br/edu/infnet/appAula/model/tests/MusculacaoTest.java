package br.edu.infnet.appAula.model.tests;

import br.edu.infnet.appAula.model.domain.Musculacao;

public class MusculacaoTest {
	
	public static void main(String[] args) {
		
		Musculacao musculacao = new Musculacao(45, "Musculacao", "Media", true );
		System.out.println("Calorias queimadas: " + musculacao.calcularCaloriasQueimadas());
	}

}
