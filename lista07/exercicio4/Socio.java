package lista07.exercicio4;

public class Socio extends Cliente {

	private String cpf;
	private Dependente dependente;
	
	public Socio(String nome, String dataNascimento, String telefone, Endereco endereco, String cpf,
			Dependente dependente) {
		super(nome, dataNascimento, telefone, endereco);
		this.cpf = cpf;
		this.dependente = dependente;
	}

	@Override
	public void realizarAlocacao(Cliente cliente, Filme filme, int diaAlocacao) {
		if(filme.realizarLocacaoFilme(cliente, diaAlocacao)) {
			this.filme = filme;
		}
		else {
			System.out.println("Falha na Alocação!\n");
		}
	}

	@Override
	public void realizarDevolucao(Cliente cliente, Filme filme, int diaDevolucao) {
		if(filme.realizarDevolucaoFilme(diaDevolucao)) {
			this.filme = null;
		}
		else {
			System.out.println("Falha na Devolucao!\n");
		}
		
	}

	@Override
	public String toString() {
		return "Socio [cpf=" + cpf + ", dependente=" + dependente + ", nome=" + nome + ", dataNascimento="
				+ dataNascimento + ", telefone=" + telefone + ", endereco=" + endereco + ", filme=" + filme + "]";
	}
	
	
	
	
}
