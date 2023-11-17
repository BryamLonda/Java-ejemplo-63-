package clases;

public class Musica extends Producto{
	//Atributos de la clase
	private String artista;
	private String genero;
	//Define los atributos del objeto
	public Musica() {
		super("0201",45.0);
		this.artista="Gatito Bellaco";
		this.genero="Pop";
	}
	//Constructor con parametros
	public Musica(String artista, String genero,String id,Double precio) {
		super(id,precio);
		this.artista = artista;
		this.genero = genero;
	}
	//Getters, Setters y toString
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Album musical [Artista: " + artista + ", Genero: " + genero+super.toString();
	}
}