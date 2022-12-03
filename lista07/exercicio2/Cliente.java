package lista07.exercicio2;

public class Cliente {

	private String nome;
	private String cpf;
	
	private Conta conta;

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta = new Conta();
	}
	
	public void adicionarPratoEntradaCliente(int idPrato, String nomePrato, String descIngredientes, double precoUnitario) {
		this.conta.adicionarPratoEntrada(idPrato, nomePrato, descIngredientes, precoUnitario);
	}
	
	public void adicionarPratoPrincipalCliente(int idPrato, String nomePrato, String descIngredientes, double precoUnitario) {
		this.conta.adicionarPratoPrincipal(idPrato, nomePrato, descIngredientes, precoUnitario);
	}
	
	public void adicionarSobremesaCliente(int idPrato, String nomePrato, String descIngredientes, double precoUnitario) {
		this.conta.adicionarSobremesa(idPrato, nomePrato, descIngredientes, precoUnitario);
	}

	public void fecharConta() {
		System.out.println("Cliente - Nome: " + nome + "\nCPF: " + cpf);
		conta.imprimirPratos();
		System.out.println("O total calculado foi: " + conta.calcularTotalCliente());
	}

	
}
