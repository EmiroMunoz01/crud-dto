package com.security.cruddto.repositorio;


import com.security.cruddto.modelo.EntidadUsuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepositorio extends JpaRepository<EntidadUsuario, Long> {

    Optional<EntidadUsuario> findByEmail(String email);

    void deleteByEmail(String email);

    boolean existsByEmail(String email);


}
