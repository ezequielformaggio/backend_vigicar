package com.utn.vigicar.models.vehiculo;

import jakarta.persistence.Embeddable;

@Embeddable
public class TipoVehiculo {
    Marca marca;
    String modelo;
}
