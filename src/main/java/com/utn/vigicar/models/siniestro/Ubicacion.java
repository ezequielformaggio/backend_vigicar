package com.utn.vigicar.models.siniestro;

import jakarta.persistence.Embeddable;

@Embeddable
public class Ubicacion {
    int latitud;
    int longitud;
}
