package lista04.exercicio1;

/*
 * Uma empresa precisa automatizar o processo de cadastro de seus funcionários. Desenvolva
uma aplicação que realiza o processo de cadastro, sabendo que um funcionário possui seu
número de registro, nome completo, data de nascimento, sexo, setor em que trabalha,
telefone e endereço. O endereço é formado pelo logradouro, número, bairro, cidade e unidade
federativa. Deve ser possível emitir um relatório com os dados do funcionário, inclusive o
endereço. Utilize uma classe de teste para instanciar os funcionários, bem como atribuir
valores aos seus dados e invocar os métodos a fim de testá-los.*/

public class Funcionario {
	
	private int numRegistro;
	private String nome;
	private String dataNascimento;
	private Sexo sexo;
	private String setorTrabalha;
	private String numTelefone;
	private Endereco endereco;
	
	
	
	
	Funcionario(int numRegistro, String nome, String dataNascimento, Sexo sexo, String setorTrabalha,
			String numTelefone, Endereco endereco) {
		this.numRegistro = numRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setorTrabalha = setorTrabalha;
		this.numTelefone = numTelefone;
		this.endereco = endereco;
	}


	public void ImprimirRelatorio() {
		System.out.println("numRegistro: " + numRegistro + ", nome: " + nome + "\ndataNascimento: " + dataNascimento
				+ ", sexo: " + sexo.GetSexo() + ", setorTrabalha: " + setorTrabalha + "\nnumTelefone: " + numTelefone + ", endereco: "
				+ endereco);
	}
}
