package lista01.slide;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.nome = "João";
		pessoa1.idade = 25;
		pessoa1.peso = 68.5;
		
		pessoa2.nome = "Maria";
		pessoa2.idade = 30;
		pessoa2.peso = 55.6;
		
		pessoa3.nome = "José";
		pessoa3.idade = 32;
		pessoa3.peso = 62.4;
		
		pessoa3.falar(true);
		
		pessoa2.correr();
		pessoa2.andar();
		pessoa2.falar(true);
		System.out.println(pessoa1);
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "Jonathan do js";
		funcionario1.funcao = "Engenheiro de software e Front-End";
		
		funcionario1.exibeFuncao();
		
	}
}
