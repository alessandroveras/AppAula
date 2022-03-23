package br.edu.infnet.appAula.clients;

import br.edu.infnet.appAula.model.domain.Aerobico;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(url = "localhost:8083/api/atividade", name = "aerobicoClient")
public interface IAerobicoClient {

    @PostMapping(value = "/incluir/aerobico")
    public void incluir(@RequestBody Aerobico aerobico);

    @GetMapping(value = "/listar/aerobico")
    public List<Aerobico> obterLista();

    @GetMapping(value = "/{idUser}/listar/aerobico")
    public List<Aerobico> obterLista(@PathVariable Integer idUser);

    @GetMapping(value = "/qtde/aerobico")
    public Long obterQtde();

    @GetMapping(value = "/{id}/aerobico")
    public Aerobico obterPorId(@PathVariable Integer id);
}
