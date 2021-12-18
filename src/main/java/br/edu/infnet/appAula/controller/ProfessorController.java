package br.edu.infnet.appAula.controller;

import br.edu.infnet.appAula.model.domain.Professor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfessorController {

    @GetMapping(value = "/professor")
    public String telaCadastro() {
        return "professor/cadastro";
    }

    @PostMapping(value = "/professor/incluir")
    public String incluir(Professor professor) {
        return "confirmacao";
    }
}
