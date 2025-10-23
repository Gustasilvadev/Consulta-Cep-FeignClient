package com.projeto.buscarCep.controller;

import com.projeto.buscarCep.dto.EnderecoResponse;
import com.projeto.buscarCep.service.EnderecoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnderecoController {

    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping("/endereco/{cep}")
    public EnderecoResponse buscarEndereco(@PathVariable String cep) {
        return enderecoService.buscarPorCep(cep);
    }
}
