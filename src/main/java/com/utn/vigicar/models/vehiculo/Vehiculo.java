package com.utn.vigicar.models.vehiculo;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.utn.vigicar.models.usuario.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="vehiculos")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    String nombre;

    @Column
    TipoVehiculo tipo;

    @Column
    int anio;

    @Column
    @Embedded
    Color color;

    @Column
    @Embedded
    Timestamp timestamp;

}
