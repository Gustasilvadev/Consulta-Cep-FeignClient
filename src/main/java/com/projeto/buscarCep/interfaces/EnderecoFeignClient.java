package com.projeto.buscarCep.interfaces;

import com.projeto.buscarCep.dto.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name= "ViaCep", url="viacep.com.br/ws/")
public interface EnderecoFeignClient {

    @GetMapping(value= "/{cep}/json/")
    EnderecoResponse findByCep(@PathVariable("cep") String cep);
}
