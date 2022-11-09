package lista06.exercicio1;

/*Crie uma classe Pessoa, que possui um nome (String), nascimento (String), rg (long) e cpf (long). Nesta
mesma classe, implemente um método construtor que receba por parâmetro todos os atributos de
pessoa. Também implemente um método que exiba as informações de uma pessoa.
Crie uma classe Aluno que é uma Pessoa. O aluno deverá ter todos os atributos de uma pessoa e
também um número de matrícula (int). Implemente um método construtor em aluno que receba todos
os atributos do aluno. Ainda na classe aluno, implemente um método que imprima todas as informações
do aluno.
Crie uma classe AlunoTeste onde (i) deverá ser criado um objeto do tipo pessoa, com suas
informações, (ii) invoque o método para imprimir as informações do objeto pessoa, (iii) deverá ser criado
um objeto aluno, com suas informações e (iv) invoque o método para imprimir as informações do objeto
aluno.*/

public class Pessoa {

	protected String nome;
	protected String nascimento;
	protected long rg;
	
	public Pessoa(String nome, String nascimento, long rg) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.rg = rg;
	}
	
	
}
