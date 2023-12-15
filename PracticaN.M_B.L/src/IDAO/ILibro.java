package IDAO;

import java.util.List;

import Ver.Libro;

public interface ILibro {
	List<Libro> obtenerLibros();
	Libro obtenerLibro(int id);
	void agregarLibro(Libro libro);
	boolean actualizarLibro(int id, Libro libro);
	boolean eliminarLibro(int id);
	
}