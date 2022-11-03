package lista03.exercicio4;

/*
 * 4. Um banco deseja automatizar o processo nas contas de seus clientes. Sabendo que uma
conta é formada por um número da agência, número da conta e saldo, e devem ser
inicializados no momento da criação da conta. Desenvolva um sistema para criar e realizar
transações (saque, depósito e verificação de saldo) em uma conta. Para isso, no momento da
invocação do método responsável por realizar o saque e/ou depósito, passe por parâmetro o
valor a ser sacado e/ou depositado. Sabe-se que um saque não pode ser autorizado se o
valor a ser sacado superar o valor de saldo. Além disso, o saldo não pode ser alterado de
outra maneira que não seja pelos métodos sacar e depositar.
*/

public class Banco {
	
	private int numeroAgencia;
	private String numeroConta;
	private double saldo;
	
	public Banco(int numeroAgencia, String numeroConta, double saldo){
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
		
	@Override
	public String toString() {
		return "Banco [numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta + ", saldo=" + saldo + "]";
	}

	public void realizarSaque(double valorSaque) {
		if(saldo - valorSaque < 0) {
			 System.out.println("Não foi possível realizar saque: saldo insuficiente");
		}
		else{
			saldo -= valorSaque;
		}
	}
	
	public void realizarDeposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void exibirSaldo() {
		System.out.println("Esse é o seu saldo " + saldo);
	}
	

}
