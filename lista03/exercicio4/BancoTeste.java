package lista03.exercicio4;

public class BancoTeste {
	public static void main(String[] args) {
	Banco pessoa1 = new Banco(45049, "420882-3", 100);
	
	pessoa1.realizarSaque(100);
	pessoa1.exibirSaldo();
	pessoa1.realizarSaque(1);
	pessoa1.exibirSaldo();
	pessoa1.realizarDeposito(5);
	pessoa1.exibirSaldo();
	
	System.out.println(pessoa1);
	
	}
}
