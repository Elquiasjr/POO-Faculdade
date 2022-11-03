package lista04.exercicio1;

public class Main {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua dos Pomares", 54, "Centro", "Ponta Fina", "PR");
		Funcionario funcionario1 = new Funcionario(43654, "Felipe Mizidorio", "03/04/2003", Sexo.MASCULINO, "Cientista da Computação", "12121",endereco1);

		funcionario1.ImprimirRelatorio();
		
	}

}
