package lista02.exercicio4;

/*Uma biblioteca deseja manter catalogados todos os seus livros. Você foi contratado para
desenvolver este sistema. Sabe-se que o livro é formado pelo seu título, autor, editora, número
de páginas, ano de publicação e situação. O atributo “situação” controla se o livro está
disponível ou não para empréstimo. Logo, esta biblioteca realiza empréstimos e devoluções
dos livros aos seus usuários. Para realizar o empréstimo de um livro, é necessário que o
mesmo esteja disponível, ou seja, que já não tenha sido emprestado anteriormente. Para
realizar a devolução de um livro, o mesmo deve estar como situação indisponível, ou seja,
estar emprestado. Outra funcionalidade que deve ser possível é a exibição em tela dos dados 
UNIVERSIDADE TECNOLÓGICA FEDERAL DO PARANÁ
CAMPUS PONTA GROSSA
DEPARTAMENTO ACADÊMICO DE INFORMÁTICA
do livro, como uma espécie de relatório, contendo o título, autor, editora, número de páginas,
ano de publicação e a situação do livro (se está ou não disponível).
Exemplo: “Java – Como Programar, Paul Deitel, Editora Pearson, 968 páginas, 2016,
disponível para empréstimo”.
Para efetuar a instanciação dos livros, definição dos valores de seus atributos e invocar os
métodos de empréstimo, devolução ou relatórios, utilize uma classe de teste.
*/

public class Livro {
	String titulo, autor, editora;
	int numPaginas, anoPublicacao;
	private boolean situacao = false;
	
	public Livro(String titulo, String autor, String editora, boolean situacao, int numPaginas, int anoPublicacao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.situacao = situacao;
		this.numPaginas = numPaginas;
		this.anoPublicacao = anoPublicacao;
	}
	
	public void emprestarLivro() {
		if(situacao == false) {
			System.out.println("Livro: " +  titulo + " indisponível.");
		}
		else {
			System.out.println("Livro: " +  titulo + " emprestado com sucesso.");
			situacao = false;
		}
	}
	
	public void devolverLivro() {
		if(situacao == true) {
			System.out.println("Livro: " +  titulo + " não foi emprestado.");
		}
		else {
			System.out.println("Livro: " +  titulo + " devolvido com sucesso.");
			situacao = true;
		}
	}
	
}
