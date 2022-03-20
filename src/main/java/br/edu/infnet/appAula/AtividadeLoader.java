package br.edu.infnet.appAula;

import br.edu.infnet.appAula.model.domain.Musculacao;
import br.edu.infnet.appAula.model.service.MusculacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class AtividadeLoader implements ApplicationRunner {

    @Autowired
    private MusculacaoService musculacaoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Musculacao musculacao = new Musculacao(45, "Triceps Testa", "Media", true);
        musculacao.setExercicio("Triceps testa");
        musculacao.setGrupamentoMuscular("Triceps");
        musculacao.setAparelho("Barra");
        musculacao.setCarga(20.0F);
        musculacao.setCaloriasPorMinuto(5);

        musculacaoService.incluir(musculacao);

    }
}
