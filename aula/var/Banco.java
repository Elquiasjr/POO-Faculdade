package aula.var;

import java.util.*;


/*Um conta bancária é identificada pelo seu número da
conta, agência, nome do titular e saldo. Sabe-se que o
número de conta é único, de seis dígitos e não
sequencial. Desenvolva um sistema que, além destes
dados, também armazene o número total de conta
existentes no sistema*/

public class Banco {
	int numeroConta;
	int numeroAgencia;
	String nome;
	int saldo;
	static List<Integer> contas = new ArrayList<Integer>();
	
	public Banco() {
		
	}
	
public void realizarTriagem(int numeroConta, int numeroAgencia, String nome, int saldo) {
		
		
	}
	
	public Banco(int numeroConta, int numeroAgencia, String nome, int saldo) {
		
		contas.add(numeroConta);
		this.numeroAgencia = numeroAgencia;
		this.nome = nome;
		this.saldo = saldo;
		
	}
	
	public boolean verificarExistencia(int numeroConta) {
		for(int i = 0; i < contas.size(); i++) {
			if(contas.get(i) == numeroConta) {
				return true;
			}
		}
		return false;
	}
}
