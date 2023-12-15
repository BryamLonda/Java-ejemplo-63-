package EDAO;

import java.util.List;

import DAO.BibliotecaDAO;
import Ver.Biblioteca;
import Ver.Libro;
import Ver.Usuario;
import Vistas.BibliotecaVista;

public class BibliotecaControlador {
	private Biblioteca biblioteca;
	private BibliotecaDAO bibliotecadao;
	private BibliotecaVista bibliotecavista;
	public BibliotecaControlador(BibliotecaDAO bibliotecadao, BibliotecaVista bibliotecavista) {
		this.bibliotecadao=bibliotecadao;
		this.bibliotecavista=bibliotecavista;
	}
	//Crea la biblioteca 
	public void crearBiblioteca() {
		this.biblioteca=new Biblioteca("Biblioteca CCE","Calle Luis Cordero");
	}
	//Devuelve los libros registrados
	public List<Libro> verLibros() {
		List<Libro> lista=bibliotecadao.verLibros();
		return lista;
	}
	//Retorna un libro segun el id de libro
	public Libro verLibro(int id) {
		if(bibliotecadao.buscarLibro(id)==null) {
			bibliotecavista.mostrarM("Libro no encontrado");
		}
		else {
			return bibliotecadao.buscarLibro(id);
		}
		return null;
	}
	//Retorna un usuario segun el id
	public Usuario verUsuario(int id) {
		if(bibliotecadao.buscarUsuario(id)==null) {
			bibliotecavista.mostrarM("Usuario no encontrado");
		}
		else {
			return bibliotecadao.buscarUsuario(id);
		}
		return null;
	}
	//Registra un libro 
	public void agregarLibro(Libro libro) {
		bibliotecadao.agregarLibro(libro);
	}
	//Registra un usuario 
	public void agregarUsuario(Usuario usuario) {
		if(bibliotecadao.buscarUsuario(usuario)==false) {
			bibliotecadao.registrarUsuario(usuario);
		}
		else {
			bibliotecavista.mostrarM("Usuario ya registrado");
		}
	}
	public void actualizarLibro(Libro libro) {
		bibliotecadao.actualizarListaLibro(libro);
	}
	public void actualizarUsuario(Usuario usuario){
		bibliotecadao.actualizarListaUsuario(usuario);
	}
	//Prestar un libro
	public void prestarLibro(Libro libro) {
		//Disponibilidad de un libro
		bibliotecadao.actualizardispLibro(libro, false);
		bibliotecavista.prestarLibro();
	}
	//Devolver un libro
	public void devolverLibro(Libro libro) {
		//Disponibilidad del libro
		bibliotecadao.actualizardispLibro(libro, true);
		bibliotecavista.devolverLibro();
	}
}