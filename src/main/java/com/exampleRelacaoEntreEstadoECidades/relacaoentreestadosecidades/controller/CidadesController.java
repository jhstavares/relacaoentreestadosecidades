package com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.controller;

import com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.model.CidadesModel;
import com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.service.CidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CidadesController {
    @Autowired
    private CidadesService service;

    @GetMapping(path = "/cidades")
    public List<CidadesModel> bucarCidades() {
        return service.buscarTodasCidades();


    }

    @GetMapping(path = "/cidades {codigoDaCidades}")
    public Optional<CidadesModel> buscarCidadesPorId(@PathVariable Integer codigoDoCidades) {
        return service.buscarPorId(codigoDoCidades);

    }

    @PostMapping(path = "/cidades")
    public CidadesModel cadastrarCidades(@RequestBody CidadesModel cidades) {
        return service.cadastrar(cidades);
    }

    @PutMapping(path = "/cidades/{codigoDoCidades")
    public CidadesModel alterarCidades(@RequestBody CidadesModel cidades) {
        return service.alterar(cidades);
    }

    @DeleteMapping(path = "/cidades/{codigoDoCidades}")
    public void deletarCidades(@PathVariable Integer codigoDoCidades) {
        service.deletar(codigoDoCidades);
    }
}
