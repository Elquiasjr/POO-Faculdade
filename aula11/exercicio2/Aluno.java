package aula11.exercicio2;

public class Aluno extends Pessoa {
	private String curso;

	public Aluno(String nome, int idade, Endereco endereco, String curso) {
		super(nome, idade, endereco);
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Pessoa: " + super.toString() + "Aluno [curso=" + curso + "]";
	}
		
}
