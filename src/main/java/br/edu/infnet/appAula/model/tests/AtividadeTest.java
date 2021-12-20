package br.edu.infnet.appAula.model.tests;

import br.edu.infnet.appAula.exceptions.CaloriasPorMinutoInvalidException;
import br.edu.infnet.appAula.exceptions.DuracaoMinutosInvalidException;
import br.edu.infnet.appAula.exceptions.IntensidadeInvalidException;
import br.edu.infnet.appAula.exceptions.MembroNullException;
import br.edu.infnet.appAula.model.domain.Aerobico;
import br.edu.infnet.appAula.model.domain.Alongamento;
import br.edu.infnet.appAula.model.domain.Musculacao;

public class AtividadeTest {

    public static void main(String[] args) {

        try {
            Musculacao musculacao = new Musculacao(45, "Musculacao", "Media", true);
            musculacao.setExercicio("Triceps testa");
            musculacao.setGrupamentoMuscular("triceps");
            musculacao.setAparelho("Alter");
            musculacao.setCarga(20.0F);
            musculacao.setCaloriasPorMinuto(2);
            System.out.println("Musculacao: " + musculacao);
        } catch (CaloriasPorMinutoInvalidException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            Aerobico aerobico = new Aerobico(30, "Aerobico", "Media", false);
            aerobico.setEquipamento("Esteira Ergometrica");
            aerobico.setCoolDownMinutos(5);
            aerobico.setUsarCarga(false);
            aerobico.setCaloriasPorMinuto(10);
            System.out.println("Aerobico: " + aerobico);
        } catch (CaloriasPorMinutoInvalidException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            Alongamento alongamento = new Alongamento(10, "Alongamento", "Baixa", false);
            alongamento.setAparelho("livre");
            alongamento.setMembro("braco");
            alongamento.setRequerAssistencia(false);
            System.out.println("Alongamento: " + alongamento);

        } catch (MembroNullException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
            System.out.println(e.getMessage());
        }

    }

}
