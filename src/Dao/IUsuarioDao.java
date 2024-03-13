package Dao;

import java.util.List;

import Model.Usuario;

public interface IUsuarioDao {
    public List<Usuario> listarsUsuarios();
    
    public Usuario buscarUsuarioId(int id);

    public void guardarUsuario(Usuario usuario);

    public void prestarLibroUsuario(String identificacionUsuario, String nombreLibro);
    
    public void devolverLibroUsuario(int idLibro);
}
