package lista02.exercicio2;

/*
 * Desenvolva um sistema para controlar registros de pessoas. Cada pessoa é identificada pelo
seu nome, sexo, cpf, idade, altura e peso, e pode andar, correr, falar e dormir. Ao invocar os
métodos da pessoa, o sistema deve exibir uma mensagem da ação que está sendo feita pela
pessoa, como por exemplo: ao invocar o método correr a mensagem “<nome da pessoa> está
correndo” deve ser exibida, ao invocar o método dormir a mensagem “<nome da pessoa> está
dormindo” deve ser mostrada, entre outras. Utilize uma classe de teste para instanciar várias
pessoas, atribuir seus respectivos valores e invocar os métodos de cada uma.
*/

public class Pessoa {
	String nome, sexo, cpf;
	double idade, altura, peso;
	
	
	
	public Pessoa(String nome, String sexo, String cpf, double idade, double altura, double peso) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public void andar() {
		System.out.println(nome + " esta andando");
	}
	
	public void correr() {
		System.out.println(nome + " esta correndo");
	}
	
	public void falar() {
		System.out.println(nome + " esta falando");
	}
	
	public void dormir() {
		System.out.println(nome + " esta dormir");
	}

	@Override
	public String toString() {
		return "Pessoa nome: " + nome + ", sexo: " + sexo + ", cpf:" + cpf + ", idade: " + idade + ", altura: " + altura
				+ ", peso: " + peso;
	}
	
	
}
