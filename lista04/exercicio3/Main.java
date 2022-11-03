package lista04.exercicio3;

public class Main {
	
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua das bolhas", 55, "Jagutipagua", "Tefé", "Pará");
		Titular titular1 = new Titular("483271345-1", 2212343, "Roberto Alves Costa", "9/10/1998", "Masculino", 2000, endereco1);
		Conta conta1 = new Conta(1, titular1, 500);
		
		conta1.RealizarSaque(1000);
		conta1.RealizarSaque(500);
		conta1.RealizarDeposito(10000);
		conta1.EmitirSaldo();
	}
}
