package lista05.exercicio1;

import java.util.ArrayList;
import java.util.List;

/*Desenvolva um sistema bancário. O Banco possui Contas. Cada conta é identificada por seu número
correspondente e seu saldo. Além disso, a conta contém um cliente titular da mesma que é identificado
por seu nome e CPF. Neste sistema será possível realizar saques, depósitos e verificação de saldo em
contas específicas. Porém, só poderá ser realizado qualquer manipulação das contas (verificação de
saldo, realização de saque ou depósito) por meio da classe Banco, pois a mesma é detentora das
contas. 

Para realizar o saque é necessário enviar ao método o número da conta e o valor a ser sacado.
Só será possível efetivar o saque se o saldo da conta for suficiente, ou seja, ao efetuar o saque o saldo
não pode ficar negativo. Para efetuar um depósito, se deve ter conhecimento do número da conta e o
valor a ser depositado na conta. O valor é então somado ao saldo atual. Para realizar a verificação de
saldo, deve ter conhecimento do número da conta, o método deve buscar a conta requerida e imprimir
em tela o saldo atual da conta. Para realizar a inicialização do banco, fazer saques, depósitos e
verificação de saldo, utilize a classe BancoTeste.class.*/

public class Banco {

	private List<Conta> contas = new ArrayList<Conta>();
	
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void realizarSaque(int idConta, double valorSaque){
		for(Conta conta : contas) {
			if(conta.getIdConta() == idConta) {
			if(conta.getSaldo() > valorSaque) {
				conta.setSaldo(conta.getSaldo()-valorSaque);
				return;
			}
			else {
				System.out.println("Saque não realizado, pois seu saldo é insuficiente\n");
				return;
			}
		}
			
		}
		System.out.println("Conta não encontrada\n");
	}
	
	public void realizarDeposito(int idConta, double valorDeposito){
		for(Conta conta : contas) {
			if(conta.getIdConta() == idConta) {
				conta.setSaldo(conta.getSaldo()+valorDeposito);
				return;
		}
		}
		System.out.println("Conta não encontrada\n");
	}
	
	public void verificarSaldo(int idConta){
		for(Conta conta : contas) {
			if(conta.getIdConta() == idConta) {
				System.out.println("Banco [contas=" + conta + "]");
				return;
		}
		}
		System.out.println("Conta não encontrada\n");
	}
}
		

