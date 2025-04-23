package com.security.cruddto.modelo;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "entidad_usuario")
public class EntidadUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre", nullable = false, unique = false)
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;


    @Column(name = "direccion", nullable = false, unique = false)
    @NotBlank(message = "La direccion es obligatorio")
    private String direccion;


    @Column(name = "cedula", nullable = false, unique = true)
    @NotNull(message = "El precio es obligatorio")
    private Long cedula;


    @Column(name = "email", nullable = false, unique = true)
    @NotBlank(message = "El email es obligatorio")
    private String email;


    @Column(name = "clave", nullable = false, unique = false)
    @NotBlank(message = "La clave es obligatoria")
    private String clave;
}
