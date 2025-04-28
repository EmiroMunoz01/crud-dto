package com.security.cruddto.controlador;


import com.security.cruddto.dto.Entidad_Usuario.ActualizarUsuarioDTO;
import com.security.cruddto.dto.Entidad_Usuario.CrearUsuarioDTO;
import com.security.cruddto.dto.Entidad_Usuario.UsuarioDTO;
import com.security.cruddto.servicio.UsuarioServicio;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioControlador {


    private final UsuarioServicio servicio;

    public UsuarioControlador(UsuarioServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("")
    public ResponseEntity<?> listarUsuarios() {
        return ResponseEntity.ok(servicio.listarUsuarios());
    }

    @PostMapping("/crear")
    public ResponseEntity<?> crearUsuario(@Valid @RequestBody CrearUsuarioDTO crearUsuarioDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crearUsuario(crearUsuarioDTO));
    }

    //
    @GetMapping("/buscar/{email}")
    public ResponseEntity<?> obtenerUsuarioPorEmail(@PathVariable String email) {
        return ResponseEntity.status(HttpStatus.FOUND).body(servicio.buscarUsuarioPorEmail(email));

    }

    @PutMapping("/actualizar/{email}")
    public ResponseEntity<?> actualizar(@RequestBody ActualizarUsuarioDTO usuario, @PathVariable String email) {

        return ResponseEntity.status(HttpStatus.OK).body(servicio.actualizarUsuarioPorEmail(email, usuario));

    }

    @DeleteMapping("/eliminar/{email}")
    public ResponseEntity<?> eliminar(@PathVariable String email) {

        return  ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.eliminarUsuarioPorEmail(email));
    }


}
