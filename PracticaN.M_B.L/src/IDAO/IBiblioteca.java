package IDAO;

import java.util.List;

import Ver.Libro;
import Ver.Usuario;

public interface IBiblioteca {
	void agregarLibro(Libro libro);
	void registrarUsuario(Usuario usuario);
	
	boolean buscarUsuario(Usuario usuario);
	Libro buscarLibro(int id);
	List<Libro> verLibros();
	Usuario buscarUsuario(int id);
	List<Usuario> verUsuarios();
	
	Libro actualizardispLibro(Libro libro,boolean disp);
	
	boolean actualizarListaLibro(Libro libro);
	boolean actualizarListaUsuario(Usuario usuario);
	
	void eliminarLibro(Libro libro);
	void eliminarUsuaro(Usuario usuario);
	
}