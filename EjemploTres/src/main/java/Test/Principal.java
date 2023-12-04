package Test;

import java.util.ArrayList;
import java.util.List;

import Clase.Empleado;
import Clase.EmpleadoAsalariado;
import Clase.EmpleadoPorComision;
import Clase.EmpleadoPorContrato;
import Clase.EmpleadoPorHoras;

public class Principal {
	//metodo cuadrado con argumento int
	public static int cuadrado(int valorInt) {
		
		return valorInt * valorInt;
	}// fin del metodo cuadrado con argumento int
	
	//metodo cuadrado con argumento double
	public static double cuadrado(double valorDouble) {
		
		return valorDouble * valorDouble;
	}// fin del metodo cuadrado con argumento int

	public static void main (String [] arg) {
		
		//prueba los metodos cuadrado sobrecargados
		/*
		System.out.println("El cuadrado del entero 7 es \n"+ cuadrado(7));
		System.out.println("El cuadrado del entero 7.5 es \n"+ cuadrado(7.5));
		
		EmpleadoPorComision a1=new EmpleadoPorComision(1000,0.1,100);
		System.out.print(a1.calcularSalario());
		
		//Comparar con equals
		Empleado empleado1 = new Empleado("010232");
		Empleado empleado2 = new Empleado("01022");
		System.out.println("Empleado1 es igual a Empleado2: "+ empleado1.equals(empleado2));
			
			
		System.out.println("Empleado1 hashCode: " + empleado1.hashCode());
		System.out.println("Empleado1 hashCode: " + empleado2.hashCode());
		*/
		//Transformar tipos de datos
		/*
		long num1=100;
		int num2=(int)num1;
		
		System.out.println(num1);
		System.out.println(num2);
		*/
		
		List<Empleado> empleados = new ArrayList<>();
		Empleado empleadoUno = new EmpleadoAsalariado(6, 800, 2, "0101","Pepito","Perez","Jefe");
		empleadoUno.aumentarNumeroDeEmpleados();
		Empleado empleadoDos = new EmpleadoPorComision(1000, 10, 400, "0101","Pepito","Perez");
		empleadoDos.aumentarNumeroDeEmpleados();
		Empleado empleadoTres = new EmpleadoPorHoras(160, 4, "0101","Pepito","Perez");
		empleadoTres.aumentarNumeroDeEmpleados();
		Empleado empleadoCuatro= new EmpleadoPorContrato(400,80,"010203","Pepito","Perez");
		empleadoCuatro.aumentarNumeroDeEmpleados();
		
		//Empleado.numeroDeEmpleados = 10;
		System.out.println("Numero de empleados: "+Empleado.numeroDeEmpleados);
		System.out.println("Valor de PI: "+Math.PI);
		System.out.println("Cual es la multa si llego tarde 5 horas? "+Empleado.calcularMulta(5));
		System.out.println("El numero 5 es mayor a 2? "+Math.max(5, 2));

		empleados.add(empleadoUno);
		empleados.add(empleadoDos);
		empleados.add(empleadoTres);
		empleados.add(empleadoCuatro);
		
		for (Empleado empleado : empleados) {
			System.out.println(empleado.toString());
			System.out.println(empleado.calcularSalario());
			if (empleado instanceof EmpleadoPorHoras) {
				EmpleadoPorHoras miEmpleado = (EmpleadoPorHoras) empleado;
				System.out.println("Horas trabajadas: "+miEmpleado.getNumeroDeHorasTrabajadas());
			}else if (empleado instanceof EmpleadoAsalariado) {
				EmpleadoAsalariado miEmpleado = (EmpleadoAsalariado) empleado;
				System.out.println("Años de Antiguedad: "+miEmpleado.getAniosAntiguedad());
				miEmpleado.registrarEntrada();
				miEmpleado.registraSalida();
				miEmpleado.visualizarAtrasos();
			}else if (empleado instanceof EmpleadoPorComision) {
				EmpleadoPorComision miEmpleado = (EmpleadoPorComision) empleado;
				System.out.println("Total de Ventas: "+miEmpleado.getTotalDeVentas());
			}else if (empleado instanceof EmpleadoPorContrato) {
				EmpleadoPorContrato miEmpleado = (EmpleadoPorContrato) empleado;
				System.out.println("La multa es: "+miEmpleado.getMulta());
				
			}
			
			
		}
	}
		/*
	Integer var = new Integer(42);
	byte b = var.byteValue();
	short a = var.shortValue();
	double d = var.doubleValue();
	
	
	double d4 = Double.parseDouble("3.14");
	long L2 = Long.parseLong("101010",2);
	Long L3 = Long.valueOf("101010",2);
	
	Double d1 = new Double("3.14");
	System.out.println("d= "+ d1.toString());
	
	}
	*/
	
}
