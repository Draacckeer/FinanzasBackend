package com.example.finanzasbackend.app.domain.model.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@With
@Entity
@Table(name = "schedule", schema = "finanzas")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer mes;
    private String fecha;
    private Double deuda;
    private Double amortizacion;
    private Double interes;
    private Double cuota;
    private Double igv;
    private Double cuotaConIgv;

}
