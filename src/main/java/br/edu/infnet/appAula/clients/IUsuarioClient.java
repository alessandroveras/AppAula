package br.edu.infnet.appAula.clients;

import br.edu.infnet.appAula.model.domain.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url = "localhost:8081/api/usuario", name = "usuarioClient")
public interface IUsuarioClient {

    @GetMapping(value = "/listar")
    public List<Usuario> obterLista();

    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Usuario usuario);

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id);

    @GetMapping(value = "/qtde")
    public Long obterQtde();

    @PostMapping(value = "/validar")
    public Usuario validar(@RequestParam String email, @RequestParam String senha);

    @GetMapping(value = "/{id}/obter")
    public Usuario obterPorId(@PathVariable Integer id);
}
