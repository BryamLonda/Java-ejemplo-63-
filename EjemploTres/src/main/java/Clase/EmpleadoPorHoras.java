package Clase;

import java.util.Date;

public class EmpleadoPorHoras extends Empleado {
	
	private int numeroDeHorasTrabajadas;
	private double valorHoraTrabajada;
	
	public EmpleadoPorHoras() {
		
	}
	

	public EmpleadoPorHoras(int numeroDeHorasTrabajadas, double valorHoraTrabajada,String cedula, String nombre, String apellido) {
		super(cedula, nombre, apellido);
		this.numeroDeHorasTrabajadas = numeroDeHorasTrabajadas;
		this.valorHoraTrabajada = valorHoraTrabajada;
	}


	public EmpleadoPorHoras(String cedula, String nombre, String apellido, Date fechaDeNacimiento, String telefono,
			String direccion, String cargo, int numeroDeHorasTrabajadas, double valorHoraTrabajada) {
		super( cedula, nombre, apellido, fechaDeNacimiento, telefono, direccion, cargo);
		this.numeroDeHorasTrabajadas = numeroDeHorasTrabajadas;
		this.valorHoraTrabajada = valorHoraTrabajada;
	}

	public int getNumeroDeHorasTrabajadas() {
		return numeroDeHorasTrabajadas;
	}

	public void setNumeroDeHorasTrabajadas(int numeroDeHorasTrabajadas) {
		this.numeroDeHorasTrabajadas = numeroDeHorasTrabajadas;
	}

	public double getValorHoraTrabajada() {
		return valorHoraTrabajada;
	}

	public void setValorHoraTrabajada(double valorHoraTrabajada) {
		this.valorHoraTrabajada = valorHoraTrabajada;
	}

	@Override
	public String toString() {
		return "EmpleadoPorHoras [numeroDeHorasTrabajadas=" + numeroDeHorasTrabajadas + ", valorHoraTrabajada="
				+ valorHoraTrabajada + "]";
	}


	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
