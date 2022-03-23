package br.edu.infnet.appAula.clients;

import br.edu.infnet.appAula.model.domain.Atividade;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "localhost:8083/api/atividade", name = "atividadeClient")
public interface IAtividadeClient {

    @GetMapping(value = "/listar")
    public List<Atividade> obterLista();

    @GetMapping(value = "/{idUser}/listar")
    public List<Atividade> obterLista(@PathVariable Integer idUser);

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id);

    @GetMapping(value = "/qtde")
    public Long obterQtde();

    @GetMapping(value = "/{id}")
    public Atividade obterPorId(@PathVariable Integer id);
}
