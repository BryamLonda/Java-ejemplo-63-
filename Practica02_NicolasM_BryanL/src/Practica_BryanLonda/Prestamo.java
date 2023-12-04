package Practica_BryanLonda;

class Prestamo {
	 Usuario usuario;
	 Libro libro;

	 public Prestamo(Usuario usuario, Libro libro) {
	     this.usuario = usuario;
	     this.libro = libro;
	 }

	 void mostrarInformacion() {
	     System.out.println("Préstamo - Usuario: " + usuario.nombre + ", Libro: " + libro.titulo);
	 }
	}