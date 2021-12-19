package br.edu.infnet.appAula.controller;

import br.edu.infnet.appAula.model.domain.Usuario;
import br.edu.infnet.appAula.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("user")
@Controller
public class AcessoController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/")
    public String telaLogin() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String acessar(Model model, @RequestParam String email, @RequestParam String senha) {

        Usuario usuario = usuarioService.validar(email, senha);

        if (usuario != null ) {
            model.addAttribute("user", usuario);
            return "index";
        } else {
            model.addAttribute("msg", "Impossível realizar a autenticação: " + email + "!");
            return "login";
        }
    }
}