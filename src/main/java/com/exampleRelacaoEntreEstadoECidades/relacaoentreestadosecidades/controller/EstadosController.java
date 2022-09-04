package com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.controller;

import com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.model.CidadesModel;
import com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.model.EstadosModel;
import com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.service.EstadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstadosController {

    @Autowired
    private EstadosService service;

    @GetMapping(path = "/estados")
    public List<EstadosModel> bucarEstados() {
        return service.buscarTodosEstados();

    }

    @GetMapping(path = "/estados {codigoDoEstados}")
    public Optional<EstadosModel> buscarEstadosPorId(@PathVariable Integer codigoDoEstados) {
        return service.buscarPorId(codigoDoEstados);

    }

    @PostMapping(path = "/estados")
    public EstadosModel cadastrarEstados(@RequestBody EstadosModel estados) {
        return service.cadastrar(estados);
    }

    @PutMapping(path = "/estados/{codigoDoEstados")
    public EstadosModel alterarEstados(@RequestBody EstadosModel estados){
        return service.alterar(estados);
    }
    @DeleteMapping(path = "/estados/{codigoDoEstado}")
    public void deletarEstados(@PathVariable Integer codigoDoEstado){
        service.deletar(codigoDoEstado);
    }

}




