package br.edu.infnet.appAula.controller;

import br.edu.infnet.appAula.model.domain.Aerobico;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.service.AerobicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class AerobicoController {

    @Autowired
    private AerobicoService aerobicoService;

    @GetMapping(value = "/aerobico")
    public String telaCadastro() {

        return "aerobico/cadastro";
    }

    @GetMapping(value = "/aerobicos")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        if (usuario.isAdmin() == true) {
            model.addAttribute("lista", aerobicoService.obterLista());
        } else {
            model.addAttribute("lista", aerobicoService.obterLista(usuario));
        }

        return "aerobico/lista";
    }

    @PostMapping(value = "/aerobico/incluir")
    public String incluir(Model model, Aerobico aerobico, @SessionAttribute("user") Usuario usuario) {

        aerobico.setUsuario(usuario);

        aerobicoService.incluir(aerobico);

        model.addAttribute("mensagem", "A atividade aerobica " + aerobico.getDescricao() + " foi cadastrada com sucesso.");

        return telaLista(model, usuario);
    }

    @GetMapping(value = "/aerobico/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {

        Aerobico aerobico = aerobicoService.obterPorId(id);

        aerobicoService.excluir(id);

        model.addAttribute("mensagem", "A atividade aerobica " + aerobico.getDescricao() + " foi removida com sucesso.");

        return telaLista(model, usuario);

    }
}
