package com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estado")

public class EstadosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer codigo;

    @Column(name = "nome_estado")
    private String nomeEstado;

    @OneToMany(mappedBy = "estado" , cascade = CascadeType.ALL)
    @JsonIgnore
    private List<CidadesModel> cidades = new ArrayList<>();
}
