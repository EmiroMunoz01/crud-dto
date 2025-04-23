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
        return repositorio.findAll();
    }


    //Metodo para eliminar un usuario mediante email
    @Override
    public void eliminarUsuarioPorEmail(String email) {
        repositorio.deleteByEmail(email);
    }



    //Metodo para crear un usuario
    @Override
    public EntidadUsuario crearUsuario(EntidadUsuario usuario) {
        return repositorio.save(usuario);
    }


    //Metodo para actualizar un usuario
    @Override
    public EntidadUsuario actualizarUsuarioPorEmail(String email, EntidadUsuario usuario) {
        return null;
    }


    //Metodo para eliminar un usuario
    @Override
    public EntidadUsuario buscarUsuarioPorEmail(String email) {
        return null;
    }
}
