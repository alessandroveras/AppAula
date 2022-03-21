package br.edu.infnet.appAula.controller;

import br.edu.infnet.appAula.model.domain.Atividade;
import br.edu.infnet.appAula.model.domain.Aula;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.service.AtividadeService;
import br.edu.infnet.appAula.model.service.AulaService;
import br.edu.infnet.appAula.model.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AulaController {

    @Autowired
    private AulaService aulaService;

    @Autowired
    private ProfessorService professorService;

    @Autowired
    private AtividadeService atividadeService;

    @GetMapping(value = "/aula")
    public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("professores", professorService.obterLista(usuario));
        model.addAttribute("atividades", atividadeService.obterLista(usuario));

        return "aula/cadastro";
    }

    @GetMapping(value = "/aulas")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        if (usuario.isAdmin() == true) {
            model.addAttribute("lista", aulaService.obterLista());
        } else {
            model.addAttribute("lista", aulaService.obterLista(usuario));
        }

        return "aula/lista";
    }

    @PostMapping(value = "/aula/incluir")
    public String incluir(Model model, Aula aula, @RequestParam String[] atividadesId, @SessionAttribute("user") Usuario usuario) {

        aula.setUsuario(usuario);

        List<Atividade> atividades = new ArrayList<Atividade>();

        for (String id : atividadesId) {
            Atividade atividade = atividadeService.obterPorId(Integer.valueOf(id));
            atividades.add(atividade);
        }

        aula.setAtividades(atividades);

        aulaService.incluir(aula);

        model.addAttribute("mensagem", "A aula " + aula.getId() + " foi cadastrada com sucesso.");

        return telaLista(model, usuario);
    }

    @GetMapping(value = "/aula/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {

        Aula aula = aulaService.obterPorId(id);

        aulaService.excluir(id);

        model.addAttribute("mensagem", "O aula " + aula.getId() + " foi removida com sucesso.");

        return telaLista(model, usuario);

    }
}
