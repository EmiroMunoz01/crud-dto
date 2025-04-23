package com.security.cruddto.servicio;


import com.security.cruddto.modelo.EntidadUsuario;
import com.security.cruddto.repositorio.UsuarioRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioServicio implements IUsuario {


    private final UsuarioRepositorio repositorio;

    public UsuarioServicio(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }


    @Override
    public List<EntidadUsuario> listarUsuario() {
        return List.of();
    }

    @Override
    public void eliminarUsuarioPorEmail(String email) {
        repositorio.deleteByEmail(email);
    }

    @Override
    public EntidadUsuario crearUsuario(EntidadUsuario usuario) {
        return null;
    }

    @Override
    public EntidadUsuario actualizarUsuarioPorEmail(String email, EntidadUsuario usuario) {
        return null;
    }

    @Override
    public EntidadUsuario buscarUsuarioPorEmail(String email) {
        return null;
    }
}
