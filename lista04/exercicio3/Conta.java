package lista04.exercicio3;

/*Desenvolva um sistema para controlar as contas bancárias de um determinado banco. Cada
conta é identificada pelo seu número, titular e saldo. O titular da conta é identificado pelo seu
cpf, rg, nome, data de nascimento, sexo, renda mensal e endereço. O endereço, por sua vez,
é formado por: logradouro, número, bairro, cidade e estado. O sistema deve permitir que o
usuário possa realizar saque, depósito e emissão de saldo de uma determinada conta. Para
realizar o saque, deve-se receber o valor a ser sacado. O saque só poderá ser realizado se o
cliente tiver o valor requerido em saldo, caso contrário, deverá ser emitido uma mensagem
relatando que o mesmo não possui saldo suficiente. Para a realização do depósito, deverá
receber o valor a ser depositado, este valor será acrescentado ao saldo atual da conta. 
Por fim, a emissão de saldo deverá imprimir em tela todos os atributos da conta, inclusive do titular
da mesma, considerando também o endereço do mesmo. Para testar a aplicação, utilize uma
classe de teste a qual instanciará contas e utilizará os métodos que foram implementados*/

public class Conta {

	private int numConta;
	private Titular titular;
	private double saldo;
	
	
	public Conta(int numConta, Titular titular, double saldo) {
		super();
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//O sistema deve permitir que o usuário possa realizar saque, depósito e emissão de saldo de uma determinada conta.
	
	public void RealizarSaque(double valorSaque) {
		if(valorSaque > saldo) {
			System.out.println("Saldo indisponível. Saque não realilzado\n");
			}
		else {
			this.saldo -= valorSaque;
			System.out.println("Saque efetuado com sucesso! Novo saldo é R$" + this.saldo + "\n");
		}
	}
	
	public void RealizarDeposito(double valorDeposito) {
		this.saldo += valorDeposito;
		System.out.println("Deposito efetuado com sucesso! Novo saldo é R$" + this.saldo + "\n");
	}
	
	public void EmitirSaldo() {
		System.out.println("Conta: numConta = " + numConta + "\n" + titular + "\nSaldo = " + saldo);
	}

}
