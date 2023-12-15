package IDAO;

import java.util.List;

import Ver.Usuario;

public interface IUsuario {
	List<Usuario> obtenerUsuarios();
	Usuario obtenerUsuario(int id);
	void agregarUsuario(Usuario usuario);
	boolean actualizarUsuario(int id, Usuario usuario);
	boolean eliminarUsuario(int id);
	void agregarUsuario1(Usuario usuario);
	
}