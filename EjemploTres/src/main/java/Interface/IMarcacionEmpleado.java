package Interface;

public interface IMarcacionEmpleado {
	
	public static final int MINUTOS_DE_ATRASO_PERMITIDO = 8;
	
	public abstract void registrarEntrada();
	public abstract void registraSalida();
	int visualizarAtrasos();
		
	

}
