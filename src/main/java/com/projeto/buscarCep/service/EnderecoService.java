package com.projeto.buscarCep.service;

import com.projeto.buscarCep.dto.EnderecoResponse;
import com.projeto.buscarCep.entity.Endereco;
import com.projeto.buscarCep.interfaces.EnderecoFeignClient;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    private EnderecoFeignClient enderecoFeignClient;

    public EnderecoService(EnderecoFeignClient enderecoFeignClient) {
        this.enderecoFeignClient = enderecoFeignClient;
    }
    public EnderecoResponse buscarPorCep(String cep) {
        return enderecoFeignClient.findByCep(cep);
    }
}
