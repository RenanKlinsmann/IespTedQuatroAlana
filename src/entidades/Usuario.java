package entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nome;
	private Integer matricula;
	private String curso;
	
	private List<Livro> livros = new ArrayList<>(); 
	
	public Usuario() {
	}

	public Usuario(String nome, Integer matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

    public List<Livro> getLivro(){
    	return livros;
    }

	public void addQuantLivros(Livro livro) {
		livros.add(livro);
	}
	public void removeQuantLivros(Livro livro) {
		livros.remove(livro);
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Dados do Aluno:\n");
		sb.append(nome + "\n");
		sb.append(matricula +"\n" );
		sb.append(curso + "\n");
		sb.append("Livros Escolhidos:\n");
		for (Livro l  : livros) {
			sb.append(l.getTitulo() + "\n");
			sb.append(l.getIsbn() + "\n");
		}
		return sb.toString();
	}
	
	
	
}
