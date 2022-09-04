package com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.repository;

import com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.model.EstadosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadosRepository extends JpaRepository<EstadosModel, Integer> {
}
