package br.edu.infnet.appAula.model.tests;

import br.edu.infnet.appAula.exceptions.CaloriasPorMinutoInvalidException;
import br.edu.infnet.appAula.exceptions.DuracaoMinutosInvalidException;
import br.edu.infnet.appAula.exceptions.IntensidadeInvalidException;
import br.edu.infnet.appAula.exceptions.MembroNullException;
import br.edu.infnet.appAula.model.domain.*;

import java.util.ArrayList;
import java.util.List;

public class AulaTest {

    public static void main(String[] args) {

        List<Atividade> atividades = new ArrayList<Atividade>();

        try {
            Musculacao musculacao = new Musculacao(45, "Musculacao", "Media", true);
            musculacao.setExercicio("Triceps testa");
            musculacao.setGrupamentoMuscular("triceps");
            musculacao.setAparelho("Alter");
            musculacao.setCarga(20.0F);
            musculacao.setCaloriasPorMinuto(2);

            atividades.add(musculacao);
        } catch (CaloriasPorMinutoInvalidException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            Aerobico aerobico = new Aerobico(30, "Musculacao", "Media", false);
            aerobico.setEquipamento("Esteira Ergometrica");
            aerobico.setCoolDownMinutos(5);
            aerobico.setUsarCarga(false);
            aerobico.setCaloriasPorMinuto(10);

            atividades.add(aerobico);
        } catch (CaloriasPorMinutoInvalidException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
            System.out.println(e.getMessage());
        }


        try {
            Alongamento alongamento = new Alongamento(10, "Alongamento", "Baixa", false);
            alongamento.setAparelho("livre");
            alongamento.setMembro("braco");
            alongamento.setRequerAssistencia(false);

            atividades.add(alongamento);

        } catch (MembroNullException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
            System.out.println(e.getMessage());
        }


        Professor professor = new Professor("Maria Personal", "maria.personal@bodytech.com.br", "10177249706");
        professor.setId(999);

        Aula aula = new Aula();
        aula.setId(1);
        aula.setDuracao(1);
        aula.setProfessor(professor);
        aula.setAtividades(atividades);
        System.out.println(aula);


    }

}