package Clase;

import java.util.Date;

import Interface.IMarcacionEmpleado;

public class EmpleadoAsalariado extends Empleado implements IMarcacionEmpleado {
	
	private int aniosAntiguedad;
	private int salario;
	private int cargasFamiliares;
	
	public EmpleadoAsalariado() {
		
	}
	

	public EmpleadoAsalariado(int aniosAntiguedad, int salario, int cargasFamiliares,String cedula, String nombre, String apellido,String cargo) {
		super(cedula, nombre, apellido,cargo);
		this.aniosAntiguedad = aniosAntiguedad;
		this.salario = salario;
		this.cargasFamiliares = cargasFamiliares;
	}


	public EmpleadoAsalariado(String cedula, String nombre, String apellido, Date fechaDeNacimiento, String telefono,
			String direccion, String cargo, int aniosAntiguedad, int salario, int cargasFamiliares) {
		super( cedula, nombre, apellido, fechaDeNacimiento, telefono, direccion, cargo);
		this.aniosAntiguedad = aniosAntiguedad;
		this.salario = salario;
		this.cargasFamiliares = cargasFamiliares;
	}

	public int getAniosAntiguedad() {
		return aniosAntiguedad;
	}

	public void setAniosAntiguedad(int aniosAntiguedad) {
		this.aniosAntiguedad = aniosAntiguedad;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getCargasFamiliares() {
		return cargasFamiliares;
	}

	public void setCargasFamiliares(int cargasFamiliares) {
		this.cargasFamiliares = cargasFamiliares;
	}
	
	
	@Override
	public double calcularSalario() {
		double pagoAntiguedad = 0.00;
		double pagoCargasFamiliares = 0.00;
		
		if(aniosAntiguedad>=2 && aniosAntiguedad<=5) {
			pagoAntiguedad=80;
		}else if (aniosAntiguedad>=6 && aniosAntiguedad<=8) {
			pagoAntiguedad=120;
		}else if (aniosAntiguedad>=9 && aniosAntiguedad<=14) {
			pagoAntiguedad=130;
		}else if (aniosAntiguedad>=15) {
			pagoAntiguedad=200;
		}
		
		if(cargasFamiliares==1) {
			pagoCargasFamiliares=30;
		}else if(cargasFamiliares==2) {
			pagoCargasFamiliares=70;
		}else if(cargasFamiliares>=3) {
			pagoCargasFamiliares=100;
		}
		
		return (salario+pagoAntiguedad+pagoCargasFamiliares);
	}
	
	public double calcularSalario(double extra) {
		return this.calcularSalario()+ extra;
	}

	@Override
	public String toString() {
		return super.toString() + "EmpleadoAsalariado [aniosAntiguedad=" + aniosAntiguedad + ", salario=" + salario + ", cargasFamiliares="
				+ cargasFamiliares + "]";
	}


	@Override
	public void registrarEntrada() {
		System.out.println("Se ha registrado su entrada correctamente");
		
	}


	@Override
	public void registraSalida() {
		System.out.println("Se ha registrado su salida correctamente");
		
	}


	@Override
	public int visualizarAtrasos() {
		System.out.println("Usted es un empleado ejemplar, bie hecho");
		return 0;
	}
	
	
	

}
