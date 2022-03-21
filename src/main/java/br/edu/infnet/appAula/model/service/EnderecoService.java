package br.edu.infnet.appAula.model.service;

import br.edu.infnet.appAula.clients.IEnderecoClient;
import br.edu.infnet.appAula.model.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private IEnderecoClient enderecoClient;

    public Endereco obterPorCep(String cep) {

        return enderecoClient.buscarCep(cep);

    }
}
