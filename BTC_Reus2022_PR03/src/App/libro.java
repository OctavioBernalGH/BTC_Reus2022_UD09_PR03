package App;

public class libro {
	// Creamos las variables
	private boolean isbn;
	private String titulo;
	private String autor;
	private int numPaginas;
	
	// Creamos el constructor
	public libro(boolean isbn, String titulo, String autor, int numPaginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	// Creamos los Getters y Setters
	public boolean isIsbn() {
		return isbn;
	}

	public void setIsbn(boolean isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	// Creamos el toString
	@Override
	public String toString() {
		return "libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + "]";
	}
	
	
	
	
}
