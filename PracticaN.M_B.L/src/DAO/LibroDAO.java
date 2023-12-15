package DAO;

import java.util.ArrayList;
import java.util.List;

import IDAO.ILibro;
import Ver.Libro;

public class LibroDAO<listaLibros> implements ILibro {
	List<Libro> listaLibros;
	public LibroDAO() {
		listaLibros=new ArrayList<Libro>();
	}
	@Override
	public List<Libro> obtenerLibros() {
		return listaLibros;
	}
	@Override
	public Libro obtenerLibro(int id) {
		for(Libro libro:listaLibros) {
			if(libro.getId()==id) {
				return libro;
			}
		}
		return null;
	}
	@Override
	public void agregarLibro(Libro libro) {
		listaLibros.add(libro);
	}

	@Override
	public boolean actualizarLibro(int id, Libro libro) {
		for(int i=0;i<listaLibros.size();i++) {
			if(listaLibros.get(i).getId()==id) {
				listaLibros.set(i, libro);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean eliminarLibro(int id) {
		for(int i=0;i<listaLibros.size();i++) {
			if(listaLibros.get(i).getId()==id) {
				listaLibros.remove(i);
				return true;
			}
		}
		return false;
	}

}