package Practica_BryanLonda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Biblioteca {
    List<Usuario> usuarios;
    List<Libro> libros;
    List<Prestamo> prestamos;
    Scanner scanner;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.libros = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void registrarUsuario() {
        System.out.println("Ingrese el nombre del usuario:");
        String nombreUsuario = scanner.nextLine();
        Usuario usuario = new Usuario(nombreUsuario);
        usuarios.add(usuario);
        System.out.println("Usuario registrado en la biblioteca: " + usuario.nombre);
    }

    public void agregarLibro() {
        System.out.println("Ingrese el título del libro:");
        String tituloLibro = scanner.nextLine();
        Libro libro = new Libro(tituloLibro);
        libros.add(libro);
        System.out.println("Libro agregado al inventario: " + libro.titulo);
    }

    public void realizarPrestamo() {
        System.out.println("Ingrese el nombre del usuario que realizará el préstamo:");
        String nombreUsuario = scanner.nextLine();
        Usuario usuario = encontrarUsuarioPorNombre(nombreUsuario);

        if (usuario != null) {
            System.out.println("Ingrese el título del libro a prestar:");
            String tituloLibro = scanner.nextLine();
            Libro libro = encontrarLibroPorTitulo(tituloLibro);

            if (libro != null) {
                if (!libro.estaPrestado()) {
                    libro.prestar();
                    Prestamo prestamo = new Prestamo(usuario, libro);
                    prestamos.add(prestamo);
                    System.out.println("Préstamo realizado a " + usuario.nombre + " - Libro: " + libro.titulo);
                } else {
                    System.out.println("El libro ya está prestado.");
                }
            } else {
                System.out.println("Libro no encontrado.");
            }
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    private Usuario encontrarUsuarioPorNombre(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.nombre.equals(nombreUsuario)) {
                return usuario;
            }
        }
        return null;
    }

    private Libro encontrarLibroPorTitulo(String tituloLibro) {
        for (Libro libro : libros) {
            if (libro.titulo.equals(tituloLibro)) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarInventario() {
        System.out.println("Inventario de la biblioteca:");
        for (Libro libro : libros) {
            libro.mostrarInformacion();
        }
    }

    public void mostrarPrestamos() {
        System.out.println("Préstamos realizados:");
        for (Prestamo prestamo : prestamos) {
            prestamo.mostrarInformacion();
        }
    }
}