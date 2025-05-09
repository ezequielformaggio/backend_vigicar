package com.utn.vigicar.models.usuario;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.utn.vigicar.models.siniestro.Siniestro;
import com.utn.vigicar.models.vehiculo.Vehiculo;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    String nombre;

    @Column
    String apellido;

    @Column
    String username;

    @Column
    String mail;

    @Column
    String telefono;

    @ManyToMany
    @JoinTable(
        name = "vehiculos_por_usuario",
        joinColumns = @JoinColumn(name = "usuario_id"),
        inverseJoinColumns = @JoinColumn(name = "vehiculo_id")
    )
    List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    @ManyToOne
    List<Siniestro> siniestros = new ArrayList<Siniestro>();

    @ManyToMany
    @JoinTable(
        name = "contactos_emergencia_por_usuario",
        joinColumns = @JoinColumn(name = "usuario_id"),
        inverseJoinColumns = @JoinColumn(name = "contacto_id")
    )
    List<ContactoEmergencia> contactosEmergencia = new ArrayList<ContactoEmergencia>();

    @Column
    @Embedded
    Timestamp timestamp;

}
