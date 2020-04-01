package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Livro;
import entidades.Usuario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Usuario> list = new ArrayList<>();
		try {
			System.out.println("Quantos Alunos deseja cadastrar? ");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {

				System.out.println("Digite os dados ->");
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Matricula: ");
				Integer matricula = sc.nextInt();
				System.out.print("Curso: ");
				sc.nextLine();
				String curso = sc.nextLine();
				Usuario usuario = new Usuario(nome, matricula, curso);
				list.add(usuario);
				System.out.println("-------------------------------");
				System.out.println("Quantidade de alugueis se limita a 3 livros por usuario");
				System.out.println("Quantos livros deseja usar? ");
				int n2 = sc.nextInt();

				for (int j = 1; j <= n2; j++) {

					System.out.println("Digite os dados do livro para prosseguir");
					System.out.println("Titulo do livro: ");
					sc.nextLine();
					String titulo = sc.nextLine();
					System.out.println("Codigo ISBN: ");
					Integer isbn = sc.nextInt();
					Livro livro = new Livro(titulo, isbn);
					usuario.addQuantLivros(livro);
					System.out.println("-------------------------------");
				}
			}
			System.out.println("-------------------------------");
			for (Usuario obj : list) {
				System.out.println(obj);
			}
		} catch (RuntimeException e) {
			System.out.println("Erro Inesperado!");
			System.out.println("Reinicie o Programa e verifique se esta fazendo correto!");
		}
		sc.close();
	}

}
