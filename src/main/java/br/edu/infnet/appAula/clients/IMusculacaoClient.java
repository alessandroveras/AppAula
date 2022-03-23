package br.edu.infnet.appAula.clients;

import br.edu.infnet.appAula.model.domain.Musculacao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(url = "localhost:8083/api/atividade", name = "musculacaoClient")
public interface IMusculacaoClient {

    @PostMapping(value = "/incluir/musculacao")
    public void incluir(@RequestBody Musculacao musculacao);

    @GetMapping(value = "/listar/musculacao")
    public List<Musculacao> obterLista();

    @GetMapping(value = "/{idUser}/listar/musculacao")
    public List<Musculacao> obterLista(@PathVariable Integer idUser);

    @GetMapping(value = "/qtde/musculacao")
    public Long obterQtde();

    @GetMapping(value = "/{id}/musculacao")
    public Musculacao obterPorId(@PathVariable Integer id);
}
