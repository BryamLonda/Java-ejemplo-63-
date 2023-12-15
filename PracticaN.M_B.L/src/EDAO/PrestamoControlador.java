package EDAO;

import java.util.List;

import DAO.PrestamoDAO;
import Ver.Libro;
import Ver.Prestamo;
import Ver.Usuario;
import Vistas.PrestamoVista;



public class PrestamoControlador {
	private PrestamoDAO prestamodao;
	private Prestamo prestamo;
	private PrestamoVista prestamovista;
	public PrestamoControlador(PrestamoDAO prestamodao, PrestamoVista prestamovista) {
		this.prestamodao=prestamodao;
		this.prestamovista=prestamovista;
	}
	//Pide el id 
	public int obtenerIdU() {
		return prestamovista.ingresarDatosU();
	}
	//Genera un prestamo 
	public Prestamo crearPrestamo(Usuario usuario, List<Libro> listaLibros,int id) {
		for(Libro libro:listaLibros) {
			if(libro.getId()==id) {
				prestamo=new Prestamo(libro,usuario);
				prestamodao.agregarPrestamo(prestamo);
				return prestamo;
			}
		}
		if(prestamo==null) {
			prestamovista.mostrarM("Libro no encontrado");
		}
		return null;
	}
	//Buscar un prestamo 
	public void buscarPrestamo(int id) {
        prestamo = prestamodao.obtenerPrestamo(id);
        if(prestamo == null){
            prestamovista.mostrarM("Prestamo no encontrado");
        }else{
            prestamovista.mostrarInformacion(prestamo.getLibro(),prestamo.getUsuario());
        }
    }
	//Demuestra lista de prestamos
	public void mostrarPrestamos(List<Prestamo> listaPrestamos){
        for (Prestamo prestamo : listaPrestamos) {
            prestamovista.mostrarInformacion(prestamo.getLibro(),prestamo.getUsuario());
        }
	}
}

