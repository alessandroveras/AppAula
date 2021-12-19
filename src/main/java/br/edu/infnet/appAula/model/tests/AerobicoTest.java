package br.edu.infnet.appAula.model.tests;

import br.edu.infnet.appAula.model.domain.Aerobico;

public class AerobicoTest {
	
	public static void main(String[] args) {
		
		Aerobico aerobico = new Aerobico(30, "Musculacao", "Media", false);
		System.out.println("Calorias queimadas: " + aerobico.calcularCaloriasQueimadas());
		
	}

}
