package Practica_BryanLonda;


class Libro implements Prestable {
 String titulo;
 boolean prestado;

 public Libro(String titulo) {
     this.titulo = titulo;
     this.prestado = false;
 }

 @Override
 public void prestar() {
     if (!prestado) {
         prestado = true;
         System.out.println("Libro prestado: " + titulo);
     } else {
         System.out.println("El libro ya está prestado.");
     }
 }

 @Override
 public void devolver() {
     if (prestado) {
         prestado = false;
         System.out.println("Libro devuelto: " + titulo);
     } else {
         System.out.println("El libro no está prestado.");
     }
 }

 @Override
 public boolean estaPrestado() {
     return prestado;
 }

 void mostrarInformacion() {
     System.out.println("Libro: " + titulo);
 }
}