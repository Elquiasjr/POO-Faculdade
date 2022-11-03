package lista05.exercicio2;

/*Cada livro é identificado pelo seu título, autor, ano de publicação, editora, número total de
páginas e disponibilidade.*/

public class Livro {

	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String editora;
	private int numPaginas;
	private boolean disponibilidade;
	private int diaEmprestimo;
	
	public Livro(String titulo, String autor, int anoPublicacao, String editora, int numPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.numPaginas = numPaginas;
		this.disponibilidade = true;
	}
	
	public void verificarDisponibilidadeLivro() {
		if(this.disponibilidade) {
			System.out.println("Livro Disponível!\n");
		}
		else {
			System.out.println("Livro Indisponível\n");
		}
	}
	
	public void efetuarEmprestimoLivro(int dia) {
		if(this.disponibilidade == true) {
			this.diaEmprestimo = dia;
			this.disponibilidade = false;
			System.out.println("Sucesso ao emprestar!\n");
		}
		else {
			System.out.println("Falha. Livro emprestado!\n");
		}
	}
	
	public void efetuarDevolucaoLivro(int diaDevolucao) {
		if(this.disponibilidade == false) {
			double valorMulta = diaDevolucao - diaEmprestimo > 7? (diaDevolucao - diaEmprestimo)* 1.50: 0 ;
			this.disponibilidade = true;
			System.out.println("O valor da multa: R$" + valorMulta + "\n");
		}
		else {
			System.out.println("Livro não emprestado!\n");
		}
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}
}
