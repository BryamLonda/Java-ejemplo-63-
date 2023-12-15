package IDAO;

import java.util.List;

import Ver.Prestamo;

public interface IPrestamo {
	List<Prestamo> obtenerPrestamos();
	Prestamo obtenerPrestamo(int id);
	void agregarPrestamo(Prestamo prestamo);
	boolean actualizarPrestamo(int id, Prestamo prestamo);
	boolean eliminarPrestmao(int id);
}