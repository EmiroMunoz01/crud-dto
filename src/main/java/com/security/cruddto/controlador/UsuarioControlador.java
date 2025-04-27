package com.security.cruddto.controlador;



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

    public UsuarioControlador(UsuarioServicio servicio){
        this.servicio = servicio;
    }

//    private final ProductoServicio servicio;
//
//    public ProductoControlador(ProductoServicio servicio) {
//        this.servicio = servicio;
//    }
//
    @GetMapping("")
    public ResponseEntity<?> listarProductos() {
                return ResponseEntity.ok(servicio.listarUsuarios());
    }

    @PostMapping("/crear")
    public ResponseEntity<?> crearUsuario(@Valid @RequestBody CrearUsuarioDTO crearUsuarioDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(servicio.crearUsuario(crearUsuarioDTO));
    }
//
//    @GetMapping("/buscar/{id}")
//    public ResponseEntity<?> obtenerProductoPorId(@PathVariable Long id) {
//
//        Optional<Producto> productoOpt = servicio.obtenerPorId(id);
//
//        if (productoOpt.isPresent()) {
//            Producto producto = productoOpt.get();
//            return ResponseEntity.ok(producto);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//
//    }
//
//    @PutMapping("/actualizar/{id}")
//    public ResponseEntity<Producto> actualizar(@RequestBody Producto producto, @PathVariable Long id) {
//
//        Optional<Producto> productoOptional = servicio.obtenerPorId(id);
//
//        if (productoOptional.isPresent()) {
//            Producto existente = productoOptional.get();
//            existente.setNombre(producto.getNombre());
//            existente.setPrecio(producto.getPrecio());
//            Producto actualizado = servicio.guardar(existente);
//            return ResponseEntity.ok(actualizado);
//
//        } else {
//
//            return ResponseEntity.notFound().build();
//
//        }
//
//    }
//
//    @DeleteMapping("/eliminar/{id}")
//    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
//        Optional<Producto> productoOptional = servicio.obtenerPorId(id);
//
//        if (productoOptional.isPresent()) {
//            servicio.eliminar(id);
//            return ResponseEntity.noContent().build(); // 204 sin cuerpo
//        } else {
//            return ResponseEntity.notFound().build(); // 404 si no existe
//        }
//    }




}
