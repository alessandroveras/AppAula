package br.edu.infnet.appAula.controller;

import br.edu.infnet.appAula.model.domain.Professor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ProfessorController {

    @GetMapping(value = "/professor")
    public String telaCadastro() {
        return "professor/cadastro";
    }

    @GetMapping(value = "/professores")
    public String telaLista(Model model) {

        List<Professor> professores = new ArrayList<Professor>(
                Arrays.asList(
                        new Professor("Maria Personal", "maria@bodytech.com", "11111111111"),
                        new Professor("Jose Personal", "jose@bodytech.com", "22222222222"),
                        new Professor("Caroline Personal", "caroline@bodytech.com", "33333333333")
                )
        );
        model.addAttribute("lista", professores);
        return "professor/lista";
    }

    @PostMapping(value = "/professor/incluir")
    public String incluir(Model model, Professor professor) {

        model.addAttribute("mensagem", "O professor " + professor.getNome() + " foi cadastrado com sucesso.");
        return telaLista(model);
    }
}
