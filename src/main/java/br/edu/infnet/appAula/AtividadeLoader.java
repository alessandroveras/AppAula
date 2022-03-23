package br.edu.infnet.appAula;

import br.edu.infnet.appAula.model.domain.Aerobico;
import br.edu.infnet.appAula.model.domain.Musculacao;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.service.AerobicoService;
import br.edu.infnet.appAula.model.service.AtividadeService;
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
    private AtividadeService atividadeService;
    @Autowired
    private MusculacaoService musculacaoService;
    @Autowired
    private AerobicoService aerobicoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Long qtdeAtividades = atividadeService.obterQtde();

        if (qtdeAtividades == 0) {

            Usuario usuario = new Usuario();
            usuario.setId(2);

            Musculacao musculacao = new Musculacao(5, "Triceps Testa", "Media", true);
            musculacao.setGrupamentoMuscular("Triceps");
            musculacao.setAparelho("Barra");
            musculacao.setCarga(20.0F);
            musculacao.setCaloriasPorMinuto(5);
            musculacao.setUsuario(usuario);
            musculacaoService.incluir(musculacao);

            Aerobico aerobico = new Aerobico(30, "Escada", "Alta", false);
            aerobico.setEquipamento("Escada Eliptica");
            aerobico.setCoolDownMinutos(7);
            aerobico.setUsarCarga(false);
            aerobico.setCaloriasPorMinuto(15);
            aerobico.setUsuario(usuario);
            aerobicoService.incluir(aerobico);
        }

    }
}
