package br.edu.infnet.appAula.model.tests;

import br.edu.infnet.appAula.exceptions.CaloriasPorMinutoInvalidException;
import br.edu.infnet.appAula.exceptions.DuracaoMinutosInvalidException;
import br.edu.infnet.appAula.exceptions.IntensidadeInvalidException;
import br.edu.infnet.appAula.model.domain.Aerobico;

public class AerobicoTest {

    public static void main(String[] args) {

		//TEST valid
        try {
            Aerobico aerobico = new Aerobico(30, "Aerobico", "Media", false);
            aerobico.setEquipamento("Esteira Ergometrica");
            aerobico.setCoolDownMinutos(5);
            aerobico.setUsarCarga(false);
            aerobico.setCaloriasPorMinuto(10);

			System.out.println("Calorias queimadas: " + aerobico.calcularCaloriasQueimadas());

		} catch (CaloriasPorMinutoInvalidException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
            System.out.println(e.getMessage());
        }

		//EXCEPTION CaloriasPorMinutoInvalid
		try {
			Aerobico aerobico = new Aerobico(30, "Aerobico", "Media", false);
			aerobico.setEquipamento("Esteira Ergometrica");
			aerobico.setCoolDownMinutos(5);
			aerobico.setUsarCarga(false);
			aerobico.setCaloriasPorMinuto(0);

			System.out.println("Calorias queimadas: " + aerobico.calcularCaloriasQueimadas());

		} catch (CaloriasPorMinutoInvalidException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
			System.out.println(e.getMessage());
		}

		//EXCEPTION DuracaoMinutosInvalidException
		try {
			Aerobico aerobico = new Aerobico(-1, "Aerobico", "Media", false);
			aerobico.setEquipamento("Esteira Ergometrica");
			aerobico.setCoolDownMinutos(5);
			aerobico.setUsarCarga(false);
			aerobico.setCaloriasPorMinuto(0);

			System.out.println("Calorias queimadas: " + aerobico.calcularCaloriasQueimadas());

		} catch (CaloriasPorMinutoInvalidException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
			System.out.println(e.getMessage());
		}

		//EXCEPTION IntensidadeInvalidException
		try {
			Aerobico aerobico = new Aerobico(30, "Aerobico", "Null", false);
			aerobico.setEquipamento("Esteira Ergometrica");
			aerobico.setCoolDownMinutos(5);
			aerobico.setUsarCarga(false);
			aerobico.setCaloriasPorMinuto(0);

			System.out.println("Calorias queimadas: " + aerobico.calcularCaloriasQueimadas());

		} catch (CaloriasPorMinutoInvalidException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
			System.out.println(e.getMessage());
		}


    }

}
