package br.edu.infnet.appAula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlunoController {

    @GetMapping(value = "/aluno")
    public String telaCadastro() {
        return "aluno/cadastro";
    }
}
