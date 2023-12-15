package Vistas;

import java.util.Scanner;

public class BibliotecaVista {
	private Scanner scan;
	public BibliotecaVista() {
		scan=new Scanner(System.in);
	}
	public void prestarLibro() {
		System.out.println("---------------------------------------------");
		System.out.println("Libro prestado y retirado!");
		System.out.println("Enter para seguir");
		System.out.println("---------------------------------------------");
		Scanner esp=new Scanner(System.in);
		String es=esp.nextLine();
	}
	public void devolverLibro() {
		System.out.println("---------------------------------------------");
		System.out.println("Libro devuelto !");
		System.out.println(" Enter para seguir");
		System.out.println("---------------------------------------------");
		Scanner esp=new Scanner(System.in);
		String es=esp.nextLine();
	}
	public void mostrarM(String m) {
		System.out.println(m);
	}
}
