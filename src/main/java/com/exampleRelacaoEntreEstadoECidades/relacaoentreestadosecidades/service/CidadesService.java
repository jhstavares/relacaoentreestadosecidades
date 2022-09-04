package com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.service;

import com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.model.CidadesModel;
import com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.repository.CidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadesService {
    @Autowired
    private CidadesRepository repository;

    public List<CidadesModel> buscarTodasCidades() {
        return repository.findAll();

    }
    public Optional<CidadesModel> buscarPorId(Integer codigoDoCidades) {
        return repository.findById(codigoDoCidades);

    }

    public CidadesModel cadastrar(CidadesModel cidades) {
        cidades.getCodigo();
        cidades.getCep();

        return repository.save(cidades);
    }

    public CidadesModel alterar(CidadesModel cidades) {
        cidades.getCodigo();
        cidades.getCep();

        return repository.save(cidades);
    }

    public void deletar(Integer codigoDaCidades) {
        repository.deleteById(codigoDaCidades);
    }

}

