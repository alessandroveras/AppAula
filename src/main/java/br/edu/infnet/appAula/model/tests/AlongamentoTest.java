package br.edu.infnet.appAula.model.tests;

import br.edu.infnet.appAula.exceptions.DuracaoMinutosInvalidException;
import br.edu.infnet.appAula.exceptions.IntensidadeInvalidException;
import br.edu.infnet.appAula.exceptions.MembroNullException;
import br.edu.infnet.appAula.model.domain.Alongamento;

public class AlongamentoTest {

    public static void main(String[] args) {

        //VALID TEST
        try {
            Alongamento alongamento = new Alongamento(10, "Alongamento", "Baixa", false);
            alongamento.setAparelho("livre");
            alongamento.setMembro("braco");
            alongamento.setRequerAssistencia(false);
            System.out.println("Calorias queimadas: " + alongamento.calcularCaloriasQueimadas());

        } catch (MembroNullException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
            System.out.println(e.getMessage());
        }

        //EXCEPTION MembroNull TEST
        try {
            Alongamento alongamento = new Alongamento(10, "Alongamento", "Baixa", false);
            alongamento.setAparelho("livre");
            alongamento.setMembro(null);
            alongamento.setRequerAssistencia(false);
            System.out.println("Calorias queimadas: " + alongamento.calcularCaloriasQueimadas());

        } catch (MembroNullException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
            System.out.println(e.getMessage());
        }

        //EXCEPTION DuracaoMinutosInvalidException
        try {
            Alongamento alongamento = new Alongamento(0, "Alongamento", "Baixa", false);
            alongamento.setAparelho("livre");
            alongamento.setMembro(null);
            alongamento.setRequerAssistencia(false);
            System.out.println("Calorias queimadas: " + alongamento.calcularCaloriasQueimadas());

        } catch (MembroNullException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
            System.out.println(e.getMessage());
        }

        //EXCEPTION IntendidadeInvalidException
        try {
            Alongamento alongamento = new Alongamento(10, "Alongamento", "Null", false);
            alongamento.setAparelho("livre");
            alongamento.setMembro(null);
            alongamento.setRequerAssistencia(false);
            System.out.println("Calorias queimadas: " + alongamento.calcularCaloriasQueimadas());

        } catch (MembroNullException | DuracaoMinutosInvalidException | IntensidadeInvalidException e) {
            System.out.println(e.getMessage());
        }

    }

}
