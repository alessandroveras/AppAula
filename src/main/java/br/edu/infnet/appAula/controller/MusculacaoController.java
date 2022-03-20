package br.edu.infnet.appAula.controller;

import br.edu.infnet.appAula.model.domain.Musculacao;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.service.MusculacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class MusculacaoController {

    @Autowired
    private MusculacaoService musculacaoService;

    @GetMapping(value = "/musculacao")
    public String telaCadastro() {

        return "musculacao/cadastro";
    }

    @GetMapping(value = "/musculacoes")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        if (usuario.isAdmin() == true) {
            model.addAttribute("lista", musculacaoService.obterLista());
        } else {
            model.addAttribute("lista", musculacaoService.obterLista());
        }

        return "musculacao/lista";
    }

    @PostMapping(value = "/musculacao/incluir")
    public String incluir(Model model, Musculacao musculacao, @SessionAttribute("user") Usuario usuario) {

//        musculacao.setUsuario(usuario);

        musculacaoService.incluir(musculacao);

        model.addAttribute("mensagem", "O musculacao " + musculacao.getDescricao() + " foi cadastrado com sucesso.");

        return telaLista(model, usuario);
    }

    @GetMapping(value = "/musculacao/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {

        Musculacao musculacao = musculacaoService.obterPorId(id);

        musculacaoService.excluir(id);

        model.addAttribute("mensagem", "O musculacao " + musculacao.getDescricao() + " foi removido com sucesso.");

        return telaLista(model, usuario);

    }
}
