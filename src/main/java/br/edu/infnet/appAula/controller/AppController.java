package br.edu.infnet.appAula.controller;

import br.edu.infnet.appAula.model.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class AppController {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private ProfessorService professorService;
    @Autowired
    private AtividadeService atividadeService;
    @Autowired
    private MusculacaoService musculacaoService;
    @Autowired
    private AerobicoService aerobicoService;
//    @Autowired
//    private AlongamentoService AlongamentoService;
    @Autowired
    private AulaService aulaService;


    @GetMapping(value = "/home")
    public String telaHome() {
        return "home";
    }

    @GetMapping(value = "/app")
    public String telaApp(Model model) {

        Map<String, Long> mapa = new HashMap<String, Long>();
        mapa.put("Usuarios", usuarioService.obterQtde());
        mapa.put("Professores", professorService.obterQtde());
        mapa.put("Atividades", atividadeService.obterQtde());
        mapa.put("Musculacoes", musculacaoService.obterQtde());
        mapa.put("Aerobicos", aerobicoService.obterQtde());
//        mapa.put("Alongamentos", alongamentoService.obterQtde());
        mapa.put("Aulas", aulaService.obterQtde());

        model.addAttribute("itensMap", mapa);

        return "app";
    }
}
