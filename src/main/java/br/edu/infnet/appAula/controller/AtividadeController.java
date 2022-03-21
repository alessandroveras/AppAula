package br.edu.infnet.appAula.controller;

import br.edu.infnet.appAula.model.domain.Atividade;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.service.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;

    @GetMapping(value = "/atividades")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("lista", atividadeService.obterLista(usuario));

        return "atividade/lista";
    }

    @GetMapping(value = "/atividade/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {

        Atividade atividade = atividadeService.obterPorId(id);

        atividadeService.excluir(id);

        model.addAttribute("mensagem", "A Atividade " + atividade.getDescricao() + " foi removida com sucesso.");

        return telaLista(model, usuario);

    }
}
