package br.edu.infnet.appAula.model.tests;

import br.edu.infnet.appAula.exceptions.CaloriasPorMinutoInvalidException;
import br.edu.infnet.appAula.exceptions.DuracaoMinutosInvalidException;
import br.edu.infnet.appAula.exceptions.IntensidadeInvalidException;
import br.edu.infnet.appAula.model.domain.Musculacao;

public class MusculacaoTest {

    public static void main(String[] args) {


        //TEST 1 VALID
        try {
            Musculacao musculacao = new Musculacao(45, "Musculacao", "Media", true);
            musculacao.setExercicio("Triceps testa");
            musculacao.setGrupamentoMuscular("triceps");
            musculacao.setAparelho("Alter");
            musculacao.setCarga(20.0F);
            musculacao.setCaloriasPorMinuto(5);

            System.out.println("Calorias queimadas: " + musculacao.calcularCaloriasQueimadas());

        } catch (CaloriasPorMinutoInvalidException | DuracaoMinutosInvalidException | IntensidadeInvalidException  e) {
            System.out.println(e.getMessage());
        }

        //TEST 2 - EXCEPTION CaloriasPorMinutoInvalid
        try {
            Musculacao musculacao = new Musculacao(45, "Musculacao", "Media", true);
            musculacao.setExercicio("Triceps testa");
            musculacao.setGrupamentoMuscular("triceps");
            musculacao.setAparelho("Alter");
            musculacao.setCarga(20.0F);
            musculacao.setCaloriasPorMinuto(0);

            System.out.println("Calorias queimadas: " + musculacao.calcularCaloriasQueimadas());

        } catch (CaloriasPorMinutoInvalidException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
            System.out.println(e.getMessage());
        }

        //TEST 3 - EXCEPTION CaloriasPorMinutoInvalid
        try {
            Musculacao musculacao = new Musculacao(-1, "Musculacao", "Media", true);
            musculacao.setExercicio("Triceps testa");
            musculacao.setGrupamentoMuscular("triceps");
            musculacao.setAparelho("Alter");
            musculacao.setCarga(20.0F);
            musculacao.setCaloriasPorMinuto(0);

            System.out.println("Calorias queimadas: " + musculacao.calcularCaloriasQueimadas());

        } catch (CaloriasPorMinutoInvalidException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
            System.out.println(e.getMessage());
        }

        //TEST 4 - EXCEPTION IntesidadeInvalidExceptions
        try {
            Musculacao musculacao = new Musculacao(45, "Musculacao", "Null", true);
            musculacao.setExercicio("Triceps testa");
            musculacao.setGrupamentoMuscular("triceps");
            musculacao.setAparelho("Alter");
            musculacao.setCarga(20.0F);
            musculacao.setCaloriasPorMinuto(0);

            System.out.println("Calorias queimadas: " + musculacao.calcularCaloriasQueimadas());

        } catch (CaloriasPorMinutoInvalidException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
            System.out.println(e.getMessage());
        }

    }

}
