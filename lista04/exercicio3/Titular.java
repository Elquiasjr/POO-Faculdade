package lista04.exercicio3;

/*Desenvolva um sistema para controlar as contas bancárias de um determinado banco. Cada
conta é identificada pelo seu número, titular e saldo. O titular da conta é identificado pelo seu
cpf, rg, nome, data de nascimento, sexo, renda mensal e endereço. O endereço, por sua vez,
é formado por: logradouro, número, bairro, cidade e estado. O sistema deve permitir que o
usuário possa realizar saque, depósito e emissão de saldo de uma determinada conta. Para
realizar o saque, deve-se receber o valor a ser sacado. O saque só poderá ser realizado se o
cliente tiver o valor requerido em saldo, caso contrário, deverá ser emitido uma mensagem
relatando que o mesmo não possui saldo suficiente. Para a realização do depósito, deverá
receber o valor a ser depositado, este valor será acrescentado ao saldo atual da conta. Por
fim, a emissão de saldo deverá imprimir em tela todos os atributos da conta, inclusive do titular
da mesma, considerando também o endereço do mesmo. Para testar a aplicação, utilize uma
classe de teste a qual instanciará contas e utilizará os métodos que foram implementados*/

public class Titular {

	private String cpf;
	private int rg;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private double rendaMensal;
	private Endereco endereco;
	
	
	public Titular(String cpf, int rg, String nome, String dataNascimento, String sexo, double rendaMensal,
			Endereco endereco) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.rendaMensal = rendaMensal;
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Titular: cpf = " + cpf + ", rg = " + rg + ", nome = " + nome + ", Data de Nascimento = " + dataNascimento
				+ ", sexo = " + sexo + ", rendaMensal = " + rendaMensal + "\n" + endereco;
	}
	
	
}
