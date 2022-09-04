package com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.repository;

import com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.model.CidadesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadesRepository extends JpaRepository<CidadesModel, Integer> {
}
