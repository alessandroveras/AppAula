package br.edu.infnet.appAula.controller;

import br.edu.infnet.appAula.model.domain.Endereco;
import br.edu.infnet.appAula.model.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping(value = "/cep")
    public String buscarCEP(Model model, @RequestParam String cep) {

        model.addAttribute("endereco", enderecoService.obterPorCep(cep));

        return "usuario/cadastro";

    }

}
