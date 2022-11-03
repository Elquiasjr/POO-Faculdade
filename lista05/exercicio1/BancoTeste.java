package lista05.exercicio1;

public class BancoTeste {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Elias Costa", "1223211-9");
		Cliente cliente2 = new Cliente("Murilo Monteiro", "5423121-x");
		
		Conta conta1 = new Conta(cliente1, 500, 1);
		Conta conta2 = new Conta(cliente2, 100, 2);
		
		Banco bancoBrasil = new Banco();
		
		bancoBrasil.adicionarConta(conta1);
		bancoBrasil.adicionarConta(conta2);
		
		bancoBrasil.realizarDeposito(1, 100);
		bancoBrasil.realizarSaque(2, 200);
		
		bancoBrasil.verificarSaldo(1);
		bancoBrasil.verificarSaldo(2);
		
	}

}
