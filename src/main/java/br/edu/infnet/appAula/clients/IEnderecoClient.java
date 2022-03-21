package br.edu.infnet.appAula.clients;

import br.edu.infnet.appAula.model.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="enderecoClient", url = "https://viacep.com.br/ws")
public interface IEnderecoClient {

    @GetMapping(value = "/{cep}/json")
    public Endereco buscarCep(@PathVariable String cep);

}
