package com.security.cruddto.servicio;



import com.security.cruddto.dto.Entidad_Usuario.ActualizarUsuarioDTO;

import com.security.cruddto.dto.Entidad_Usuario.CrearUsuarioDTO;
import com.security.cruddto.dto.Entidad_Usuario.UsuarioDTO;
import com.security.cruddto.modelo.EntidadUsuario;

import java.util.List;

public interface IUsuario {

    public List<UsuarioDTO> listarUsuarios();

    public String eliminarUsuarioPorEmail(String email);

    public CrearUsuarioDTO crearUsuario(CrearUsuarioDTO usuario);

    public ActualizarUsuarioDTO actualizarUsuarioPorEmail(String email, ActualizarUsuarioDTO usuario);

    public UsuarioDTO buscarUsuarioPorEmail(String email);



}
