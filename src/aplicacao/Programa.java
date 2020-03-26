package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Livro;
import entidades.Usuario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo a biblioteca! ");
		System.out.println("Digite seus dados ->");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Matricula: ");
		Integer matricula = sc.nextInt();
		System.out.print("Curso: ");
		sc.nextLine();
		String curso = sc.nextLine();
		Usuario usuario = new Usuario(nome, matricula, curso);
		System.out.println("-------------------------------");
		System.out.println("Quantidadede alugueis se limita a 3 livros por usuario");
		System.out.println("Quantos livros deseja usar? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Digite os dados do livro para prosseguir: ");
			System.out.println("Titulo do livro: ");
			sc.nextLine();
			String titulo = sc.nextLine();
			System.out.println("Codigo ISBN: ");
			Integer isbn = sc.nextInt();
			Livro livro = new Livro(titulo, isbn);
			usuario.addQuantLivros(livro);
			System.out.println("-------------------------------");

		}
		System.out.println("-------------------------------");
		System.out.println(usuario);

		sc.close();
	}

}
