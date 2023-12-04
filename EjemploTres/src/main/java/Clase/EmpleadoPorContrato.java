package Clase;

public final class EmpleadoPorContrato extends Empleado {
	
	private double montoTotal;
	private double multa;
	
	public EmpleadoPorContrato() {
		
	}
	public EmpleadoPorContrato(double montoTotal, double multa, String cedula) {
		super(cedula);
		this.montoTotal = montoTotal;
		this.multa = multa;
	}
	
	
	public EmpleadoPorContrato(double montoTotal, double multa,String cedula, String nombre, String apellido) {
		super(cedula, nombre, apellido);
		this.montoTotal = montoTotal;
		this.multa = multa;
	}


	public double getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	public double getMulta() {
		return multa;
	}
	public void setMulta(double multa) {
		this.multa = multa;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+ "\nEmpleadoPorContrato [montoTotal=" + montoTotal + ", multa=" + multa + "]";
	}
	@Override
	public double calcularSalario() {
		return montoTotal-multa;
	}

}
