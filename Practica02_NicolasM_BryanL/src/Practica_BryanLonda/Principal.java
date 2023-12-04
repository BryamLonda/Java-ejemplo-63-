package Practica_BryanLonda;

import java.util.Scanner;

public class Principal {
	public class Main {
	    public static void main(String[] args) {
	        
	        Biblioteca biblioteca = new Biblioteca();

	      
	        while (true) {
	            System.out.println("\n----- Menú -----");
	            System.out.println("1. Registrar usuario");
	            System.out.println("2. Agregar libro");
	            System.out.println("3. Realizar préstamo");
	            System.out.println("4. Mostrar inventario");
	            System.out.println("5. Mostrar préstamos");
	            System.out.println("0. Salir");

	            Scanner scanner = new Scanner(System.in);
	            int opcion = scanner.nextInt();
	            scanner.nextLine();
	            scanner.close();

	            switch (opcion) {
	                case 1:
	                    biblioteca.registrarUsuario();
	                    break;
	                case 2:
	                    biblioteca.agregarLibro();
	                    break;
	                case 3:
	                    biblioteca.realizarPrestamo();
	                    break;
	                case 4:
	                    biblioteca.mostrarInventario();
	                    break;
	                case 5:
	                    biblioteca.mostrarPrestamos();
	                    break;
	                case 0:
	                    System.out.println("Gracias :).");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
	            }
	        }
	    }
	}
}