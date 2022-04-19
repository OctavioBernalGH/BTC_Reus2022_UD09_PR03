package App;

public class MainApp {

	public static void main(String[] args) {
		//Creamos las variables con los libros
		Libro libro1 = new Libro("101", "La astronauta", "S. K. Vaughn", 700);
		Libro libro2 = new Libro("202", "Retrum", "Francesc Miralles", 650);

		// Imprimimos el contenido de cada libro
		System.out.println(libro1);
		System.out.println(libro2);
		System.out.println();
		
		//Llamamos el metodo para comparar cuantas paginas tiene cada libro
		System.out.println("COMPARAMOS LAS PAGINAS");
		compararPaginas(libro1, libro2);

	}

	// Funcion para comparar paginas
	public static void compararPaginas(Libro libro1, Libro libro2) {
		// Si el libro1 tiene mas paginas que el libro2
		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println("El libro de " + libro1.getAutor() + " llamado " + libro1.getTitulo() + " tiene mas paginas que " + libro2.getTitulo() + " de " + libro2.getAutor());
			
		// Si el libro2 es mas grande que el libro1
		} else {
			System.out.println("El libro de " + libro2.getAutor() + " llamado " + libro2.getTitulo() + " tiene mas paginas que " + libro1.getTitulo() + " de " + libro1.getAutor());
			
		}
	}
}