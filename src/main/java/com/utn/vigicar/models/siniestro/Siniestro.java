package com.utn.vigicar.models.siniestro;

import java.security.Timestamp;
import java.util.List;

import com.utn.vigicar.models.usuario.Usuario;
import com.utn.vigicar.models.vehiculo.Vehiculo;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="siniestros")
public class Siniestro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    Vehiculo vehiculo;

    @ManyToOne
    Usuario usuario;

    @ElementCollection
    List<String> fotos;

    @ManyToOne
    Ubicacion ubicacion;

    @Column
    @Embedded
    Timestamp timestamp;
    
}
