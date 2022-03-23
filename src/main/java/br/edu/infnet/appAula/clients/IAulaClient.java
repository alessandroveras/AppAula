package br.edu.infnet.appAula.clients;

import br.edu.infnet.appAula.model.domain.Aula;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url = "localhost:8082/api/aula", name = "aulaClient")
public interface IAulaClient {

    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Aula aula);

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id);

    @GetMapping(value = "/listar")
    public List<Aula> obterLista();

    @GetMapping(value = "/{idUser}/listar")
    public List<Aula> obterLista(@PathVariable Integer idUser);

    @GetMapping(value = "/qtde")
    public Long obterQtde();

    @GetMapping(value = "/{id}/obter")
    public Aula obterPorId(@PathVariable Integer id);
}