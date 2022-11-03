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

public class Endereco {
	//logradouro, número, bairro, cidade e estado
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco: logradouro = " + logradouro + ", numero = " + numero + ", bairro = " + bairro + ", cidade = " + cidade
				+ ", estado = " + estado;
	}
	
	
}
