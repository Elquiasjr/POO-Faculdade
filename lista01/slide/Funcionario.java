package lista01.slide;

public class Funcionario extends Pessoa {
	String funcao;
	
	public void exibeFuncao() {
		System.out.println("Meu nome é " + this.nome + " e eu sou " + this.funcao);
	}
}
