package Practica_BryanLonda;


abstract class Persona {
 String nombre;

 public Persona(String nombre) {
     this.nombre = nombre;
 }

 abstract void mostrarInformacion();
}