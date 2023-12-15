package EDAO;

import java.util.List;

import DAO.LibroDAO;
import Ver.Libro;
import Vistas.LibroVista;

public class LibroControlador {
	private LibroDAO librodao;
	private LibroVista librovista;
	private Libro libro;
	public LibroControlador(LibroDAO librodao, LibroVista librovista) {
		this.librodao=librodao;
		this.librovista=librovista;	
	}
	public void crearLibro() {
		libro=librovista.ingresarDatos();
		librodao.agregarLibro(libro);
	}
	public int prestarLibro() {
		return librovista.eliminarLibro();
	}
	public int devolverLibro() {
		return librovista.devolverLibro();
	}
	public void atualizarLibro() {
		libro=librovista.actualizarLibro();
		if(librodao.actualizarLibro(libro.getId(), libro) == true){
            librovista.mostrarM("Los datos se han actualizado.");                    
        }
		else{
            librovista.mostrarM("Ocurrio un error.");                    
        
        }
	}
	public void eliminarLibro(){
        int id =librovista.eliminarLibro();
        if(librodao.eliminarLibro(id) == true){
            librovista.mostrarM("Libro eliminado.");                    
        }
        else{
            librovista.mostrarM("Ocurrio un error.");
        }
    }
	public void buscarLibro() {
		int id = librovista.buscarLibro();
        libro = librodao.obtenerLibro(id);
        if(libro == null){
            librovista.mostrarM("Libro no encontrado");
        }else{
            librovista.mostrarInformacion(libro);
        }
    }
	public int getId() {
		return librovista.buscarLibro();
	}
	public void mostrarLibro(Libro libro) {
		librovista.mostrarInformacion(libro);
	}
	public void mostrarLibros(List<Libro> listaLibros){
        for (Libro libro : listaLibros) {
        	if(libro.isDisponible()==true) {
            librovista.mostrarInformacion(libro);
        	}
        }
	} 
}