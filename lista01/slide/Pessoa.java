package lista01.slide;

public class Pessoa {
	String nome, sexo;
	int idade, cpf;
	double peso, altura;
	
	
	public void andar() {
		System.out.println(this.nome + " está andando");
	}
	
	public void correr() {
		System.out.println(this.nome + " está correndo");
	}

	
	public void falar(boolean showAge) {
		System.out.println("Olá meu nome é " + this.nome + (showAge ? " e minha idade é " + this.idade : ""));
		System.out.println(this.nome + " está falando");
	}
	
	public void falar() {
		System.out.println("Olá meu nome é " + this.nome);
	}

	public void dormir() {
		
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", cpf=" + cpf + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	
	
}
