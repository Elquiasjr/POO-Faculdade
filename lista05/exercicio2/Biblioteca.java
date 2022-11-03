package lista05.exercicio2;

import java.util.List;

import java.util.ArrayList;
/*Desenvolva um sistema para a biblioteca da UTFPR. A biblioteca deve controlar os N livros de ser
acervo. Cada livro é identificado pelo seu título, autor, ano de publicação, editora, número total de
páginas e disponibilidade. Essa última é responsável por determinar se um livro está ou não disponível
para ser emprestado. 
O sistema deve permitir que a biblioteca: (i) possa verificar a disponibilidade de
um livro específico, para isso, deve saber o título para que seja possível realizar a busca; 

(ii) efetuar empréstimo de um livro, para isso, é necessário saber o título do livro e o dia que está sendo efetuado
a tentativa de empréstimo. O empréstimo só deverá ocorrer se o livro estiver disponível; e 

(iii) efetuar a devolução de um livro que está emprestado. Para isso, é necessário saber o título do livro que está
sendo devolvido e o dia que está ocorrendo a devolução. Após realizar a devolução, deve-se verificar
se há multa a ser cobrada. Sabe-se que o livro pode ser emprestado durante 7 dias sem gerar multa,
caso seja extrapolado esse período, deve-se gerar multa de R$1,50 por dia de atraso. A fim de
simplificar o exercício, adote apenas valores inteiros para determinar o dia de empréstimo e devolução
dos livros. Exemplo. O livro foi emprestado dia 5 e devolvido de 11, sem a necessidade de determinar
do mês que ocorreu o empréstimo/devolução. Desconsidere que o livro pode ser emprestado em uma
data posterior ao ser devolvido, como por exemplo, emprestar dia 5 e devolver dia 3.*/

public class Biblioteca {
	List<Livro> livros;
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao, String editora, int numPaginas) {
		Livro livro = new Livro(titulo, autor, anoPublicacao, editora, numPaginas);
		this.livros.add(livro);
	}
	
	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
	}
	
	public void verificarDisponibilidade(String titulo) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equals(titulo)) {
				livro.verificarDisponibilidadeLivro();
				return;
			}
		}
		System.out.println("Livro não encontrado!\n");
	}
	
	public void efetuarEmprestimo(String titulo, int diaEmprestimo) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equals(titulo)) {
				livro.efetuarEmprestimoLivro(diaEmprestimo);
				return;
			}
		}
		System.out.println("Livro não encontrado!\n");
	}
	
	public void efetuarDevolucao(String titulo, int diaDevolucao) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equals(titulo)) {
				livro.efetuarDevolucaoLivro(diaDevolucao);
				return;
			}
		}
		System.out.println("Livro não encontrado!\n");
	}

	
}
