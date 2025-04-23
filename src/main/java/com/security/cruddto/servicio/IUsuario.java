package com.security.cruddto.servicio;



import com.security.cruddto.modelo.EntidadUsuario;

import java.util.List;

public interface IUsuario {

    public List<EntidadUsuario> listarUsuario();

    public void eliminarUsuarioPorEmail(String email);

    public EntidadUsuario crearUsuario(EntidadUsuario usuario);

    public EntidadUsuario actualizarUsuarioPorEmail(String email, EntidadUsuario usuario);

    public EntidadUsuario buscarUsuarioPorEmail(String email);



}
