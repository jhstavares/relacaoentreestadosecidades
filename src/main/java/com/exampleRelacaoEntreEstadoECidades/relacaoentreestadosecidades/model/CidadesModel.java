package com.exampleRelacaoEntreEstadoECidades.relacaoentreestadosecidades.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cidades")
public class CidadesModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    private Integer cep;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private EstadosModel estados;


}
