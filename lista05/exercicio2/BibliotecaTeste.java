package lista05.exercicio2;

public class BibliotecaTeste {
	public static void main(String[] args) {
		Biblioteca utfpr = new Biblioteca();
		
		utfpr.adicionarLivro("Lua Nova", "Stephen hawk", 1990, "Livre Livros", 55);
		utfpr.adicionarLivro("Lua Cheia", "Stephen Calk", 2000, "Livre Livros", 900);
		utfpr.adicionarLivro("Lua Minguante", "Stephen Cruz", 1970, "Livre Livros", 500);
		utfpr.adicionarLivro("Lua Crescente", "Stephen Crook", 1950, "Livre Livros", 212);
		
		utfpr.verificarDisponibilidade("Lua Nova");
		utfpr.efetuarEmprestimo("Lua Nova", 5);
		utfpr.efetuarDevolucao("Lua Nova", 8);
		utfpr.efetuarEmprestimo("Lua Minguante", 9);
		utfpr.efetuarDevolucao("Lua Nova", 40);
		utfpr.efetuarDevolucao("Lua Minguante", 30);
	}

}
