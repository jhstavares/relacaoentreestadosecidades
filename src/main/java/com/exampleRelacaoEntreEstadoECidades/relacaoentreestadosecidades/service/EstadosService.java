package com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.service;

import com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.model.EstadosModel;
import com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.repository.EstadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadosService {
    @Autowired
    private EstadosRepository repository;

    public List<EstadosModel> buscarTodosEstados() {
        return repository.findAll();
    }

    public Optional<EstadosModel> buscarPorId(Integer codigoDoEstados) {
        return repository.findById(codigoDoEstados);

    }

    public EstadosModel cadastrar(EstadosModel estados) {
        estados.getNomeEstado();
        estados.getCodigo();

        return repository.save(estados);

    }

    public EstadosModel alterar(EstadosModel estados) {
        estados.getNomeEstado();
        estados.getCodigo();

        return repository.save(estados);

    }
    public void deletar(Integer codigoDoEstado){
        repository.deleteById(codigoDoEstado);
    }
}
