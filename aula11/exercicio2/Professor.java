package aula11.exercicio2;

public class Professor extends Pessoa {
	private double salario;

	public Professor(String nome, int idade, Endereco endereco, double salario) {
		super(nome, idade, endereco);
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Pessoa: " + super.toString() + "Professor [salario: " + salario;
	}	
	
}
