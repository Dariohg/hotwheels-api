// domain/model/HotWheelsCar.java
package com.hotwheels.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hotwheels_cars")
public class HotWheelsCar {
    public enum Estado {
        NUEVO, EN_CAJA, SIN_CAJA, USADO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String nombre;

    @NotBlank
    @Size(max = 50)
    private String modelo;

    @NotBlank
    @Size(max = 30)
    private String color;

    @Column(name = "anio_fabricacion")
    private int añoFabricacion;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User usuario;
}