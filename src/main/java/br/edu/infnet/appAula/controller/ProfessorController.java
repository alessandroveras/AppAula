package br.edu.infnet.appAula.controller;

import br.edu.infnet.appAula.model.domain.Endereco;
import br.edu.infnet.appAula.model.domain.Professor;
import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping(value = "/professor")
    public String telaCadastro() {

        return "professor/cadastro";
    }

    @GetMapping(value = "/professores")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        if (usuario.isAdmin() == true) {
            model.addAttribute("lista", professorService.obterLista());
        } else {
            model.addAttribute("lista", professorService.obterLista(usuario));
        }

        return "professor/lista";
    }

    @PostMapping(value = "/professor/incluir")
    public String incluir(Model model, Professor professor, Endereco endereco, @SessionAttribute("user") Usuario usuario) {

        professor.setEndereco(endereco);
        professor.setUsuario(usuario);

        professorService.incluir(professor);

        model.addAttribute("mensagem", "O professor " + professor.getNome() + " foi cadastrado com sucesso.");

        return telaLista(model, usuario);
    }

    @GetMapping(value = "/professor/{id}/excluir")
    public String excluir(Model model, @PathVariable Integer id, @SessionAttribute("user") Usuario usuario) {

        Professor professor = professorService.obterPorId(id);

        professorService.excluir(id);

        model.addAttribute("mensagem", "O professor " + professor.getNome() + " foi removido com sucesso.");

        return telaLista(model, usuario);

    }
}
