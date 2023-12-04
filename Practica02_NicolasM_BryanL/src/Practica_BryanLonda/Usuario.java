package Practica_BryanLonda;


class Usuario extends Persona {
 public Usuario(String nombre) {
     super(nombre);
 }

 @Override
 void mostrarInformacion() {
     System.out.println("Usuario: " + nombre);
 }
}