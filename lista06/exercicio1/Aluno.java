package lista06.exercicio1;

/*O aluno deverá ter todos os atributos de uma pessoa e
também um número de matrícula (int). Implemente um método construtor em aluno que receba todos
os atributos do aluno. Ainda na classe aluno, implemente um método que imprima todas as informações
do aluno.*/

public class Aluno extends Pessoa {

	private int numMatricula;

	public Aluno(String nome, String nascimento, long rg, int numMatricula) {
		super(nome, nascimento, rg);
		this.numMatricula = numMatricula;
	}
	
	public void imprimirInfo() {
		System.out.println("Aluno\nNome: "+ nome + "\nData de Nascimento: " + nascimento + "\nRg: " + rg + "\nNumero de matrícula: " + numMatricula + "\n" );
	}
}
