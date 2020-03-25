package entidades;

public class Livro {

	private String titulo;
	private Integer isbn;
	
	public Livro() {
	}

	public Livro(String titulo, Integer isbn) {
		this.titulo = titulo;
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	
	
}
