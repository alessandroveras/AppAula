package br.edu.infnet.appAula.clients;

import br.edu.infnet.appAula.model.domain.Professor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(url = "localhost:8084/api/professor", name = "professorClient")
public interface IProfessorClient {

    @GetMapping(value = "/listar")
    public List<Professor> obterLista();

    @GetMapping(value = "/{idUser}/listar")
    public List<Professor> obterLista(@PathVariable Integer idUser);

    @PostMapping(value = "/incluir")
    public void incluir(@RequestBody Professor professor);

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(@PathVariable Integer id);

    @GetMapping(value = "/qtde")
    public Long obterQtde();

    @GetMapping(value = "/{id}/obter")
    public Professor obterPorId(@PathVariable Integer id);
}
