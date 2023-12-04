package Clase;

import Interface.IMarcacionEmpleado;

public class EmpleadoPorComision extends Empleado implements IMarcacionEmpleado {
	private double totalDeVentas;
	private double porcentajeComision;
	private double salario;
	
	public EmpleadoPorComision() {
		
	}
	
	
	public EmpleadoPorComision(double totalDeVentas, double porcentajeComision, double salario, String cedula, String nombre, String apellido) {
		super(cedula, nombre, apellido);
		this.totalDeVentas = totalDeVentas;
		this.porcentajeComision = porcentajeComision;
		this.salario = salario;
	}

	public double getTotalDeVentas() {
		return totalDeVentas;
	}

	public void setTotalDeVentas(double totalDeVentas) {
		this.totalDeVentas = totalDeVentas;
	}

	public double getPorcentajeComision() {
		return porcentajeComision;
	}

	public void setPorcentajeComision(double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double calcularSalario() {
		double pagoComision=0.00;
		
		pagoComision=totalDeVentas*porcentajeComision;
		
		return(salario+pagoComision); 
	}

	@Override
	public String toString() {
		return "EmpleadoPorComision [totalDeVentas=" + totalDeVentas + ", porcentajeComision=" + porcentajeComision
				+ ", salario=" + salario + "]";
	}


	@Override
	public void registrarEntrada() {
		System.out.println("Ha llegado tarde no lo vuleva haver");
		
	}


	@Override
	public void registraSalida() {
		System.out.println("Ha salido muy pronto no lo vuelva a repetir");
		
	}


	@Override
	public int visualizarAtrasos() {
		System.out.println("Deberiamos despedirlo");
		return 0;
	}
	
	
	

}
